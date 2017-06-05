/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.courses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sameer S Argade
 */
@Entity
@Table(name = "tblaccreditation")
public class Accreditation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Size(max = 255)
    @Column(name = "vName")
    private String vName;
    @Size(max = 255)
    @Column(name = "vOrganisation")
    private String vOrganisation;
    @Size(max = 255)
    @Column(name = "vWebsite")
    private String vWebsite;

    public Accreditation() {
    }

    public Accreditation(Integer iID) {
        this.iID = iID;
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

    public String getVOrganisation() {
        return vOrganisation;
    }

    public void setVOrganisation(String vOrganisation) {
        this.vOrganisation = vOrganisation;
    }

    public String getVWebsite() {
        return vWebsite;
    }

    public void setVWebsite(String vWebsite) {
        this.vWebsite = vWebsite;
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
        if (!(object instanceof Accreditation)) {
            return false;
        }
        Accreditation other = (Accreditation) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.api.domain.self.courses.Accreditation[ iID=" + iID + " ]";
    }
    
}
