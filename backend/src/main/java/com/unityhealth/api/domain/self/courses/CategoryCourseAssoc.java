/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.courses;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblcategorycourseassoc")
@XmlRootElement

public class CategoryCourseAssoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Column(name = "iCatID")
    private Integer iCatID;
    @Column(name = "iCourseID")
    private Integer iCourseID;

    public CategoryCourseAssoc() {
    }

    public CategoryCourseAssoc(Integer iID) {
        this.iID = iID;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public Integer getICatID() {
        return iCatID;
    }

    public void setICatID(Integer iCatID) {
        this.iCatID = iCatID;
    }

    public Integer getICourseID() {
        return iCourseID;
    }

    public void setICourseID(Integer iCourseID) {
        this.iCourseID = iCourseID;
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
        if (!(object instanceof CategoryCourseAssoc)) {
            return false;
        }
        CategoryCourseAssoc other = (CategoryCourseAssoc) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.company.CategoryCourseAssoc[ iID=" + iID + " ]";
    }
    
}
