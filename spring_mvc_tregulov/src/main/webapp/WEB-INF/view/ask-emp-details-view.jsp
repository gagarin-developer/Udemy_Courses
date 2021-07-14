<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please enter your details</h2>
<br>

<form:form action="showDetails" modelAttribute="employeeAttr">
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Phone number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department: <form:select path="department">
<%--    <form:options items="${employeeAttr.departments}"/>--%>
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>
    </form:select>
    <br><br>
    Which car do you want?
    <form:errors path="carBrand"/>
    <br>
    <form:radiobuttons path="carBrand" items="${employeeAttr.carBrands}"/>
<%--    MB<form:radiobutton path="carBrand" value="MERCEDES-BENZ"/>--%>
<%--    TESLA<form:radiobutton path="carBrand" value="TESLA"/>--%>
<%--    BMW<form:radiobutton path="carBrand" value="BMW"/>--%>
    <br><br>
    Foreign Language(s)?
    <br>
    <form:checkboxes path="languages" items="${employeeAttr.languageList}"/>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutsch"/>--%>
<%--    RU <form:checkbox path="languages" value="Russian"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>

    <br><br>
    <input type="submit" value="OK"/>


</form:form>

</body>

</html>