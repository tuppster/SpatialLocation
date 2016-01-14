/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ranwe.geo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author CMTUPPS
 */
@Entity
@Table(name = "geo_zip_codes")
public class ZipCode implements Serializable {

    @Id
    @Column(name = "zipcode")
    private long zipcode;
    @Column(name = "location_id")
    private long locationId;

    /**
     * @return the zipcode
     */
    public long getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return the locationId
     */
    public long getLocationId() {
        return locationId;
    }

    /**
     * @param locationId the locationId to set
     */
    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }
}
