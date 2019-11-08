<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <section class="row">
		<article class="col-md-12">
			<section class="row ">
				<article class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
					<h5 class="conceptos">ID de empleado:</h5>
				</article>
				<article class="col-6 offset-sm-1 col-sm-5 offset-md-1 col-md-5 offset-lg-1 col-lg-5 offset-xl-2 col-xl-4">
					<h5 class="fw-g conceptos"><%= usuario.getIdEmpleado() %></h5>
				</article>
			</section>
		</article><!-- Fin articulo -->
		<article class="col-md-12">
			<section class="row ">
				<article class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
					<h5 class="conceptos">Puesto:</h5>
				</article>
				<article class="col-6 offset-sm-1 col-sm-5 offset-md-1 col-md-5 offset-lg-1 col-lg-5 offset-xl-2 col-xl-4">
					<h5 class="fw-g conceptos"><%= usuario.getPuesto() %></h5>
				</article>
			</section>
		</article><!-- Fin articulo -->
		<article class="col-md-12">
			<section class="row ">
				<article class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
					<h5 class="conceptos">Departamento:</h5>
				</article>
				<article class="col-6 offset-sm-1 col-sm-5 offset-md-1 col-md-5 offset-lg-1 col-lg-5 offset-xl-2 col-xl-4">
					<h5 class="fw-g conceptos"><%= usuario.getDepartamento() %></h5>
				</article>
			</section>
		</article><!-- Fin articulo -->
		<article class="col-md-12">
			<section class="row ">
				<article class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
					<h5 class="conceptos">Centro de Costos:</h5>
				</article>
				<article class="col-6 offset-sm-1 col-sm-5 offset-md-1 col-md-5 offset-lg-1 col-lg-5 offset-xl-2 col-xl-4">
					<h5 class="fw-g conceptos"><%= usuario.getCentroDeCostos() %></h5>
				</article>
			</section>
		</article><!-- Fin articulo -->
		<article class="col-md-12">
			<section class="row ">
				<article class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
					<h5 class="conceptos">Centro de Trabajo:</h5>
				</article>
				<article class="col-6 offset-sm-1 col-sm-5 offset-md-1 col-md-5 offset-lg-1 col-lg-5 offset-xl-2 col-xl-4">
					<h5 class="fw-g conceptos"><%= usuario.getCentroDeTrabajo() %></h5>
				</article>
			</section>
		</article><!-- Fin articulo -->
		<article class="col-md-12">
			<section class="row ">
				<article class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
					<h5 class="conceptos">Fecha de ingreso:</h5>
				</article>
				<article class="col-6 offset-sm-1 col-sm-5 offset-md-1 col-md-5 offset-lg-1 col-lg-5 offset-xl-2 col-xl-4">
					<h5 class="fw-g conceptos"><%= usuario.getFechaDeIngreso() %></h5>
				</article>
			</section>
		</article><!-- Fin articulo -->
	</section><!-- Fin seccion -->