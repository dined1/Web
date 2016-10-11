/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.controller;

import java.util.Set;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;
import javax.mvc.engine.ViewEngine;

/**
 *
 * @author Admin
 */
@javax.ws.rs.ApplicationPath("resources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }


    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> props = new HashMap<>();
        props.put(ViewEngine.VIEW_FOLDER, "/WEB-INF/views");
        return props;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.mycompany.mavenproject3.controller.AddressController.class);
        resources.add(com.mycompany.mavenproject3.controller.CustomerController.class);
        resources.add(com.mycompany.mavenproject3.controller.DiscountruleController.class);
        resources.add(com.mycompany.mavenproject3.controller.Group1Controller.class);
        resources.add(com.mycompany.mavenproject3.controller.ItemController.class);
        resources.add(com.mycompany.mavenproject3.controller.ItemdiscountController.class);
        resources.add(com.mycompany.mavenproject3.controller.ItemgroupController.class);
        resources.add(com.mycompany.mavenproject3.controller.PaymentController.class);
        resources.add(com.mycompany.mavenproject3.controller.PaymentbillController.class);
        resources.add(com.mycompany.mavenproject3.controller.PaymenttypeController.class);
        resources.add(com.mycompany.mavenproject3.controller.RoleController.class);
        resources.add(com.mycompany.mavenproject3.controller.SoController.class);
        resources.add(com.mycompany.mavenproject3.controller.SoproductController.class);
        resources.add(com.mycompany.mavenproject3.controller.StatisticscollectorController.class);
        resources.add(com.mycompany.mavenproject3.controller.UserController.class);
        resources.add(com.mycompany.mavenproject3.controller.util.CustomParamConverterProvider.class);
    }
    
}
