<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/webresources/common/header.jspf"%>

<div id="wrapper">
    <%@ include file="/webresources/common/navigationbar.jspf"%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h5><i class="fa fa-plus-square fa-fw"></i> <b> Create a new Discountrule </b></h5>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <form role="form" action="${appPath}/discountrule/new" method="POST">
                                    <div class="form-group">
                                        <label for="DRId">DRId</label>
                                        <input class="form-control" type="number" name="DRId" path="DRId"  required="required" autofocus="autofocus"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="discountValue">Discount Value</label>
                                        <input class="form-control" type="number" name="discountValue" path="discountValue"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="discountProcent">Discount Procent</label>
                                        <input class="form-control" type="number" name="discountProcent" path="discountProcent"  />
                                    </div>
                                    <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Submit</button>
                                    <a href="${appPath}/discountrule/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
