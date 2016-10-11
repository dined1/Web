/**
 * This file was generated by the JPA Modeler
 */
package com.mycompany.mavenproject3;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;

/**
 * @author Admin
 */
@Entity
@Table(name = "paymentbill")
public class Paymentbill implements Serializable {

    @Column(name = "PBId", table = "paymentbill", nullable = false)
    @Id
    @FormParam("pBId")
    private Integer pBId;

    @Column(name = "CMP", table = "paymentbill", precision = 12)
    @Basic
    @FormParam("cmp")
    private Float cmp;

    @Column(name = "COTP", table = "paymentbill", precision = 12)
    @Basic
    @FormParam("cotp")
    private Float cotp;

    @Column(name = "CMPDisc", table = "paymentbill", precision = 12)
    @Basic
    @FormParam("cMPDisc")
    private Float cMPDisc;

    @Column(name = "COTPDisc", table = "paymentbill", precision = 12)
    @Basic
    @FormParam("cOTPDisc")
    private Float cOTPDisc;

    @OneToMany(targetEntity = Payment.class, mappedBy = "pBId")
    private List<Payment> paymentCollection;

    public Integer getPBId() {
        return this.pBId;
    }

    public void setPBId(Integer pBId) {
        this.pBId = pBId;
    }

    public Float getCmp() {
        return this.cmp;
    }

    public void setCmp(Float cmp) {
        this.cmp = cmp;
    }

    public Float getCotp() {
        return this.cotp;
    }

    public void setCotp(Float cotp) {
        this.cotp = cotp;
    }

    public Float getCMPDisc() {
        return this.cMPDisc;
    }

    public void setCMPDisc(Float cMPDisc) {
        this.cMPDisc = cMPDisc;
    }

    public Float getCOTPDisc() {
        return this.cOTPDisc;
    }

    public void setCOTPDisc(Float cOTPDisc) {
        this.cOTPDisc = cOTPDisc;
    }

    public List<Payment> getPaymentCollection() {
        return this.paymentCollection;
    }

    public void setPaymentCollection(List<Payment> paymentCollection) {
        this.paymentCollection = paymentCollection;
    }

}
