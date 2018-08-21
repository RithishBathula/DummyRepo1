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
<h3>Products List</h3>
<table border="1px">
<tr height="50">
<td align="center">Code</td>
<td align="center">Product Name</td>
<td align="center">Price</td>
<td align="center">link</td>
</tr>

<a:forEach items="${prod}" var="prodInfo">

              <tr height="50">
              <td align="center">${prodInfo.p_id}</td>
              <td align="center">${prodInfo.p_name}</td>
              <td align="center">${prodInfo.p_price} </td>
              <td align="center"> <a href="/carting/${prodInfo.p_id}">Add to cart</a></td>  
              <!--  <td align="center"> <a href="/image/${prodInfo.p_id}">upload image</a></td> -->
      </tr>
   </a:forEach>
   </table>
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