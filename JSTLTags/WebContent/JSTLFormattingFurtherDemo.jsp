<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="${10+9}"/>

<c:set var="testScore" value="${30}" scope="session"/>
<c:out value="${testScore}"/>

<c:if test="${testScore>=80}">
<p>u r score awesome:<c:out value="${testScore}"/></p>
</c:if>

<c:choose>
<c:when test="${testScore>70}">
<p> A Grade</p>
</c:when>

<c:when test="${testScore<70&& testScore>=50}">
<p> B Grade</p>
</c:when>


<c:when test="${testScore<50&& testScore>=30}">
<p> c Grade</p>
</c:when>

<c:when test="${testScore<30&& testScore>=10}">
<p> c Grade</p>
</c:when>

<c:otherwise>
<p> D Grade</p>
</c:otherwise>

</c:choose>


<c:forEach var="i" begin="1" end="3">

<c:out value="${i}"/>
</c:forEach>



<%

List<String> ls=new ArrayList<>();
ls.add("gp1");
ls.add("gp2");
ls.add("gp3");
request.setAttribute("studentNames", ls);


%>


<c:set var="accountBalance" value="123.456"/>
<fmt:parseNumber var="i" type="number" value="${accountBalance}"/>
<p>Amount is: <c:out value="${i}"/>


<c:set var="accountBalanceValue" value="7777.4567"/>
formated 1:<fmt:formatNumber  value="${accountBalanceValue}"  type="currency"/>
formated 2:<fmt:formatNumber  value="${accountBalanceValue}"  type="currency" maxFractionDigits="2"/>
formated 3:<fmt:formatNumber  value="${accountBalanceValue}"  type="currency" maxFractionDigits="2" />
formated 4:<fmt:formatNumber  value="${accountBalanceValue}"  type="percent"/>
formated 5:<fmt:formatNumber  value="${accountBalanceValue}"  type="currency"/>
formated 6:<fmt:formatNumber  value="${accountBalanceValue}"  type="currency"/>

<p>Amount is: <c:out value="${i}"/>





<c:forEach var="studentName" items="${studentNames}">

<c:out value="${studentName}"/>
</c:forEach>


<c:set var="testRemove" value="${800}" scope="session"/>
<c:out value="${testRemove}"/>



<c:remove var="testRemove" />
after removal value is <c:out value="${testRemove}"/>
</body>
</html>