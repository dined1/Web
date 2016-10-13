<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/webresources/common/header.jspf"%>

<div id="wrapper">
    <%@ include file="/webresources/common/navigationbar.jspf"%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h5><i class="fa fa-plus-square fa-fw"></i> <b> Create a new Paymentbill </b></h5>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <form role="form" action="${appPath}/paymentbill/new" method="POST">
                                    <div class="form-group">
                                        <label for="PBId">PBId</label>
                                        <input class="form-control" type="number" name="PBId" path="PBId"  required="required" autofocus="autofocus"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="cmp">Cmp</label>
                                        <input class="form-control" type="number" name="cmp" path="cmp"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="cotp">Cotp</label>
                                        <input class="form-control" type="number" name="cotp" path="cotp"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="CMPDisc">CMPDisc</label>
                                        <input class="form-control" type="number" name="CMPDisc" path="CMPDisc"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="COTPDisc">COTPDisc</label>
                                        <input class="form-control" type="number" name="COTPDisc" path="COTPDisc"  />
                                    </div>
                                    <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Submit</button>
                                    <a href="${appPath}/paymentbill/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
