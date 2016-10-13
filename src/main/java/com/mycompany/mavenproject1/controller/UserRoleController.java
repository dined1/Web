/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.UserRole;
import com.mycompany.mavenproject1.controller.util.ErrorBean;
import com.mycompany.mavenproject1.controller.util.ValidationUtil;
import com.mycompany.mavenproject1.service.facade.UserRoleFacade;
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
 * @author dzni0816
 */
@Path("userRole")
public class UserRoleController {

    @Inject
    private javax.mvc.Models model;
    @Inject
    private UserRoleFacade facade;
    @Inject
    private javax.mvc.binding.BindingResult validationResult;
    @Inject
    private ErrorBean error;

    @GET
    @Path("new")
    @javax.mvc.annotation.Controller
    public String emptyUserRole() {
        return "userRole/create.jsp";
    }

    @POST
    @Path("new")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String createUserRole(@Valid
            @BeanParam UserRole userRole) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.create(userRole);
        return "redirect:userRole/list";
    }

    @GET
    @Path("update/{id}")
    @javax.mvc.annotation.Controller
    public String editUserRole(@PathParam("id") Long id) {
        model.put("USERROLE", facade.find(id));
        return "userRole/update.jsp";
    }

    @POST
    @Path("update")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String updateUserRole(@Valid
            @BeanParam UserRole userRole) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.edit(userRole);
        return "redirect:userRole/list";
    }

    @GET
    @Path("remove/{id}")
    @javax.mvc.annotation.Controller
    public String removeUserRole(@PathParam("id") Long id) {
        facade.remove(facade.find(id));
        return "redirect:userRole/list";
    }

    @GET
    @Path("{id}")
    @javax.mvc.annotation.Controller
    public String findUserRole(@PathParam("id") Long id) {
        model.put("USERROLE", facade.find(id));
        return "userRole/view.jsp";
    }

    @GET
    @Path("list")
    @javax.mvc.annotation.Controller
    public String findAllUserRole() {
        model.put("USERROLE_LIST", facade.findAll());
        return "userRole/list.jsp";
    }
    
}
