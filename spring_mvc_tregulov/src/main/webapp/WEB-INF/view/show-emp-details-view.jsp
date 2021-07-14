<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, you are WELCOME!!!</h2>
<%--<h4>Your name: ${param.employeeName}</h4>--%>
<h4>Your name: ${employeeAttr.name}</h4>
<h4>Your surname: ${employeeAttr.surname}</h4>
<h4>Your phone number: ${employeeAttr.phoneNumber}</h4>
<h4>Your email: ${employeeAttr.email}</h4>
<h4>Your salary: ${employeeAttr.salary} $</h4>
<h4>Your department: ${employeeAttr.department}</h4>
<h4>Your car: ${employeeAttr.carBrand}</h4>
<h4>Language(s): </h4>
<ul>
    <c:forEach var="lang" items="${employeeAttr.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>

</body>

</html>