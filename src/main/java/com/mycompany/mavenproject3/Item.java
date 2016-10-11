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
@Table(name = "item")
public class Item implements Serializable {

    @Column(name = "ItemId", table = "item", nullable = false)
    @Id
    @FormParam("itemId")
    private Integer itemId;

    @Column(name = "Name", table = "item")
    @Basic
    @FormParam("name")
    private String name;

    @Column(name = "Type", table = "item")
    @Basic
    @FormParam("type")
    private String type;

    @Column(name = "Description", table = "item")
    @Basic
    @FormParam("description")
    private String description;

    @Column(name = "DefMP", table = "item", precision = 12)
    @Basic
    @FormParam("defMP")
    private Float defMP;

    @Column(name = "DefOTP", table = "item", precision = 12)
    @Basic
    @FormParam("defOTP")
    private Float defOTP;

    @Column(name = "ModifiedDate", table = "item")
    @Basic
    @FormParam("modifiedDate")
    private String modifiedDate;

    @OneToMany(targetEntity = Itemdiscount.class, mappedBy = "itemId")
    private List<Itemdiscount> itemdiscountCollection;

    @OneToMany(targetEntity = Itemgroup.class, mappedBy = "iid")
    private List<Itemgroup> itemgroupCollection;

    @OneToMany(targetEntity = Soproduct.class, mappedBy = "itemId")
    private List<Soproduct> soproductCollection;

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getDefMP() {
        return this.defMP;
    }

    public void setDefMP(Float defMP) {
        this.defMP = defMP;
    }

    public Float getDefOTP() {
        return this.defOTP;
    }

    public void setDefOTP(Float defOTP) {
        this.defOTP = defOTP;
    }

    public String getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public List<Itemdiscount> getItemdiscountCollection() {
        return this.itemdiscountCollection;
    }

    public void setItemdiscountCollection(List<Itemdiscount> itemdiscountCollection) {
        this.itemdiscountCollection = itemdiscountCollection;
    }

    public List<Itemgroup> getItemgroupCollection() {
        return this.itemgroupCollection;
    }

    public void setItemgroupCollection(List<Itemgroup> itemgroupCollection) {
        this.itemgroupCollection = itemgroupCollection;
    }

    public List<Soproduct> getSoproductCollection() {
        return this.soproductCollection;
    }

    public void setSoproductCollection(List<Soproduct> soproductCollection) {
        this.soproductCollection = soproductCollection;
    }

}
