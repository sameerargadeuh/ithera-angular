/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.reports;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Tabish
 */
public class ReportDto {

    private BigInteger iID;

    private Integer transcriptID;

    private String status;

    private Integer statusID;

    private Integer score;

    private Date dateCreated;

    private Integer moduleType;
    
    private String courseName;
    
    

    public BigInteger getIID() {
        return iID;
    }

    public void setIID(BigInteger iID) {
        this.iID = iID;
    }

    public Integer getTranscriptID() {
        return transcriptID;
    }

    public void setTranscriptID(Integer transcriptID) {
        this.transcriptID = transcriptID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getModuleType() {
        return moduleType;
    }

    public void setModuleType(int moduleType) {
        this.moduleType = moduleType;
    }
    
     public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    

    
}
