/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.ejb;

import com.geo.entity.Location;
import javax.ejb.LocalBean;
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
public class TestEJB {
    
    @PersistenceContext
    EntityManager em;
    
    public Location getResult(Long id) {
        Location result = null;

        try {
            result = em.find(Location.class, id);
            System.out.println("This is the result: " + result.getCity());
            
        } catch (PersistenceException e) {
            System.out.println("Broken");
        }

        return result;
    }
    
    public void postLocation(Location location) {
        
        try {
            em.persist(location);
            System.out.println("This worked:");
        } catch (PersistenceException e) {
            System.out.println("Broken");
        }
    }
    
}
