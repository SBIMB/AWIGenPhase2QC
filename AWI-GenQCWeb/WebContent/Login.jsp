<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>AWI-Gen QC Login</title>
</head>
<body>
	<form action="j_security_check" method="post">
            <p>username: <input type="text" name="j_username"/></p>
            <p>password: <input type="password" name="j_password"/></p>
            <input type="submit" value="submit"/>
            <input type="reset" value="Reset"/> 
</form>
</body>
</html>
</jsp:root>