<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<%--<a href="account/findAll">测试</a>
<form action="account/save" method="post">
    姓名：<input type="text" name="name"/><br>
    金额：<input type="text" name="money"/><br>
    <input type="submit" value="提交"/><br>
</form>--%>
<%--<a href="${pageContext.request.contextPath}/product/findAll.do">查询所有的产品信息</a>--%>
<jsp:forward page="/pages/main.jsp"></jsp:forward>
</form>
</body>
</html>
