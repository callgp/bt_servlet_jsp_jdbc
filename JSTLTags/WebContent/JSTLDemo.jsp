<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="${10+9}"/>

<c:set var="testScore" value="${80}" scope="session"/>
<c:out value="${testScore}"/>


<c:set var="testRemove" value="${800}" scope="session"/>
<c:out value="${testRemove}"/>

<c:remove var="testRemove" />
after removal value is <c:out value="${testRemove}"/>
</body>
</html>