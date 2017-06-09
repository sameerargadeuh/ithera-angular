/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.accountstore;

/**
 *
 * @author Tabish
 */
public class AccountStoreDto {
    

    private Integer iID;

    private Integer accountID;

    private Integer storeID;
    
    private Integer groupID;

    
    
    private Integer storeCount;


    public Integer getiID() {
        return iID;
    }

    public void setiID(Integer iID) {
        this.iID = iID;
    }
    
    
    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }
    
    public Integer getStoreCount() {
        return storeCount;
    }

    public void setStoreCount(Integer storeCount) {
        this.storeCount = storeCount;
    }
    
}
