/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.courses;

import com.unityhealth.api.domain.self.company.Company;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblbrand")
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="iCompanyID")
    //private Integer iCompanyID; 
    private Company company; 
    @Size(max = 255)
    @Column(name = "vName")
    private String vName;
    @Size(max = 255)
    @Column(name = "vSearch")
    private String vSearch;
    @Size(max = 255)
    @Column(name = "vFieldForceName")
    private String vFieldForceName;
    @Column(name = "bActive")
    private Integer bActive;
    @Size(max = 255)
    @Column(name = "vDivision")
    private String vDivision;

    public Brand() {
    }

    public Brand(Integer iID) {
        this.iID = iID;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

//    public Integer getICompanyID() {
//        return iCompanyID;
//    }
//
//    public void setICompanyID(Integer iCompanyID) {
//        this.iCompanyID = iCompanyID;
//    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

    public String getVSearch() {
        return vSearch;
    }

    public void setVSearch(String vSearch) {
        this.vSearch = vSearch;
    }

    public String getVFieldForceName() {
        return vFieldForceName;
    }

    public void setVFieldForceName(String vFieldForceName) {
        this.vFieldForceName = vFieldForceName;
    }

    public Integer getBActive() {
        return bActive;
    }

    public void setBActive(Integer bActive) {
        this.bActive = bActive;
    }

    public String getVDivision() {
        return vDivision;
    }

    public void setVDivision(String vDivision) {
        this.vDivision = vDivision;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iID != null ? iID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Brand)) {
            return false;
        }
        Brand other = (Brand) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.courses.Brand[ iID=" + iID + " ]";
    }

    /**
     * @return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
    }
    
}
