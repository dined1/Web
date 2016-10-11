/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.controller;

import com.mycompany.mavenproject3.Itemgroup;
import com.mycompany.mavenproject3.controller.util.ErrorBean;
import com.mycompany.mavenproject3.controller.util.ValidationUtil;
import com.mycompany.mavenproject3.service.facade.ItemgroupFacade;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Admin
 */
@Path("itemgroup")
public class ItemgroupController {

    @Inject
    private javax.mvc.Models model;
    @Inject
    private ItemgroupFacade facade;
    @Inject
    private javax.mvc.binding.BindingResult validationResult;
    @Inject
    private ErrorBean error;

    @GET
    @Path("new")
    @javax.mvc.annotation.Controller
    public String emptyItemgroup() {
        return "itemgroup/create.jsp";
    }

    @POST
    @Path("new")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String createItemgroup(@Valid
            @BeanParam Itemgroup itemgroup) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.create(itemgroup);
        return "redirect:itemgroup/list";
    }

    @GET
    @Path("update/{id}")
    @javax.mvc.annotation.Controller
    public String editItemgroup(@PathParam("id") Integer id) {
        model.put("ITEMGROUP", facade.find(id));
        return "itemgroup/update.jsp";
    }

    @POST
    @Path("update")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String updateItemgroup(@Valid
            @BeanParam Itemgroup itemgroup) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.edit(itemgroup);
        return "redirect:itemgroup/list";
    }

    @GET
    @Path("remove/{id}")
    @javax.mvc.annotation.Controller
    public String removeItemgroup(@PathParam("id") Integer id) {
        facade.remove(facade.find(id));
        return "redirect:itemgroup/list";
    }

    @GET
    @Path("{id}")
    @javax.mvc.annotation.Controller
    public String findItemgroup(@PathParam("id") Integer id) {
        model.put("ITEMGROUP", facade.find(id));
        return "itemgroup/view.jsp";
    }

    @GET
    @Path("list")
    @javax.mvc.annotation.Controller
    public String findAllItemgroup() {
        model.put("ITEMGROUP_LIST", facade.findAll());
        return "itemgroup/list.jsp";
    }
    
}
