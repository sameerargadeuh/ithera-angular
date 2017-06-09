package com.unityhealth.api.domain.self.account;

import com.unityhealth.api.domain.self.accountStore.AccountStore;
import com.unityhealth.api.domain.self.group.Group;
import com.unityhealth.api.domain.self.store.Store;
import java.io.Serializable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.hibernate.annotations.Where;

/**
 * Created by shanefox on 10/10/2016.
 */
@Entity
@Table(name = "tblaccount")
public class Account implements Serializable {

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

    /*@OneToMany(fetch = FetchType.EAGER, mappedBy = "account", cascade=CascadeType.ALL)
    private Set<AccountStore> accountStores;*/
    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="iStoreID", columnDefinition = "INT(11) UNSIGNED")
    @Where(clause = "iStoreID != -1")
    private Store store;
    
    @Column(name = "vProfession", length = 32)
    private String profesion;
    
    @Column(name = "bSherpaOptIn")
    private Integer sherpaOptIn;
    
    @Column (name = "vUserType")
    private String userType;
    
    @Column (name = "vStatus", length= 255)
    private String userStatus;
    
    @Column (name = "iBreezeUserID")
    private Integer breezeID;


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
    
   /* public Set<AccountStore> getAccountStores() {
        return accountStores;
    }

    public void setAccountStores(Set<AccountStore> accountStores) {
        this.accountStores = accountStores;
    }*/

    public List<Group> getGroups() {
        ArrayList<Group> groups = new ArrayList<>();
      
            groups.add(store.getGroup());
        
        return groups;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Integer getSherpaOptIn() {
        return sherpaOptIn;
    }

    public void setSherpaOptIn(Integer sherpaOptIn) {
        this.sherpaOptIn = sherpaOptIn;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
    
        public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
     public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    
    public Integer getBreezeID() {
        return breezeID;
    }

    public void setBreezeID(Integer breezeID) {
        this.breezeID = breezeID;
    }
  
}
