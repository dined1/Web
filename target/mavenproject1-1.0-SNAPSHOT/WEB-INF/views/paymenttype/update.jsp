<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/webresources/common/header.jspf"%>

<div id="wrapper">
    <%@ include file="/webresources/common/navigationbar.jspf"%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h5><i class="fa fa-edit fa-fw"></i> <b> Update Paymenttype</b></h5> 
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <form role="form" action="${appPath}/paymenttype/update" method="POST">
                                    <div class="form-group">
                                        <label for="PTId">PTId</label>
                                        <input class="form-control" type="number" name="PTId" readonly value="${PAYMENTTYPE.PTId}" />
                                    </div>     
                                    <div class="form-group">
                                        <label for="typeName">Type Name</label>
                                        <input class="form-control" type="text" name="typeName"  value="${PAYMENTTYPE.typeName}" />
                                    </div>     
                                    <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Update</button>
                                    <a href="${appPath}/paymenttype/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%--end content--%>
<%@ include file="/webresources/common/footer.jspf"%>
