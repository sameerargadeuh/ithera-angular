/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.courses;
import java.util.Date;
/**
 *
 * @author Sameer S Argade
 */
public class CoursesDto {
    
     private Integer iID;
  private int bActive;
  private int iSite;

    private Integer iCourseID;


    private String vName;


    private String vDesc;

private int bRestrictedByCode;
    private String vSummary;
    private String vAbrv;
    private Integer iType;
    private Integer iCompanyID;
    private Integer iBrandID;
    private Integer iReportID;
    private String vImage;
    private int iRewardPoints;
    private int bComingSoon;
    private Date dtDatePublished;
    private Date dtClosed;
    private Integer iReplacedBy;
    private Character bRestricted;

    private Integer bRestrictedHide;

    private String vRestrictedMessage;
  
    private String vCode;
  

    private int bRestrictedByGroup;
  

    private int bRestrictedByStore;
  

    private int bRestrictedByType;
  

    private int bRestrictedByProfession;
    private String vProfession;
  
    private int bDisclaimer;
    private String vDisclaimer;
  
    private int bCertificate;
    private Integer bAccred;
  

    private int iAccredTypeID;
    private Integer bAccredPending;

    private Float iAccredPoints;
    private String vAccredDesc;


    private String vAccredDetails;
    private String vAccredCompetency;
    private String vAccredObjectives;
    private String vAccredCongratulatory;
    private String vAccredNum;
  
    private int bRewards;
    private String vRewardsInfo;
  
    private int bNew;


    private String vSearchText;
    private String vAudienceMsg;

    private Integer iFormatType;
    private String vUrl;
    private String vNotes;

    private Integer iOwnerGroupID;

    private Integer iRequired;

    private Integer iRestrictedDisplayType;
    
    private String vAccredName;

    public String getvAccredName() {
        return vAccredName;
    }

