package com.unityhealth.api.domain.self.accountStore;

import com.unityhealth.api.domain.self.account.Account;
import com.unityhealth.api.domain.self.store.Store;

import javax.persistence.*;

/**
 * Created by shanefox on 24/10/2016.
 */
@Entity
@Table(name = "tblaccountstores")
public class AccountStore {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "iID")
    private Integer iID;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="iUserID")
    private Account account;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="iStoreID")
    private Store store;

    @Transient
    private Integer storeCount;
    

    public Integer getiID() {
        return iID;
    }

    public void setiID(Integer iID) {
        this.iID = iID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
    
     public Integer getStoreCount() {
        return storeCount;
    }

    public void setStoreCount(Integer storeCount) {
        this.storeCount = storeCount;
    }

    
}
