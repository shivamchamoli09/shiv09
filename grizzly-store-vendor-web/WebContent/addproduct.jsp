<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page1</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="styles\main.css" />
    <script src="scripts\main.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
   

<div  class="main_bodypage1 ">
    <div class="row">
        <div class="col">
            <img src="images/logo.jpg" width=200px  height=65px>
            <input  type="text" placeholder="Search" class="search_input" >
            <i id="filtersubmit" class="fa fa-search"></i>
        </div>
        <div class="mg50 float_left" >
                <label class="mg50 fa fa-bell " ></label>
                <label  class="mg10 ">Welcome , Admin  &lt; Mandy&gt;</label>
                <button class="logoutbutton">Logout</button>
        </div>
    </div>
</div>

    
        <div class="border profileCard_left_pos" >
            <h3 class="profileCard_top">Profile <small style="float: right;">   Edit</small></h3>
            <img src="images/blank.jfif" class="blank_image_style" >
            <p style="text-align:center"><b style="font-size:30px">Helen cho</b> <br><br> ID <br> GRZLY17234<br><br>Designation<br>Sr.Admin<br><br>Office<br>NYC,NY,USA</p><br>
            
        </div>

        <div class="main_div_window" >
            <input type="button" class="tablink active" value="PRODUCTS" >
            <input type="Button" class="tablink" value="VENDORS"><br><br><br>
            <div class="float_left">
            <div class="place_bottom_parent plus_div" >
                <label class="mg10">1</label>
                <input type="image" src="images/plus_sign.png" width=200px height=182px style="margin: 50px 100px" >
                <div class="place_bottom" ><p class="img_label">Add Images</p> </div>
            </div>
            <div class="Style_button" Style="padding-top:10px">
            <button>2</button>
            <button>3</button>
            <button>4</button>
            <button>5</button>
            </div>
            </div>
            <form method="post" action="addproduct">
            <div class="float_left main_input_div" >
            <table>
            <tr>
            <td>Product ID<input type="text" class="main_input"  name="productId"></td>
            </tr>
            <tr>
            <td><input type="text" class="main_input" placeholder="Category" name="productCategory"></td>
            </tr>
            <tr>
            <td><input type="text" class="main_input" placeholder="Name" name="productName">
            </td>
            </tr>
            <tr>
            <td><input type="text" class="main_input" placeholder="Description" name="productDescription"></td>
            </tr>
            <tr>
            <td>
            <input type="text" class="main_input" placeholder="Price" name="productPrice"></td>
            </tr>
            <tr>
            <td>
           <input type="submit" value="ADD"/></td>
           </tr>
           <tr><td><input type="reset" value="Reset"/></td>
           </tr>
        
           </table>
        </div>
        
    </form>
    </div>
</body>
</html>