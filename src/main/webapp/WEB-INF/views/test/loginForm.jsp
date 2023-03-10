<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
 
<c:set var="contextPath"  value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>로그인 페이지입니다.</title>
</head>

<body>
<form   method="post"  action="${contextPath}/test/login5.do"> 
                                             <!-- LoginController에서 @RequestMapping 값 바뀌면 여기도 동일하게 바꿔줘야함 '/test/login2.do' -->
	<table width="400">
		<tr>
			<td>아이디 <input type="text" name="userID" size="10"></td>
		</tr>
		<tr>
			<td>이름 <input type="text" name="userName" size="10"></td>
		</tr>
	    <tr>
			<td>
			  <input type="submit" value="로그인">
			  <input type="reset" value="다시입력">
			</td>
		</tr>
	</table>
</form>
</body>
</html>
