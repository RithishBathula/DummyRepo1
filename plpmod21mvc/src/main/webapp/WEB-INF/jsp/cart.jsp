<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file = "header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/body.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/footer.css" rel="stylesheet">
</head>
<body>
<br>
<br>
<br>

<center>
<h3>Cart Page</h3>
<table border="1px">
<tr height="50">
  <!-- <td colspan="1">Customer id</td> -->
<td>Product id</td>
<td>Product Name</td>
<td>Quantity</td>
<td>Amount</td>
</tr>

<a:forEach items="${cartProd}" var="prodInfo">

              <tr height="50">
   <!--  <td align="center">${prodInfo.c_id}</td> --> 
              <td align="center">${prodInfo.p_id}</td>
               <td align="center">${prodInfo.p_name}</td>
                <td align="center">${prodInfo.p_quantity} </td>
                <td align="center">${prodInfo.cartAmount}</td>
            <td align="center"><a
                   href="/delete/${prodInfo.p_id}">
                       Delete from cart</a></td>
      </tr>
   </a:forEach>
   </table>
   <br>
   <a href="/buy">Buy Now</a>
   <br>
   <a href="/index">Continue Shopping</a>
   </center>
   <br>
   <br>
</body>
<footer class="footer">
	<center>
		<p style="font-size: 15px;">Copyright ©2018. All rights reserved.</p>
	</center>
	</footer>
</html>