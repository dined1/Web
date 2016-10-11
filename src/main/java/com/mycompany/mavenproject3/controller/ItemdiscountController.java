/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.controller;

import com.mycompany.mavenproject3.Itemdiscount;
import com.mycompany.mavenproject3.controller.util.ErrorBean;
import com.mycompany.mavenproject3.controller.util.ValidationUtil;
import com.mycompany.mavenproject3.service.facade.ItemdiscountFacade;
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
@Path("itemdiscount")
public class ItemdiscountController {

    @Inject
    private javax.mvc.Models model;
    @Inject
    private ItemdiscountFacade facade;
    @Inject
    private javax.mvc.binding.BindingResult validationResult;
    @Inject
    private ErrorBean error;

    @GET
    @Path("new")
    @javax.mvc.annotation.Controller
    public String emptyItemdiscount() {
        return "itemdiscount/create.jsp";
    }

    @POST
    @Path("new")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String createItemdiscount(@Valid
            @BeanParam Itemdiscount itemdiscount) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.create(itemdiscount);
        return "redirect:itemdiscount/list";
    }

    @GET
    @Path("update/{id}")
    @javax.mvc.annotation.Controller
    public String editItemdiscount(@PathParam("id") Integer id) {
        model.put("ITEMDISCOUNT", facade.find(id));
        return "itemdiscount/update.jsp";
    }

    @POST
    @Path("update")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String updateItemdiscount(@Valid
            @BeanParam Itemdiscount itemdiscount) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.edit(itemdiscount);
        return "redirect:itemdiscount/list";
    }

    @GET
    @Path("remove/{id}")
    @javax.mvc.annotation.Controller
    public String removeItemdiscount(@PathParam("id") Integer id) {
        facade.remove(facade.find(id));
        return "redirect:itemdiscount/list";
    }

    @GET
    @Path("{id}")
    @javax.mvc.annotation.Controller
    public String findItemdiscount(@PathParam("id") Integer id) {
        model.put("ITEMDISCOUNT", facade.find(id));
        return "itemdiscount/view.jsp";
    }

    @GET
    @Path("list")
    @javax.mvc.annotation.Controller
    public String findAllItemdiscount() {
        model.put("ITEMDISCOUNT_LIST", facade.findAll());
        return "itemdiscount/list.jsp";
    }
    
}
