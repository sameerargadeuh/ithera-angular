/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.banners;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblslideshowbanners")
public class SlideShowBanner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Column(name = "iSlideshowID")
    private Integer iSlideshowID;
    @Column(name = "iBannerID")
    private Integer iBannerID;

    public SlideShowBanner() {
    }

    public SlideShowBanner(Integer iID) {
        this.iID = iID;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public Integer getISlideshowID() {
        return iSlideshowID;
    }

    public void setISlideshowID(Integer iSlideshowID) {
        this.iSlideshowID = iSlideshowID;
    }

    public Integer getIBannerID() {
        return iBannerID;
    }

    public void setIBannerID(Integer iBannerID) {
        this.iBannerID = iBannerID;
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
        if (!(object instanceof SlideShowBanner)) {
            return false;
        }
        SlideShowBanner other = (SlideShowBanner) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.store.SlideShowBanner[ iID=" + iID + " ]";
    }
    
}
