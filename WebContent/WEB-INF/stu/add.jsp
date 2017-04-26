<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>新增学生信息</legend>
		<form action="${pageContext.request.contextPath }/stu/studentAction/addStudent.do" method="post">
			<s:textfield label="姓名" name="student.stuName" />
			<s:radio label="性别" name="student.stuSex" list="{'男','女'}" value="'男'" />
			<s:select list="types" name="student.type.typeId" headerKey="" headerValue="--请选择--" listKey="typeId" listValue="typeName" />
			<s:submit value="确定" />
		</form>
	</fieldset>
</body>
</html>