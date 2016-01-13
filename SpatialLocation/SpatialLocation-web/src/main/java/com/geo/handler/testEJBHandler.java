/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.handler;

import com.geo.ejb.TestEJB;
import java.io.Serializable;
import javax.ejb.EJB;
import com.geo.entity.Location;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author CMTUPPS
 */
@Named
@ViewScoped
public class testEJBHandler implements Serializable {

    private Location location;
    @EJB
    transient TestEJB testEJB;

    public Location getLocation() {
        return testEJB.getResult((long) 1);

    }
    
    public void postLocation() {
        location = new Location();
        
        location.setCity("Ft. Collins");
        location.setCountry("United States");
        location.setId(2);
        testEJB.postLocation(location);
    }
}
