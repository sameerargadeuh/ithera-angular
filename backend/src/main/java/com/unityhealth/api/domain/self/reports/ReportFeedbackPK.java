/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.reports;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Tabish
 */
@Embeddable
public class ReportFeedbackPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "TranscriptID")
    private int transcriptID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "InteractionID")
    private int interactionID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CourseID")
    private int courseID;

    public ReportFeedbackPK() {
    }

    public ReportFeedbackPK(int transcriptID, int interactionID, int courseID) {
        this.transcriptID = transcriptID;
        this.interactionID = interactionID;
        this.courseID = courseID;
    }

    public int getTranscriptID() {
        return transcriptID;
    }

    public void setTranscriptID(int transcriptID) {
        this.transcriptID = transcriptID;
    }

    public int getInteractionID() {
        return interactionID;
    }

    public void setInteractionID(int interactionID) {
        this.interactionID = interactionID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) transcriptID;
        hash += (int) interactionID;
        hash += (int) courseID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportFeedbackPK)) {
            return false;
        }
        ReportFeedbackPK other = (ReportFeedbackPK) object;
        if (this.transcriptID != other.transcriptID) {
            return false;
        }
        if (this.interactionID != other.interactionID) {
            return false;
        }
        if (this.courseID != other.courseID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.reports.TblreportFeedbackPK[ transcriptID=" + transcriptID + ", interactionID=" + interactionID + ", courseID=" + courseID + " ]";
    }
    
}
