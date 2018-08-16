<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<td>Customer id</td>
<td>Product id</td>
<td>Product Name</td>
<td>Quantity</td>
<td>Amount</td>
</tr>

<a:forEach items="${cartProd}" var="prodInfo">

              <tr>
              <td>${prodInfo.c_id}</td>
              <td>${prodInfo.p_id}</td>
               <td>${prodInfo.p_name}</td>
                <td>${prodInfo.p_quantity} </td>
                <td>${prodInfo.cartAmount}</td>
            <td><a
                   href="https://www.google.co.in/">
                       Delete from cart</a></td>
      </tr>
   </a:forEach>
   </table>
</body>
</html>