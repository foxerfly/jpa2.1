/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class AcmmmPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MM001")
    private String mm001;
    @Basic(optional = false)
    @Column(name = "MM002")
    private String mm002;

    public AcmmmPK() {
    }

    public AcmmmPK(String mm001, String mm002) {
        this.mm001 = mm001;
        this.mm002 = mm002;
    }

    public String getMm001() {
        return mm001;
    }

    public void setMm001(String mm001) {
        this.mm001 = mm001;
    }

    public String getMm002() {
        return mm002;
    }

    public void setMm002(String mm002) {
        this.mm002 = mm002;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mm001 != null ? mm001.hashCode() : 0);
        hash += (mm002 != null ? mm002.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcmmmPK)) {
            return false;
        }
        AcmmmPK other = (AcmmmPK) object;
        if ((this.mm001 == null && other.mm001 != null) || (this.mm001 != null && !this.mm001.equals(other.mm001))) {
            return false;
        }
        if ((this.mm002 == null && other.mm002 != null) || (this.mm002 != null && !this.mm002.equals(other.mm002))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.AcmmmPK[ mm001=" + mm001 + ", mm002=" + mm002 + " ]";
    }
    
}
