<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<section class="row alt">
	<article class="col-12" >
		<div class="logo">
			<img alt="" src='<%=request.getContextPath()+"/img/icon_igrow.png"%>'>
		</div>
		<div class="nombre">
			<section class="row">
				<article class="col-12 col-sm-12 col-md-12 col-lg-5 col-xs-5">
					<img id="img-perfil" alt="" src='<%=usuario.getImagenPerfil() %>'>
				</article>
				<article class="col-12 col-sm-12 col-md-12 col-lg-7 col-xs-7">
					<hgroup id="nombres">
						<h4 class="fw-g"><%= usuario.getApellidos() %></h4>
						<h2 class="bolder l-h" ><%= usuario.getNombres() %></h2>
					</hgroup>
				</article>
			</section>
		</div>
	</article>
</section>