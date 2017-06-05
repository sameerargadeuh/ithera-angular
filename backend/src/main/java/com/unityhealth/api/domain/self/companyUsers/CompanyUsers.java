package com.unityhealth.api.domain.self.companyUsers;

import com.unityhealth.api.domain.self.accountStore.AccountStore;
import com.unityhealth.api.domain.self.group.Group;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by shanefox on 10/10/2016.
 */
@Entity
@Table(name = "tblcompanyusers")
public class CompanyUsers {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "iID")
    private Integer id;

    @Column(name = "vUsername", length = 255)
    private String username;

    @Column(name = "vEmail", length = 255)
    private String email;

    @Column(name = "vPassword", length = 255)
    private String password;

    @Column(name = "vPasswordSalt", length = 255)
    private String salt;
    @Column(name="bSherpaSurveyTaken")
    private Integer sherpaSurveyTaken;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "account", cascade=CascadeType.ALL)
    private Set<AccountStore> accountStores;
    /*@Column(name = "vProfession", length = 32)
    private String proffesion;*/
    
    @Column(name = "bSherpaOptIn")
    private Integer sherpaOptIn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Set<AccountStore> getAccountStores() {
        return accountStores;
    }

    public void setAccountStores(Set<AccountStore> accountStores) {
        this.accountStores = accountStores;
    }

    public List<Group> getGroups() {
        ArrayList<Group> groups = new ArrayList<>(accountStores.size());
        for (AccountStore accountStore : accountStores) {
            groups.add(accountStore.getStore().getGroup());
        }
        return groups;
    }

   /* public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }*/

    public Integer getSherpaOptIn() {
        return sherpaOptIn;
    }

    public void setSherpaOptIn(Integer sherpaOptIn) {
        this.sherpaOptIn = sherpaOptIn;
    }
     public Integer getSherpaSurveyTaken() {
        return sherpaSurveyTaken;
    }

    public void setSherpaSurveyTaken(Integer sherpaSurveyTaken) {
        this.sherpaSurveyTaken = sherpaSurveyTaken;
    }
}
