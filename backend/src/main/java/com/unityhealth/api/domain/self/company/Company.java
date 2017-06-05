/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.company;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblcompanies")
@XmlRootElement
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Column(name = "iOldID")
    private Integer iOldID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bActive")
    private int bActive;
    @Column(name = "iAccountTypeID")
    private Integer iAccountTypeID;
    @Column(name = "iBreezeGroupID")
    private Integer iBreezeGroupID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "vName")
    private String vName;
    @Size(max = 255)
    @Column(name = "vNameFull")
    private String vNameFull;
    @Size(max = 255)
    @Column(name = "vParentCompany")
    private String vParentCompany;
    @Size(max = 255)
    @Column(name = "vRegNumber1")
    private String vRegNumber1;
    @Size(max = 255)
    @Column(name = "vRegNumber2")
    private String vRegNumber2;
    @Size(max = 255)
    @Column(name = "vStockCode")
    private String vStockCode;
    @Size(max = 512)
    @Column(name = "vAddress")
    private String vAddress;
    @Size(max = 255)
    @Column(name = "vWebsite")
    private String vWebsite;
    @Size(max = 512)
    @Column(name = "vEmail")
    private String vEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bFeePerActivity")
    private int bFeePerActivity;
    @Column(name = "dtContractSigned")
    @Temporal(TemporalType.DATE)
    private Date dtContractSigned;
    @Column(name = "dtContractStart")
    @Temporal(TemporalType.DATE)
    private Date dtContractStart;
    @Column(name = "dtContractEnd")
    @Temporal(TemporalType.DATE)
    private Date dtContractEnd;
    @Size(max = 32)
    @Column(name = "vCompletionType")
    private String vCompletionType;
    @Column(name = "iCompletionCap")
    private Integer iCompletionCap;
    @Column(name = "iAmountPrepaid")
    private Integer iAmountPrepaid;
    @Column(name = "iAmountCap")
    private Integer iAmountCap;
    @Lob
    @Size(max = 65535)
    @Column(name = "vContractNotes")
    private String vContractNotes;
    @Size(max = 16)
    @Column(name = "vColour")
    private String vColour;
    @Lob
    @Size(max = 65535)
    @Column(name = "vSponsorPageContent")
    private String vSponsorPageContent;
    @Size(max = 512)
    @Column(name = "vSponsorPageBannerLink")
    private String vSponsorPageBannerLink;
    @Column(name = "bSponsor")
    private Integer bSponsor;
    @Size(max = 256)
    @Column(name = "vSponsorLink")
    private String vSponsorLink;
    @Size(max = 256)
    @Column(name = "vSponsorLogo")
    private String vSponsorLogo;

    public Company() {
    }

    public Company(Integer iID) {
        this.iID = iID;
    }

    public Company(Integer iID, int bActive, String vName, int bFeePerActivity) {
        this.iID = iID;
        this.bActive = bActive;
        this.vName = vName;
        this.bFeePerActivity = bFeePerActivity;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public Integer getIOldID() {
        return iOldID;
    }

    public void setIOldID(Integer iOldID) {
        this.iOldID = iOldID;
    }

    public int getBActive() {
        return bActive;
    }

    public void setBActive(int bActive) {
        this.bActive = bActive;
    }

    public Integer getIAccountTypeID() {
        return iAccountTypeID;
    }

    public void setIAccountTypeID(Integer iAccountTypeID) {
        this.iAccountTypeID = iAccountTypeID;
    }

    public Integer getIBreezeGroupID() {
        return iBreezeGroupID;
    }

    public void setIBreezeGroupID(Integer iBreezeGroupID) {
        this.iBreezeGroupID = iBreezeGroupID;
    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

    public String getVNameFull() {
        return vNameFull;
    }

    public void setVNameFull(String vNameFull) {
        this.vNameFull = vNameFull;
    }

    public String getVParentCompany() {
        return vParentCompany;
    }

    public void setVParentCompany(String vParentCompany) {
        this.vParentCompany = vParentCompany;
    }

    public String getVRegNumber1() {
        return vRegNumber1;
    }

    public void setVRegNumber1(String vRegNumber1) {
        this.vRegNumber1 = vRegNumber1;
    }

    public String getVRegNumber2() {
        return vRegNumber2;
    }

    public void setVRegNumber2(String vRegNumber2) {
        this.vRegNumber2 = vRegNumber2;
    }

    public String getVStockCode() {
        return vStockCode;
    }

    public void setVStockCode(String vStockCode) {
        this.vStockCode = vStockCode;
    }

    public String getVAddress() {
        return vAddress;
    }

    public void setVAddress(String vAddress) {
        this.vAddress = vAddress;
    }

    public String getVWebsite() {
        return vWebsite;
    }

    public void setVWebsite(String vWebsite) {
        this.vWebsite = vWebsite;
    }

    public String getVEmail() {
        return vEmail;
    }

    public void setVEmail(String vEmail) {
        this.vEmail = vEmail;
    }

    public int getBFeePerActivity() {
        return bFeePerActivity;
    }

    public void setBFeePerActivity(int bFeePerActivity) {
        this.bFeePerActivity = bFeePerActivity;
    }

    public Date getDtContractSigned() {
        return dtContractSigned;
    }

    public void setDtContractSigned(Date dtContractSigned) {
        this.dtContractSigned = dtContractSigned;
    }

    public Date getDtContractStart() {
        return dtContractStart;
    }

    public void setDtContractStart(Date dtContractStart) {
        this.dtContractStart = dtContractStart;
    }

    public Date getDtContractEnd() {
        return dtContractEnd;
    }

    public void setDtContractEnd(Date dtContractEnd) {
        this.dtContractEnd = dtContractEnd;
    }

    public String getVCompletionType() {
        return vCompletionType;
    }

    public void setVCompletionType(String vCompletionType) {
        this.vCompletionType = vCompletionType;
    }

    public Integer getICompletionCap() {
        return iCompletionCap;
    }

    public void setICompletionCap(Integer iCompletionCap) {
        this.iCompletionCap = iCompletionCap;
    }

    public Integer getIAmountPrepaid() {
        return iAmountPrepaid;
    }

    public void setIAmountPrepaid(Integer iAmountPrepaid) {
        this.iAmountPrepaid = iAmountPrepaid;
    }

    public Integer getIAmountCap() {
        return iAmountCap;
    }

    public void setIAmountCap(Integer iAmountCap) {
        this.iAmountCap = iAmountCap;
    }

    public String getVContractNotes() {
        return vContractNotes;
    }

    public void setVContractNotes(String vContractNotes) {
        this.vContractNotes = vContractNotes;
    }

    public String getVColour() {
        return vColour;
    }

    public void setVColour(String vColour) {
        this.vColour = vColour;
    }

    public String getVSponsorPageContent() {
        return vSponsorPageContent;
    }

    public void setVSponsorPageContent(String vSponsorPageContent) {
        this.vSponsorPageContent = vSponsorPageContent;
    }

    public String getVSponsorPageBannerLink() {
        return vSponsorPageBannerLink;
    }

    public void setVSponsorPageBannerLink(String vSponsorPageBannerLink) {
        this.vSponsorPageBannerLink = vSponsorPageBannerLink;
    }

    public Integer getBSponsor() {
        return bSponsor;
    }

    public void setBSponsor(Integer bSponsor) {
        this.bSponsor = bSponsor;
    }

    public String getVSponsorLink() {
        return vSponsorLink;
    }

    public void setVSponsorLink(String vSponsorLink) {
        this.vSponsorLink = vSponsorLink;
    }

    public String getVSponsorLogo() {
        return vSponsorLogo;
    }

    public void setVSponsorLogo(String vSponsorLogo) {
        this.vSponsorLogo = vSponsorLogo;
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
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.company.Company[ iID=" + iID + " ]";
    }
    
}
