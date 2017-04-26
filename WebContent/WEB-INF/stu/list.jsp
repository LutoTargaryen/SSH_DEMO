<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
	<fieldset>
		<legend>学生信息列表[<a href="${pageContext.request.contextPath }/stu/studentAction/initAdd.do">添加</a>]</legend>
		<table cellpadding="9" border="1" width="100%" align="center">
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>性别</th>
				<th>类型</th>
				<th>操作</th>
			</tr>
			<s:iterator value="students" var="stu">
				<tr align="center">
					<td>${stu.stuId }</td>
					<td>${stu.stuName }</td>
					<td>${stu.stuSex }</td>
					<td>${stu.type.typeName }</td>
					<td>
						<a href="${pageContext.request.contextPath }/stu/studentAction/deleteStudent.do?student.stuId=${stu.stuId }">删除</a> | 
						<a href="${pageContext.request.contextPath }/stu/studentAction/initUpdate.do?student.stuId=${stu.stuId }">修改</a>
					</td>
				</tr>
			</s:iterator>
			<s:if test="students.size == 0">
				<tr>
					<td colspan="5">
						<font color="red" size="-1">暂无操作数据，请添加</font>
					</td>
				</tr>	
			</s:if>		
		</table>
	</fieldset>
</body>
</html>