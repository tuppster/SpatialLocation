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
    
    @PersistenceContext
    EntityManager em;
    
    public Location getResult(Long id) {
        Location result = null;

        try {
            result = em.find(Location.class, id);
            log.info("getResult success");
        } catch (PersistenceException e) {
            log.warn("getResult" + e);
        }

        return result;
    }
    
    public void postLocation(Location location) {
        
        try {
            em.persist(location);
            log.info("postLocation success");
        } catch (PersistenceException e) {
            log.warn("getResult" + e);
        }
    }
    
}
