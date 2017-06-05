/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.courses;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblsection")
public class Section implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Size(max = 255)
    @Column(name = "vName")
    private String vName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bVisible")
    private int bVisible;
    @ManyToMany(mappedBy = "section")
    private Set<Courses> courses;

    public Section() {
    }

    public Section(Integer iID) {
        this.iID = iID;
    }

    public Section(Integer iID, int bVisible) {
        this.iID = iID;
        this.bVisible = bVisible;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

    public int getBVisible() {
        return bVisible;
    }

    public void setBVisible(int bVisible) {
        this.bVisible = bVisible;
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
        if (!(object instanceof Section)) {
            return false;
        }
        Section other = (Section) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.courses.Section[ iID=" + iID + " ]";
    }
    
}
