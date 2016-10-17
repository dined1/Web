<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/webresources/common/header.jspf"%>

<div id="wrapper">
    <%@ include file="/webresources/common/navigationbar.jspf"%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h5><i class="fa fa-plus-square fa-fw"></i> <b> Create a new Customer </b></h5>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <form role="form" action="${appPath}/customer/new" method="POST">
                                    <div class="form-group">
                                        <label for="customerId">Customer Id</label>
                                        <input class="form-control" type="number" name="customerId" path="customerId"  required="required" autofocus="autofocus"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="firstName">First Name</label>
                                        <input class="form-control" type="text" name="firstName" path="firstName"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="lastName">Last Name</label>
                                        <input class="form-control" type="text" name="lastName" path="lastName"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="contact">Contact</label>
                                        <input class="form-control" type="text" name="contact" path="contact"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="email">Email</label>
                                        <input class="form-control" type="text" name="email" path="email"  />
                                    </div>
                                    <div class="form-group">
                                        <label for="phone">Phone</label>
                                        <input class="form-control" type="text" name="phone" path="phone"  />
                                    </div>
                                    <div class="form-group">
                                        <label>Address</label>
                                        <select path="address1" name="address1" onchange=" ">
                                            <option value="ord_null">Нет</option>
                                            <c:forEach items="${ADDRESS_LIST}" var="ADDRESS">
                                                <option value="${ADDRESS.addressId}">${ADDRESS.addressLine}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <button type="submit" class="btn btn-primary"><i class="fa fa-check fa-fw"></i>Submit</button>
                                    <a href="${appPath}/customer/list" class="btn btn-default"><i class="fa fa-close fa-fw"></i>Cancel</a>
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
