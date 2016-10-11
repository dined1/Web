/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.controller;

import com.mycompany.mavenproject3.Statisticscollector;
import com.mycompany.mavenproject3.controller.util.ErrorBean;
import com.mycompany.mavenproject3.controller.util.ValidationUtil;
import com.mycompany.mavenproject3.service.facade.StatisticscollectorFacade;
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
@Path("statisticscollector")
public class StatisticscollectorController {

    @Inject
    private javax.mvc.Models model;
    @Inject
    private StatisticscollectorFacade facade;
    @Inject
    private javax.mvc.binding.BindingResult validationResult;
    @Inject
    private ErrorBean error;

    @GET
    @Path("new")
    @javax.mvc.annotation.Controller
    public String emptyStatisticscollector() {
        return "statisticscollector/create.jsp";
    }

    @POST
    @Path("new")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String createStatisticscollector(@Valid
            @BeanParam Statisticscollector statisticscollector) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.create(statisticscollector);
        return "redirect:statisticscollector/list";
    }

    @GET
    @Path("update/{id}")
    @javax.mvc.annotation.Controller
    public String editStatisticscollector(@PathParam("id") Integer id) {
        model.put("STATISTICSCOLLECTOR", facade.find(id));
        return "statisticscollector/update.jsp";
    }

    @POST
    @Path("update")
    @javax.mvc.annotation.Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String updateStatisticscollector(@Valid
            @BeanParam Statisticscollector statisticscollector) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.edit(statisticscollector);
        return "redirect:statisticscollector/list";
    }

    @GET
    @Path("remove/{id}")
    @javax.mvc.annotation.Controller
    public String removeStatisticscollector(@PathParam("id") Integer id) {
        facade.remove(facade.find(id));
        return "redirect:statisticscollector/list";
    }

    @GET
    @Path("{id}")
    @javax.mvc.annotation.Controller
    public String findStatisticscollector(@PathParam("id") Integer id) {
        model.put("STATISTICSCOLLECTOR", facade.find(id));
        return "statisticscollector/view.jsp";
    }

    @GET
    @Path("list")
    @javax.mvc.annotation.Controller
    public String findAllStatisticscollector() {
        model.put("STATISTICSCOLLECTOR_LIST", facade.findAll());
        return "statisticscollector/list.jsp";
    }
    
}
