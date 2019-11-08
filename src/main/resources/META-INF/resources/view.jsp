<%@page import="com.consistent.cuervo.miinformacion.portlet.models.Trabajador"%>
<%@ include file="init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href='<%=request.getContextPath()+"/css/banner.css"%>'>
<link rel="stylesheet" type="text/css" href='<%=request.getContextPath()+"/css/logo.css"%>'>
<link rel="stylesheet" type="text/css" href='<%=request.getContextPath()+"/css/perfil.css"%>'>
<link rel="stylesheet" type="text/css" href='<%=request.getContextPath()+"/css/2.8.0/Chart.min.css"%>'>
<link rel="stylesheet" type="text/css" href='<%=request.getContextPath()+"/css/grafica.css"%>'>
<link rel="stylesheet" type="text/css" href='<%=request.getContextPath()+"/css/general.css"%>'>

<script src='<%=request.getContextPath()+"/js/2.8.0/Chart.min.js"%>'></script>
<%
Trabajador usuario = (Trabajador) request.getAttribute("trabajador");
%>
<%@ include file="jsp/header/banner.jsp" %>
<body id="miInformacion" class="container">
	<section class="row">
		<article class="offset-1 col-10 offset-sm-1 col-sm-10 offset-md-1 col-md-10 offset-lg-1 col-lg-6 offset-xl-1 col-xl-6">
			<%@ include file="jsp/body/informationUser.jsp" %>
			<hr class="hr-remuneracion">
			<%@ include file="jsp/body/dataUser.jsp" %>
		</article>
		<article class="col-12 col-sm-12 col-md-12 col-lg-4 col-xl-4">
			<%@ include file="jsp/body/grafica.jsp" %>
		</article>
	</section>
</body>

<script src='<%=request.getContextPath()+"/js/grafica.js"%>'></script>