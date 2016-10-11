/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.controller;

import com.mycompany.mavenproject3.Item;
import com.mycompany.mavenproject3.controller.util.ErrorBean;
import com.mycompany.mavenproject3.controller.util.ValidationUtil;
import com.mycompany.mavenproject3.service.facade.ItemFacade;
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
@Path("item")
public class ItemController {

    @Inject
    private javax.mvc.Models model;
    @Inject
    private ItemFacade facade;
    @Inject
    private javax.mvc.binding.BindingResult validationResult;
    @Inject
    private ErrorBean error;

    @GET
    @Path("new")
    @javax.mvc.annotation.Controller
    public String emptyItem() {
        return "item/create.jsp";
    }

    @POST
    @Path("new")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String createItem(@Valid
            @BeanParam Item item) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.create(item);
        return "redirect:item/list";
    }

    @GET
    @Path("update/{id}")
    @javax.mvc.annotation.Controller
    public String editItem(@PathParam("id") Integer id) {
        model.put("ITEM", facade.find(id));
        return "item/update.jsp";
    }

    @POST
    @Path("update")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String updateItem(@Valid
            @BeanParam Item item) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.edit(item);
        return "redirect:item/list";
    }

    @GET
    @Path("remove/{id}")
    @javax.mvc.annotation.Controller
    public String removeItem(@PathParam("id") Integer id) {
        facade.remove(facade.find(id));
        return "redirect:item/list";
    }

    @GET
    @Path("{id}")
    @javax.mvc.annotation.Controller
    public String findItem(@PathParam("id") Integer id) {
        model.put("ITEM", facade.find(id));
        return "item/view.jsp";
    }

    @GET
    @Path("list")
    @javax.mvc.annotation.Controller
    public String findAllItem() {
        model.put("ITEM_LIST", facade.findAll());
        return "item/list.jsp";
    }
    
}
