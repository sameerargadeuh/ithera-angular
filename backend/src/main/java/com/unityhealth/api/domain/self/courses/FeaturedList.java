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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblfeaturedlist")

public class FeaturedList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "vName")
    private String vName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bActive")
    private int bActive;
    @ManyToMany(mappedBy = "featuredList")
    private Set<Courses> courses;

    public FeaturedList() {
    }

    public FeaturedList(Integer iID) {
        this.iID = iID;
    }

    public FeaturedList(Integer iID, String vName, int bActive) {
        this.iID = iID;
        this.vName = vName;
        this.bActive = bActive;
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

    public int getBActive() {
        return bActive;
    }

    public void setBActive(int bActive) {
        this.bActive = bActive;
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
        if (!(object instanceof FeaturedList)) {
            return false;
        }
        FeaturedList other = (FeaturedList) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.courses.FeaturedList[ iID=" + iID + " ]";
    }

    public Set<Courses> getCourses() {
        return courses;
    }

    public void setCourses(Set<Courses> courses) {
        this.courses = courses;
    }
    
}
