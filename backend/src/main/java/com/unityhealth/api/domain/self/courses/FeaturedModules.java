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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblfeaturedmodules")
public class FeaturedModules implements Serializable {

    /**
     * @return the featuredList
     */
//    public FeaturedList getFeaturedList() {
//        return featuredList;
//    }
//
//    /**
//     * @param featuredList the featuredList to set
//     */
//    public void setFeaturedList(FeaturedList featuredList) {
//        this.featuredList = featuredList;
//    }

    /**
     * @return the courses
     */
//    public Courses getCourses() {
//        return courses;
//    }
//
//    /**
//     * @param courses the courses to set
//     */
//    public void setCourses(Courses courses) {
//        this.courses = courses;
//    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
//    @ManyToOne
//     @Fetch(FetchMode.JOIN)
//    @JoinColumn(name="iModuleID")
//    private Courses courses;
    @Column(name = "iModuleID")
    private Integer iModuleID;
    @Column(name = "iOrder")
    private Integer iOrder;
//     @ManyToOne
//    @JoinColumn(name="iFeaturedID")
//      @Fetch(FetchMode.JOIN)
//     private FeaturedList featuredList;
  @Column(name = "iFeaturedID")
    private Integer iFeaturedID;

    public FeaturedModules() {
    }

    public FeaturedModules(Integer iID) {
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

    public Integer getIOrder() {
        return iOrder;
    }

    public void setIOrder(Integer iOrder) {
        this.iOrder = iOrder;
    }

    public Integer getIFeaturedID() {
        return iFeaturedID;
    }

    public void setIFeaturedID(Integer iFeaturedID) {
        this.iFeaturedID = iFeaturedID;
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
        if (!(object instanceof FeaturedModules)) {
            return false;
        }
        FeaturedModules other = (FeaturedModules) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.courses.FeaturedModules[ iID=" + iID + " ]";
    }
    
}
