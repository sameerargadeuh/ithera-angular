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

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblbanner")
public class Banner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "vComment")
    private String vComment;
    @Size(max = 255)
    @Column(name = "vImgSrc")
    private String vImgSrc;
    @Size(max = 255)
    @Column(name = "vLogoImage")
    private String vLogoImage;
    @Size(max = 255)
    @Column(name = "vImage")
    private String vImage;
    @Column(name = "iTimer")
    private Integer iTimer;
    @Size(max = 255)
    @Column(name = "vLink")
    private String vLink;
    @Column(name = "iContentX")
    private Integer iContentX;
    @Column(name = "iContentY")
    private Integer iContentY;
    @Size(max = 255)
    @Column(name = "vContentAlign")
    private String vContentAlign;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "vContentTxt")
    private String vContentTxt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bActive")
    private int bActive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtDateStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtDateStart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtDateEnd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtDateEnd;
    @Size(max = 255)
    @Column(name = "vPlacementLogo")
    private String vPlacementLogo;
    @Size(max = 255)
    @Column(name = "vPlacementContent")
    private String vPlacementContent;
    @Size(max = 255)
    @Column(name = "vPlacementLink")
    private String vPlacementLink;
    @Size(max = 255)
    @Column(name = "vPlacementProduct")
    private String vPlacementProduct;
    @Size(max = 255)
    @Column(name = "vPlacementPoints")
    private String vPlacementPoints;
    @Column(name = "iPoints")
    private Integer iPoints;
    
    @ManyToMany(mappedBy = "banners")
    private Set<SlideShow> slideshows;

    public Set<SlideShow> getSlideshows() {
        return slideshows;
    }

    public void setSlideshows(Set<SlideShow> slideshows) {
        this.slideshows = slideshows;
    }

    public Banner() {
    }

    public Banner(Integer iID) {
        this.iID = iID;
    }

    public Banner(Integer iID, String vComment, int bActive, Date dtDateStart, Date dtDateEnd) {
        this.iID = iID;
        this.vComment = vComment;
        this.bActive = bActive;
        this.dtDateStart = dtDateStart;
        this.dtDateEnd = dtDateEnd;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public String getVComment() {
        return vComment;
    }

    public void setVComment(String vComment) {
        this.vComment = vComment;
    }

    public String getVImgSrc() {
        return vImgSrc;
    }

    public void setVImgSrc(String vImgSrc) {
        this.vImgSrc = vImgSrc;
    }

    public String getVLogoImage() {
        return vLogoImage;
    }

    public void setVLogoImage(String vLogoImage) {
        this.vLogoImage = vLogoImage;
    }

    public String getVImage() {
        return vImage;
    }

    public void setVImage(String vImage) {
        this.vImage = vImage;
    }

    public Integer getITimer() {
        return iTimer;
    }

    public void setITimer(Integer iTimer) {
        this.iTimer = iTimer;
    }

    public String getVLink() {
        return vLink;
    }

    public void setVLink(String vLink) {
        this.vLink = vLink;
    }

    public Integer getIContentX() {
        return iContentX;
    }

    public void setIContentX(Integer iContentX) {
        this.iContentX = iContentX;
    }

    public Integer getIContentY() {
        return iContentY;
    }

    public void setIContentY(Integer iContentY) {
        this.iContentY = iContentY;
    }

    public String getVContentAlign() {
        return vContentAlign;
    }

    public void setVContentAlign(String vContentAlign) {
        this.vContentAlign = vContentAlign;
    }

    public String getVContentTxt() {
        return vContentTxt;
    }

    public void setVContentTxt(String vContentTxt) {
        this.vContentTxt = vContentTxt;
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

    public String getVPlacementLogo() {
        return vPlacementLogo;
    }

    public void setVPlacementLogo(String vPlacementLogo) {
        this.vPlacementLogo = vPlacementLogo;
    }

    public String getVPlacementContent() {
        return vPlacementContent;
    }

    public void setVPlacementContent(String vPlacementContent) {
        this.vPlacementContent = vPlacementContent;
    }

    public String getVPlacementLink() {
        return vPlacementLink;
    }

    public void setVPlacementLink(String vPlacementLink) {
        this.vPlacementLink = vPlacementLink;
    }

    public String getVPlacementProduct() {
        return vPlacementProduct;
    }

    public void setVPlacementProduct(String vPlacementProduct) {
        this.vPlacementProduct = vPlacementProduct;
    }

    public String getVPlacementPoints() {
        return vPlacementPoints;
    }

    public void setVPlacementPoints(String vPlacementPoints) {
        this.vPlacementPoints = vPlacementPoints;
    }

    public Integer getIPoints() {
        return iPoints;
    }

    public void setIPoints(Integer iPoints) {
        this.iPoints = iPoints;
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
        if (!(object instanceof Banner)) {
            return false;
        }
        Banner other = (Banner) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.store.Banner[ iID=" + iID + " ]";
    }
    
}