    public void setvAccredName(String vAccredName) {
        this.vAccredName = vAccredName;
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

    public int getISite() {
        return iSite;
    }

    public void setISite(int iSite) {
        this.iSite = iSite;
    }

    public Integer getICourseID() {
        return iCourseID;
    }

    public void setICourseID(Integer iCourseID) {
        this.iCourseID = iCourseID;
    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

    public String getVDesc() {
        return vDesc;
    }

    public void setVDesc(String vDesc) {
        this.vDesc = vDesc;
    }

    public String getVSummary() {
        return vSummary;
    }

    public void setVSummary(String vSummary) {
        this.vSummary = vSummary;
    }

    public String getVAbrv() {
        return vAbrv;
    }

    public void setVAbrv(String vAbrv) {
        this.vAbrv = vAbrv;
    }

    public Integer getIType() {
        return iType;
    }

    public void setIType(Integer iType) {
        this.iType = iType;
    }

    public Integer getICompanyID() {
        return iCompanyID;
    }

    public void setICompanyID(Integer iCompanyID) {
        this.iCompanyID = iCompanyID;
    }

//    public Integer getIBrandID() {
//        return iBrandID;
//    }
//
//    public void setIBrandID(Integer iBrandID) {
//        this.iBrandID = iBrandID;
//    }

    public Integer getIReportID() {
        return iReportID;
    }

    public void setIReportID(Integer iReportID) {
        this.iReportID = iReportID;
    }

    public String getVImage() {
        return vImage;
    }

    public void setVImage(String vImage) {
        this.vImage = vImage;
    }

    public int getIRewardPoints() {
        return iRewardPoints;
    }

    public void setIRewardPoints(int iRewardPoints) {
        this.iRewardPoints = iRewardPoints;
    }

    public int getBComingSoon() {
        return bComingSoon;
    }

    public void setBComingSoon(int bComingSoon) {
        this.bComingSoon = bComingSoon;
    }

    public Date getDtDatePublished() {
        return dtDatePublished;
    }

    public void setDtDatePublished(Date dtDatePublished) {
        this.dtDatePublished = dtDatePublished;
    }

    public Date getDtClosed() {
        return dtClosed;
    }

    public void setDtClosed(Date dtClosed) {
        this.dtClosed = dtClosed;
    }

    public Integer getIReplacedBy() {
        return iReplacedBy;
    }

    public void setIReplacedBy(Integer iReplacedBy) {
        this.iReplacedBy = iReplacedBy;
    }

    public Character getBRestricted() {
        return bRestricted;
    }

    public void setBRestricted(Character bRestricted) {
        this.bRestricted = bRestricted;
    }

    public Integer getBRestrictedHide() {
        return bRestrictedHide;
    }

    public void setBRestrictedHide(Integer bRestrictedHide) {
        this.bRestrictedHide = bRestrictedHide;
    }

    public String getVRestrictedMessage() {
        return vRestrictedMessage;
    }

    public void setVRestrictedMessage(String vRestrictedMessage) {
        this.vRestrictedMessage = vRestrictedMessage;
    }

    public int getBRestrictedByCode() {
        return bRestrictedByCode;
    }

    public void setBRestrictedByCode(int bRestrictedByCode) {
        this.bRestrictedByCode = bRestrictedByCode;
    }

    public String getVCode() {
        return vCode;
    }

    public void setVCode(String vCode) {
        this.vCode = vCode;
    }

    public int getBRestrictedByGroup() {
        return bRestrictedByGroup;
    }

    public void setBRestrictedByGroup(int bRestrictedByGroup) {
        this.bRestrictedByGroup = bRestrictedByGroup;
    }

    public int getBRestrictedByStore() {
        return bRestrictedByStore;
    }

    public void setBRestrictedByStore(int bRestrictedByStore) {
        this.bRestrictedByStore = bRestrictedByStore;
    }

    public int getBRestrictedByType() {
        return bRestrictedByType;
    }

    public void setBRestrictedByType(int bRestrictedByType) {
        this.bRestrictedByType = bRestrictedByType;
    }

    public int getBRestrictedByProfession() {
        return bRestrictedByProfession;
    }

    public void setBRestrictedByProfession(int bRestrictedByProfession) {
        this.bRestrictedByProfession = bRestrictedByProfession;
    }

    public String getVProfession() {
        return vProfession;
    }

    public void setVProfession(String vProfession) {
        this.vProfession = vProfession;
    }

    public int getBDisclaimer() {
        return bDisclaimer;
    }

    public void setBDisclaimer(int bDisclaimer) {
        this.bDisclaimer = bDisclaimer;
    }

    public String getVDisclaimer() {
        return vDisclaimer;
    }

    public void setVDisclaimer(String vDisclaimer) {
        this.vDisclaimer = vDisclaimer;
    }

    public int getBCertificate() {
        return bCertificate;
    }

    public void setBCertificate(int bCertificate) {
        this.bCertificate = bCertificate;
    }

    public Integer getBAccred() {
        return bAccred;
    }

    public void setBAccred(Integer bAccred) {
        this.bAccred = bAccred;
    }

    public int getIAccredTypeID() {
        return iAccredTypeID;
    }

    public void setIAccredTypeID(int iAccredTypeID) {
        this.iAccredTypeID = iAccredTypeID;
    }

    public Integer getBAccredPending() {
        return bAccredPending;
    }

    public void setBAccredPending(Integer bAccredPending) {
        this.bAccredPending = bAccredPending;
    }

    public Float getIAccredPoints() {
        return iAccredPoints;
    }

    public void setIAccredPoints(Float iAccredPoints) {
        this.iAccredPoints = iAccredPoints;
    }

    public String getVAccredDesc() {
        return vAccredDesc;
    }

    public void setVAccredDesc(String vAccredDesc) {
        this.vAccredDesc = vAccredDesc;
    }

    public String getVAccredDetails() {
        return vAccredDetails;
    }

    public void setVAccredDetails(String vAccredDetails) {
        this.vAccredDetails = vAccredDetails;
    }

    public String getVAccredCompetency() {
        return vAccredCompetency;
    }

    public void setVAccredCompetency(String vAccredCompetency) {
        this.vAccredCompetency = vAccredCompetency;
    }

    public String getVAccredObjectives() {
        return vAccredObjectives;
    }

    public void setVAccredObjectives(String vAccredObjectives) {
        this.vAccredObjectives = vAccredObjectives;
    }

    public String getVAccredCongratulatory() {
        return vAccredCongratulatory;
    }

    public void setVAccredCongratulatory(String vAccredCongratulatory) {
        this.vAccredCongratulatory = vAccredCongratulatory;
    }

    public String getVAccredNum() {
        return vAccredNum;
    }

    public void setVAccredNum(String vAccredNum) {
        this.vAccredNum = vAccredNum;
    }

    public int getBRewards() {
        return bRewards;
    }

    public void setBRewards(int bRewards) {
        this.bRewards = bRewards;
    }

    public String getVRewardsInfo() {
        return vRewardsInfo;
    }

    public void setVRewardsInfo(String vRewardsInfo) {
        this.vRewardsInfo = vRewardsInfo;
    }

    public int getBNew() {
        return bNew;
    }

    public void setBNew(int bNew) {
        this.bNew = bNew;
    }

    public String getVSearchText() {
        return vSearchText;
    }

    public void setVSearchText(String vSearchText) {
        this.vSearchText = vSearchText;
    }

    public String getVAudienceMsg() {
        return vAudienceMsg;
    }

    public void setVAudienceMsg(String vAudienceMsg) {
        this.vAudienceMsg = vAudienceMsg;
    }

    public Integer getIFormatType() {
        return iFormatType;
    }

    public void setIFormatType(Integer iFormatType) {
        this.iFormatType = iFormatType;
    }

    public String getVUrl() {
        return vUrl;
    }

    public void setVUrl(String vUrl) {
        this.vUrl = vUrl;
    }

    public String getVNotes() {
        return vNotes;
    }

    public void setVNotes(String vNotes) {
        this.vNotes = vNotes;
    }

    public Integer getIOwnerGroupID() {
        return iOwnerGroupID;
    }

    public void setIOwnerGroupID(Integer iOwnerGroupID) {
        this.iOwnerGroupID = iOwnerGroupID;
    }

    public Integer getIRequired() {
        return iRequired;
    }

    public void setIRequired(Integer iRequired) {
        this.iRequired = iRequired;
    }

    public Integer getIRestrictedDisplayType() {
        return iRestrictedDisplayType;
    }

    public void setIRestrictedDisplayType(Integer iRestrictedDisplayType) {
        this.iRestrictedDisplayType = iRestrictedDisplayType;
    }
//    public Brand getBrands(){
//        return brands;
//    }
//    public void setBrands(Brand brands){
//         this.brands = brands;
//    }
//    public Accreditation getAccreditation(){
//        return accreditation;
//    }
//    public void setAccreditation(accreditation){
//        this.accreditation = accreditation;
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iID != null ? iID.hashCode() : 0);
        return hash;
    }

  
    
    
}
