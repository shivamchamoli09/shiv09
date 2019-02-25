<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="taglib.jsp" %>
<html>

    <head>
        <link rel="stylesheet" type="text/css" href="./style/style.css">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>  
        <title>View Product</title>
    </head>

    <body>
        <ul>
            <li>
                <ul style="background-color: rgba(194, 194, 194, 0)">
                <li style=" padding:10px 15px;">GRIZZLY</li>
                <li style=" padding:0px 1px;"><img src="./images/product-add.jpg" style="height:42px;width:52px;"></li>
                <li style=" padding:10px 15px;">STORE</li> 
                </ul>
            </li>
            <li style=" padding:15px 40px;"><input type="text" style=" border:none;font-size: 20px;border-radius: 10px;width:200px;" placeholder="Search"></li>
            <li style=" padding:15px 55px;  float:right;"><button style="border:none; float:right;width:130px;height:30px;border-radius: 20px; background-color:rgba(83, 83, 83, 0.281)"><font style="font-size: 18px;">Logout</font></button></li>
            <li style=" padding:15px 15px;  float:right;">Welcome, Admin< Name >...</li>
            <li style=" padding:15px 0px; float:right;"><img src="./images/notify.png" style="height: 22px; width:22px;"></li>
        </ul>
 
        <section name= "Profile" style="background-color: rgb(230, 227, 217); position:absolute;left:35px;top:110px; padding:10px; height:470px; width:250px;" name="PROFILE">
                <div style="color: rgb(255, 255, 255); padding:10px;background-color: rgb(194, 194, 194)">PROFILE 
                <button class="buttons" style="background-color: rgb(194, 194, 194);color: rgb(255, 255, 255);">Edit</button></div><br>
                <div align="center">
                    <img src="" style="height:130px;width:130px;"><br><br>
                    <b>Helen Cho</b><br>
                    <br>
                    ID<br>
                    GRZY4533<br>
                    <br>
                    Designation<br>
                    Sr. Admin<br>
                    <br>
                    Office<br>
                    NYC,NY,USA
                </div>
        </section>
 
        <div style="margin-left: 25%;margin-top: 50px;height:460px; width:700px;">
            <ul class="nav nav-tabs" style="width:700px;">
                    <li class="active" style="width:350px;font-size:30px; padding:0px;"><a data-toggle="tab" href="#PROD">PRODUCTS</a></li>
                    <li style="width:350px;padding: 0px;font-size:30px;"><a data-toggle="tab" href="#VEND">VENDORS</a></li> 
            </ul> 

            <div  class="tab-content" style="width:700px;height:420px;">
                
                <div id="PROD" class="tab-pane fade in active"> 
                        <br><b><c:out value="${product.productName}"/> </b> <small>by philips </small><img src="./images/edit.png" style="height:15px;width: 15px;">
                        <br><img src="images/star.png" style="height:10px;width:10px">4.7 <br>
                        <br>
                        <div style="font-size: 15px; float:left;width:400px;height:340px;background-color: rgb(236, 236, 236);">
                        <b>&nbsp; &nbsp;<img src="./images/edit.png" style="height:15px;width: 15px;"></b><br><br>
 
                            <div class="container" style="width:380px;height:240px;"> 
                                <div id="myCarousel" class="carousel slide" data-ride="carousel"> 
                                    <ol class="carousel-indicators" >
                                        <li style="float: none;" data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                        <li style="float: none;" data-target="#myCarousel" data-slide-to="1"></li>
                                    </ol> 
                                    <div class="carousel-inner">
                                        <div class="item active">
                                          <img src="" alt="Image 0" style="width:100%;height:100%;" >
                                        </div> 
                                        <div class="item">
                                          <img src="" alt="Image 1" style="width:100%;height:100%;">
                                        </div>
                                    </div> 
                                    <a class="left carousel-control" href="#myCarousel" data-slide="prev" style="height:100%;">
                                            <span class="glyphicon glyphicon-chevron-left"></span>
                                            <span class="sr-only">Previous</span>
                                          </a>
                                          <a class="right carousel-control" href="#myCarousel" data-slide="next">
                                            <span class="glyphicon glyphicon-chevron-right"></span>
                                            <span class="sr-only">Next</span>
                                    </a>
                                </div>
                            </div>

                        <center> <br>Product Image Carousel </center>
                        <br>
                        
                        </div>   
                        <div style="float:right;width:250px;height:300px;  text-align: justify;"> 
                        <p style="font-size:17px;"><b>Product Description</b> &nbsp; <img src="./images/edit.png" style="height:15px;width: 15px;"></p>
                          <c:out value="${product.productDescription}"/>   
                        </div> 
                        <p style="font-size:20px; position: absolute; right: 400px; bottom:30px;"><b>Rs. ${product.productPrice}</b><img src="./images/edit.png" style="height:15px;width: 15px;"> </p>
 
                </div>

                <div id="VEND" class="tab-pane fade">
                    <h3>VENDORS</h3>
                </div> 
                
            </div>
        </div>
 
       

<button class="buttons submit" >Finish</button> 
<button class="buttons cancel"> Cancel</button> 

</body>
</html>