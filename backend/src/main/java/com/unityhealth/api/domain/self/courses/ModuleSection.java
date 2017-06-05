/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.courses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblmodulesection")
public class ModuleSection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Column(name = "iModuleID")
    private Integer iModuleID;
    @Column(name = "iSectionID")
    private Integer iSectionID;

    public ModuleSection() {
    }

    public ModuleSection(Integer iID) {
        this.iID = iID;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public Integer getIModuleID() {
        return iModuleID;
    }

    public void setIModuleID(Integer iModuleID) {
        this.iModuleID = iModuleID;
    }

    public Integer getISectionID() {
        return iSectionID;
    }

    public void setISectionID(Integer iSectionID) {
        this.iSectionID = iSectionID;
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
        if (!(object instanceof ModuleSection)) {
            return false;
        }
        ModuleSection other = (ModuleSection) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.courses.ModuleSection[ iID=" + iID + " ]";
    }
    
}
