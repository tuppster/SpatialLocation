/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.entity;

import java.io.Serializable;
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
    private int zipcode;
}
