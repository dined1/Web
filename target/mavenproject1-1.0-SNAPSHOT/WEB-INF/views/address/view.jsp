<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/webresources/common/header.jspf"%>

<div id="wrapper">
    <%@ include file="/webresources/common/navigationbar.jspf"%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h5><i class="fa fa-info-circle fa-fw"></i> <b> Address info</b></h5> 
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="list-group">

                                    <a href="#" class="list-group-item">
                                        <div class="row">
                                            <div class="col-lg-4"><span class="small">Address Id :</span></div>
                                            <div class="col-lg-8">${mvc.encoders.html(ADDRESS.addressId)}</div>
                                        </div>
                                    </a>             
                                    <a href="#" class="list-group-item">
                                        <div class="row">
                                            <div class="col-lg-4"><span class="small">Address Line :</span></div>
                                            <div class="col-lg-8">${mvc.encoders.html(ADDRESS.addressLine)}</div>
                                        </div>
                                    </a>             
                                    <a href="#" class="list-group-item">
                                        <div class="row">
                                            <div class="col-lg-4"><span class="small">City :</span></div>
                                            <div class="col-lg-8">${mvc.encoders.html(ADDRESS.city)}</div>
                                        </div>
                                    </a>             
                                    <a href="#" class="list-group-item">
                                        <div class="row">
                                            <div class="col-lg-4"><span class="small">Country :</span></div>
                                            <div class="col-lg-8">${mvc.encoders.html(ADDRESS.country)}</div>
                                        </div>
                                    </a>             
                                    <a href="#" class="list-group-item">
                                        <div class="row">
                                            <div class="col-lg-4"><span class="small">Postal Code :</span></div>
                                            <div class="col-lg-8">${mvc.encoders.html(ADDRESS.postalCode)}</div>
                                        </div>
                                    </a>             
                                    <a href="#" class="list-group-item">
                                        <div class="row">
                                            <div class="col-lg-4"><span class="small">Modified Date :</span></div>
                                            <div class="col-lg-8">${mvc.encoders.html(ADDRESS.modifiedDate)}</div>
                                        </div>
                                    </a>             

                                </div>
                                <a href="${appPath}/address/list" class="btn btn-default"><i class="fa fa-arrow-circle-left fa-fw"></i>Back</a>
                            </div>
                            <!-- /.col-lg-6 (nested) -->
                        </div>
                        <!-- /.row (nested) -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
    </div>
    <!-- /#page-wrapper -->
</div>

<%--end content--%>
<%@ include file="/webresources/common/footer.jspf"%>
