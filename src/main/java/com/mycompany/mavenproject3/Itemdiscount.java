/**
 * This file was generated by the JPA Modeler
 */
package com.mycompany.mavenproject3;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;

/**
 * @author Admin
 */
@Entity
@Table(name = "itemdiscount")
public class Itemdiscount implements Serializable {

    @Column(name = "IDid", table = "itemdiscount", nullable = false)
    @Id
    @FormParam("iDid")
    private Integer iDid;

    @ManyToOne(optional = false, targetEntity = Discountrule.class)
    @JoinColumn(name = "DRID", referencedColumnName = "DRID")
    private Discountrule dRId;

    @ManyToOne(optional = false, targetEntity = Item.class)
    @JoinColumn(name = "ITEMID", referencedColumnName = "ITEMID")
    private Item itemId;

    public Integer getIDid() {
        return this.iDid;
    }

    public void setIDid(Integer iDid) {
        this.iDid = iDid;
    }

    public Discountrule getDRId() {
        return this.dRId;
    }

    public void setDRId(Discountrule dRId) {
        this.dRId = dRId;
    }

    public Item getItemId() {
        return this.itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
    }

}
