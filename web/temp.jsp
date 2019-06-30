<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html>
    <head>
        <title>Converter</title>
        <!--        Bootstrap CDN-->
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <script src="resources/js/bootstrap.js"></script> 
    </head>
    <body>
        <div class="container">
            <div class="col-md-12">
                <div class="col-md-12">
                    <img src="img/temp.png" class="img-fluid img-responsive">
                </div>
                <br>
                <div class="">
                    <div class="col-md-12">
                        <div class="">
                            <div class="col-md-12">
                                <br>
                                <html:form action="temp">
                                    <div class="form-group text-center">
                                        <label> Enter Value: </label>
                                        <html:text property="inputValue"></html:text>
                                            <label> From : </label>
                                        <html:select property="inputType">
                                            <html:option value="C">C</html:option>
                                            <html:option value="F">F</html:option>
                                            <html:option value="K">K</html:option>
                                        </html:select>
                                        <label> To : </label>
                                        <html:select property="convertType">
                                            <html:option value="C">C</html:option>
                                            <html:option value="F">F</html:option>
                                            <html:option value="K">K</html:option>
                                        </html:select>
                                    </div>
                                    <div class="from-control text-center">
                                        <html:text property="answer"></html:text>
                                        <html:submit/>
                                    </div>
                                </html:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html:html>
