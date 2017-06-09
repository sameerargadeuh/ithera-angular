/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.reports;

import com.unityhealth.api.domain.self.account.Account;
import com.unityhealth.api.domain.self.courses.Courses;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.Long;
import java.math.BigInteger;
import org.hibernate.annotations.Type;

/**
 *
 * @author Tabish
 */
@Entity
@Table(name = "tblreport")
public class Report  {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID", columnDefinition = "int")
    private BigInteger iID;
    @Column(name = "TranscriptID")
    private Integer transcriptID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CourseID", referencedColumnName = "iCourseID")
    private Courses course;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID", referencedColumnName = "iBreezeUserID")
    private Account account;
    @Size(max = 8)
    @Column(name = "Status")
    private String status;
    @Column(name = "StatusID")
    private Integer statusID;
    @Column(name = "Score")
    private Integer score;
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModuleType")
    private int moduleType;

    public Report() {
    }

    public Report(BigInteger iID) {
        this.iID = iID;
    }

    public Report(BigInteger iID, int moduleType) {
        this.iID = iID;
        this.moduleType = moduleType;
    }

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
    
    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
        if (!(object instanceof Report)) {
            return false;
        }
        Report other = (Report) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.reports.Tblreport[ iID=" + iID + " ]";
    }
    
}
