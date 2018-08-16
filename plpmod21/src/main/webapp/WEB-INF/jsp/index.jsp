<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<td>Code</td>
<td>Product Name</td>
<td>Price</td>
<td>link</td>
</tr>

<a:forEach items="${prod}" var="prodInfo">

              <tr>
              <td>${prodInfo.p_id}</td>
               <td>${prodInfo.p_name}</td>
                <td>${prodInfo.p_price} </td>
               <td> <a href="/carting/${prodInfo.p_id}">Add to cart</a></td>              
      </tr>
   </a:forEach>
   </table>
</body>
</html>