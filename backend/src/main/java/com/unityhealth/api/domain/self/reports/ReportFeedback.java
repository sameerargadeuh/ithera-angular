/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.reports;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tabish
 */
@Entity
@Table(name = "tblreport_feedback")
@XmlRootElement
public class ReportFeedback implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReportFeedbackPK tblreportFeedbackPK;
    @Column(name = "UserID")
    private Integer userID;
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Response")
    private String response;

    public ReportFeedback() {
    }

    public ReportFeedback(ReportFeedbackPK tblreportFeedbackPK) {
        this.tblreportFeedbackPK = tblreportFeedbackPK;
    }

    public ReportFeedback(int transcriptID, int interactionID, int courseID) {
        this.tblreportFeedbackPK = new ReportFeedbackPK(transcriptID, interactionID, courseID);
    }

    public ReportFeedbackPK getTblreportFeedbackPK() {
        return tblreportFeedbackPK;
    }

    public void setTblreportFeedbackPK(ReportFeedbackPK tblreportFeedbackPK) {
        this.tblreportFeedbackPK = tblreportFeedbackPK;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tblreportFeedbackPK != null ? tblreportFeedbackPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportFeedback)) {
            return false;
        }
        ReportFeedback other = (ReportFeedback) object;
        if ((this.tblreportFeedbackPK == null && other.tblreportFeedbackPK != null) || (this.tblreportFeedbackPK != null && !this.tblreportFeedbackPK.equals(other.tblreportFeedbackPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.reports.TblreportFeedback[ tblreportFeedbackPK=" + tblreportFeedbackPK + " ]";
    }
    
}
