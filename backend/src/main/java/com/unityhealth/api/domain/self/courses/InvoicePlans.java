/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.courses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblinvoiceplans")
public class InvoicePlans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bActive")
    private int bActive;
    @Column(name = "dtStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtStart;
    @Column(name = "dtEnd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtEnd;
    @Column(name = "iCompanyID")
    private Integer iCompanyID;
    @Basic(optional = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iModuleID",referencedColumnName = "iCourseID")
    private Courses courses;
     //private int iModuleID;
    @Size(max = 255)
    @Column(name = "vModuleName")
    private String vModuleName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iActualComplete")
    private int iActualComplete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iActualReview")
    private int iActualReview;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iActualCta")
    private int iActualCta;
    @Column(name = "dtTier1Expired")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtTier1Expired;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iPriceCompleteTier1")
    private int iPriceCompleteTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iPriceReviewTier1")
    private int iPriceReviewTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iPriceCtaTier1")
    private int iPriceCtaTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iPointsTier1")
    private int iPointsTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iQuotaMinTier1")
    private int iQuotaMinTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iQuotaMaxTier1")
    private int iQuotaMaxTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iReviewMinTier1")
    private int iReviewMinTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iReviewMaxTier1")
    private int iReviewMaxTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iCtaMinTier1")
    private int iCtaMinTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iCtaMaxTier1")
    private int iCtaMaxTier1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iPriceCompleteTier2")
    private int iPriceCompleteTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iPriceReviewTier2") 
    private int iPriceReviewTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iPriceCtaTier2")
    private int iPriceCtaTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iPointsTier2")
    private int iPointsTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iQuotaMinTier2")
    private int iQuotaMinTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iQuotaMaxTier2")
    private int iQuotaMaxTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iReviewMinTier2")
    private int iReviewMinTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iReviewMaxTier2")
    private int iReviewMaxTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iCtaMinTier2")
    private int iCtaMinTier2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iCtaMaxTier2")
    private int iCtaMaxTier2;
    @Column(name = "dtLastUpdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtLastUpdate;

    public InvoicePlans() {
    }

    public InvoicePlans(Integer iID) {
        this.iID = iID;
    }

    public InvoicePlans(Integer iID, int bActive, int iModuleID, int iActualComplete, int iActualReview, int iActualCta, int iPriceCompleteTier1, int iPriceReviewTier1, int iPriceCtaTier1, int iPointsTier1, int iQuotaMinTier1, int iQuotaMaxTier1, int iReviewMinTier1, int iReviewMaxTier1, int iCtaMinTier1, int iCtaMaxTier1, int iPriceCompleteTier2, int iPriceReviewTier2, int iPriceCtaTier2, int iPointsTier2, int iQuotaMinTier2, int iQuotaMaxTier2, int iReviewMinTier2, int iReviewMaxTier2, int iCtaMinTier2, int iCtaMaxTier2) {
        this.iID = iID;
        this.bActive = bActive;
        //this.iModuleID = iModuleID;
        this.iActualComplete = iActualComplete;
        this.iActualReview = iActualReview;
        this.iActualCta = iActualCta;
        this.iPriceCompleteTier1 = iPriceCompleteTier1;
        this.iPriceReviewTier1 = iPriceReviewTier1;
        this.iPriceCtaTier1 = iPriceCtaTier1;
        this.iPointsTier1 = iPointsTier1;
        this.iQuotaMinTier1 = iQuotaMinTier1;
        this.iQuotaMaxTier1 = iQuotaMaxTier1;
        this.iReviewMinTier1 = iReviewMinTier1;
        this.iReviewMaxTier1 = iReviewMaxTier1;
        this.iCtaMinTier1 = iCtaMinTier1;
        this.iCtaMaxTier1 = iCtaMaxTier1;
        this.iPriceCompleteTier2 = iPriceCompleteTier2;
        this.iPriceReviewTier2 = iPriceReviewTier2;
        this.iPriceCtaTier2 = iPriceCtaTier2;
        this.iPointsTier2 = iPointsTier2;
        this.iQuotaMinTier2 = iQuotaMinTier2;
        this.iQuotaMaxTier2 = iQuotaMaxTier2;
        this.iReviewMinTier2 = iReviewMinTier2;
        this.iReviewMaxTier2 = iReviewMaxTier2;
        this.iCtaMinTier2 = iCtaMinTier2;
        this.iCtaMaxTier2 = iCtaMaxTier2;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public int getBActive() {
        return bActive;
    }

    public void setBActive(int bActive) {
        this.bActive = bActive;
    }

    public Date getDtStart() {
        return dtStart;
    }

    public void setDtStart(Date dtStart) {
        this.dtStart = dtStart;
    }

    public Date getDtEnd() {
        return dtEnd;
    }

    public void setDtEnd(Date dtEnd) {
        this.dtEnd = dtEnd;
    }

    public Integer getICompanyID() {
        return iCompanyID;
    }

    public void setICompanyID(Integer iCompanyID) {
        this.iCompanyID = iCompanyID;
    }

//    public int getIModuleID() {
//        return iModuleID;
//    }
//
//    public void setIModuleID(int iModuleID) {
//        this.iModuleID = iModuleID;
//    }

    public String getVModuleName() {
        return vModuleName;
    }

    public void setVModuleName(String vModuleName) {
        this.vModuleName = vModuleName;
    }

    public int getIActualComplete() {
        return iActualComplete;
    }

    public void setIActualComplete(int iActualComplete) {
        this.iActualComplete = iActualComplete;
    }

    public int getIActualReview() {
        return iActualReview;
    }

    public void setIActualReview(int iActualReview) {
        this.iActualReview = iActualReview;
    }

    public int getIActualCta() {
        return iActualCta;
    }

    public void setIActualCta(int iActualCta) {
        this.iActualCta = iActualCta;
    }

    public Date getDtTier1Expired() {
        return dtTier1Expired;
    }

    public void setDtTier1Expired(Date dtTier1Expired) {
        this.dtTier1Expired = dtTier1Expired;
    }

    public int getIPriceCompleteTier1() {
        return iPriceCompleteTier1;
    }

    public void setIPriceCompleteTier1(int iPriceCompleteTier1) {
        this.iPriceCompleteTier1 = iPriceCompleteTier1;
    }

    public int getIPriceReviewTier1() {
        return iPriceReviewTier1;
    }

    public void setIPriceReviewTier1(int iPriceReviewTier1) {
        this.iPriceReviewTier1 = iPriceReviewTier1;
    }

    public int getIPriceCtaTier1() {
        return iPriceCtaTier1;
    }

    public void setIPriceCtaTier1(int iPriceCtaTier1) {
        this.iPriceCtaTier1 = iPriceCtaTier1;
    }

    public int getIPointsTier1() {
        return iPointsTier1;
    }

    public void setIPointsTier1(int iPointsTier1) {
        this.iPointsTier1 = iPointsTier1;
    }

    public int getIQuotaMinTier1() {
        return iQuotaMinTier1;
    }

    public void setIQuotaMinTier1(int iQuotaMinTier1) {
        this.iQuotaMinTier1 = iQuotaMinTier1;
    }

    public int getIQuotaMaxTier1() {
        return iQuotaMaxTier1;
    }

    public void setIQuotaMaxTier1(int iQuotaMaxTier1) {
        this.iQuotaMaxTier1 = iQuotaMaxTier1;
    }

    public int getIReviewMinTier1() {
        return iReviewMinTier1;
    }

    public void setIReviewMinTier1(int iReviewMinTier1) {
        this.iReviewMinTier1 = iReviewMinTier1;
    }

    public int getIReviewMaxTier1() {
        return iReviewMaxTier1;
    }

    public void setIReviewMaxTier1(int iReviewMaxTier1) {
        this.iReviewMaxTier1 = iReviewMaxTier1;
    }

    public int getICtaMinTier1() {
        return iCtaMinTier1;
    }

    public void setICtaMinTier1(int iCtaMinTier1) {
        this.iCtaMinTier1 = iCtaMinTier1;
    }

    public int getICtaMaxTier1() {
        return iCtaMaxTier1;
    }

    public void setICtaMaxTier1(int iCtaMaxTier1) {
        this.iCtaMaxTier1 = iCtaMaxTier1;
    }

    public int getIPriceCompleteTier2() {
        return iPriceCompleteTier2;
    }

    public void setIPriceCompleteTier2(int iPriceCompleteTier2) {
        this.iPriceCompleteTier2 = iPriceCompleteTier2;
    }

    public int getIPriceReviewTier2() {
        return iPriceReviewTier2;
    }

    public void setIPriceReviewTier2(int iPriceReviewTier2) {
        this.iPriceReviewTier2 = iPriceReviewTier2;
    }

    public int getIPriceCtaTier2() {
        return iPriceCtaTier2;
    }

    public void setIPriceCtaTier2(int iPriceCtaTier2) {
        this.iPriceCtaTier2 = iPriceCtaTier2;
    }

    public int getIPointsTier2() {
        return iPointsTier2;
    }

    public void setIPointsTier2(int iPointsTier2) {
        this.iPointsTier2 = iPointsTier2;
    }

    public int getIQuotaMinTier2() {
        return iQuotaMinTier2;
    }

    public void setIQuotaMinTier2(int iQuotaMinTier2) {
        this.iQuotaMinTier2 = iQuotaMinTier2;
    }

    public int getIQuotaMaxTier2() {
        return iQuotaMaxTier2;
    }

    public void setIQuotaMaxTier2(int iQuotaMaxTier2) {
        this.iQuotaMaxTier2 = iQuotaMaxTier2;
    }

    public int getIReviewMinTier2() {
        return iReviewMinTier2;
    }

    public void setIReviewMinTier2(int iReviewMinTier2) {
        this.iReviewMinTier2 = iReviewMinTier2;
    }

    public int getIReviewMaxTier2() {
        return iReviewMaxTier2;
    }

    public void setIReviewMaxTier2(int iReviewMaxTier2) {
        this.iReviewMaxTier2 = iReviewMaxTier2;
    }

    public int getICtaMinTier2() {
        return iCtaMinTier2;
    }

    public void setICtaMinTier2(int iCtaMinTier2) {
        this.iCtaMinTier2 = iCtaMinTier2;
    }

    public int getICtaMaxTier2() {
        return iCtaMaxTier2;
    }

    public void setICtaMaxTier2(int iCtaMaxTier2) {
        this.iCtaMaxTier2 = iCtaMaxTier2;
    }

    public Date getDtLastUpdate() {
        return dtLastUpdate;
    }

    public void setDtLastUpdate(Date dtLastUpdate) {
        this.dtLastUpdate = dtLastUpdate;
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
        if (!(object instanceof InvoicePlans)) {
            return false;
        }
        InvoicePlans other = (InvoicePlans) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.courses.InvoicePlans[ iID=" + iID + " ]";
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
    
}
