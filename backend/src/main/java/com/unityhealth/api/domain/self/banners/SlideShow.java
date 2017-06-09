/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.banners;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Where;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblslideshow")
public class SlideShow implements Serializable {

    /**
     * @return the banners
     */
    public Set<Banner> getBanners() {
        return banners;
    }

    /**
     * @param banners the banners to set
     */
    public void setBanners(Set<Banner> banners) {
        this.banners = banners;
    }

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
    @Column(name = "dtDateStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtDateStart;
    @Column(name = "dtDateEnd")
    @Temporal(TemporalType.TIMESTAMP)
    @Where(clause="dtDateEnd > CURRENT_DATE")
    private Date dtDateEnd;
    @Column(name = "bRandom")
    private Integer bRandom;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tblslideshowbanners", joinColumns = @JoinColumn(name = "iSlideshowID", referencedColumnName = "iID"), inverseJoinColumns = @JoinColumn(name = "iBannerID", referencedColumnName = "iID"))
    private Set<Banner> banners;
    

    public SlideShow() {
    }

    public SlideShow(Integer iID) {
        this.iID = iID;
    }

    public SlideShow(Integer iID, String vName, int bActive) {
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

    public Date getDtDateStart() {
        return dtDateStart;
    }

    public void setDtDateStart(Date dtDateStart) {
        this.dtDateStart = dtDateStart;
    }

    public Date getDtDateEnd() {
        return dtDateEnd;
    }

    public void setDtDateEnd(Date dtDateEnd) {
        this.dtDateEnd = dtDateEnd;
    }

    public Integer getBRandom() {
        return bRandom;
    }

    public void setBRandom(Integer bRandom) {
        this.bRandom = bRandom;
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
        if (!(object instanceof SlideShow)) {
            return false;
        }
        SlideShow other = (SlideShow) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.store.SlideShow[ iID=" + iID + " ]";
    }
    
}
