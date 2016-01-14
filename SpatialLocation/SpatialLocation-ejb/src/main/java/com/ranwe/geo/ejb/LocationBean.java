/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ranwe.geo.ejb;

import com.ranwe.geo.entity.Location;
import javax.ejb.LocalBean;
import org.apache.log4j.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

/**
 *
 * @author CMTUPPS
 */
@Stateless
@LocalBean
public class LocationBean {

    static Logger log = Logger.getLogger(LocationBean.class.getName());
    private Boolean isSuccess;

    @PersistenceContext
    EntityManager em;

    public Location getLocation(Long id) {
        Location result = null;

        try {
            result = em.find(Location.class, id);
            log.info("getLocation success");
            System.out.println("test git ignore");
        } catch (PersistenceException e) {
            log.warn("getLocation" + e);
        }
        return result;
    }

    public boolean postLocation(Location location) {
        
        try {
            em.persist(location);
            isSuccess = true;
            log.info("postLocation" + isSuccess);
        } catch (PersistenceException e) {
            log.warn("postLocation"+ isSuccess + e);
        }
        
        return isSuccess;
    }

    public boolean deleteLocation(Location location) {

        try {
            em.remove(location);
            isSuccess = true;
            log.info("deleteLocation success");
        } catch (PersistenceException e) {
            log.warn("deleteLocation: " + isSuccess + e);
        }
        
        return isSuccess;
    }

}
