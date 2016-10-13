/**
 * This file was generated by the JPA Modeler
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;

/**
 * @author dzni0816
 */
@Entity
@Table(name = "discountrule")
public class Discountrule implements Serializable {

    @Column(name = "DRId", table = "discountrule", nullable = false)
    @Id
    @FormParam("dRId")
    private Integer dRId;

    @Column(name = "DiscountValue", table = "discountrule", precision = 12)
    @Basic
    @FormParam("discountValue")
    private Float discountValue;

    @Column(name = "DiscountProcent", table = "discountrule", precision = 12)
    @Basic
    @FormParam("discountProcent")
    private Float discountProcent;

    public Integer getDRId() {
        return this.dRId;
    }

    public void setDRId(Integer dRId) {
        this.dRId = dRId;
    }

    public Float getDiscountValue() {
        return this.discountValue;
    }

    public void setDiscountValue(Float discountValue) {
        this.discountValue = discountValue;
    }

    public Float getDiscountProcent() {
        return this.discountProcent;
    }

    public void setDiscountProcent(Float discountProcent) {
        this.discountProcent = discountProcent;
    }

}