/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.brand;

/**
 *
 * @author Sameer S Argade
 */
public class BrandDto {

    private Integer iID;
    private String vName;

    public Integer getiID() {
        return iID;
    }

    public void setiID(Integer iID) {
        this.iID = iID;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

}
