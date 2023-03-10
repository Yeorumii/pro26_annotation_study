<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% request.setCharacterEncoding("UTF-8"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 하기전에 연습해보기!
'MainController에서 'public ModelAndView main1' 안에 객체를 만들어주고 hiName.jsp 와 연결해 hi가 뜨게끔 해준다 -->

<h1>안녕하세요!!</h1>
${msg1 } <!-- Controller에서 넘긴 메시지 출력 -->   페이지입니다.!!  

</body>
</html>