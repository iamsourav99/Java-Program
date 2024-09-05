<%--Import JSTL  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="num1" value="${10}"/>
<c:set var="num2" value="${20}"/>
<br>
<h1>Welcome to the JSTL</h1>
<%--use of ndition checking  --%>
<c:choose>
	<c:when test="${num1 gt num2 }">
		Big:<c:out value="${num1 }"></c:out>
	</c:when>
	<c:otherwise>
		Big:<c:out value="${num2 }"></c:out>
	</c:otherwise>
</c:choose>
<%-- Sum:<c:out value="${num1+ num2}"/> --%>
<%-- for loop--%> 
<br>
  <c:forEach var="i" begin="1" end="10">
  		<c:out value="${i }"></c:out>
  		<br>
  </c:forEach>
 <%-- collection of  items  --%>
 <c:forTokens items="apple,mango,banana" delims="," var="fruits">
 	<c:out value="${fruits }"></c:out>
 </c:forTokens>