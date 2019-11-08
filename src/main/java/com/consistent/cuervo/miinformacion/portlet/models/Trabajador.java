package com.consistent.cuervo.miinformacion.portlet.models;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.theme.ThemeDisplay;

public class Trabajador {
	private static Log log = LogFactoryUtil.getLog(Trabajador.class.getName());
	private String nombres;
	private String apellidos;
	private String idEmpleado;
	private String puesto;
	private String departamento;
	private String centroDeCostos;
	private String centroDeTrabajo;
	private String fechaDeIngreso;
	private String imagenPerfil;
	private ThemeDisplay themeDisplay;
	private User user;
	
	
	public String getImagenPerfil() {
		try {
			imagenPerfil = user.getPortraitURL(themeDisplay);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			log.error("method:getImagenPerfil"+e.getMessage());
			imagenPerfil = "";
			e.printStackTrace();
		}
		return imagenPerfil;
	}
	public void setImagenPerfil(String imagenPerfil) {
		this.imagenPerfil = imagenPerfil;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getNombres() {
		try {
			nombres = (String) user.getExpandoBridge().getAttribute("Nombres");
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Method: getNombres");
			nombres = "";
		}
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		try {
			apellidos = (String) user.getExpandoBridge().getAttribute("Apellido_Materno");
			apellidos += " "+ (String) user.getExpandoBridge().getAttribute("Apellido_Paterno");
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Method: getApellidos");
			apellidos = "";
		}
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIdEmpleado() {
		try {
			idEmpleado = (String) user.getExpandoBridge().getAttribute("No_Empleado");
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Method: getIdEmpleado");
			idEmpleado = "";
		}
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getPuesto() {
		try {
			puesto = (String) user.getExpandoBridge().getAttribute("Desc_Puesto_Trabajo");
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Method: getPuesto");
			puesto = "";
		}
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDepartamento() {
		try {
			departamento = (String) user.getExpandoBridge().getAttribute("Desc_Depto");
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Method: getDepartamento");
			departamento = "";
		}
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCentroDeCostos() {
		try {
			centroDeCostos = (String) user.getExpandoBridge().getAttribute("Clave_Centro_Costos");
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Method: getCentroDeCostos");
			centroDeCostos = "";
		}
		return centroDeCostos;
	}
	public void setCentroDeCostos(String centroDeCostos) {
		this.centroDeCostos = centroDeCostos;
	}
	public String getCentroDeTrabajo() {
		try {
			centroDeTrabajo = (String) user.getExpandoBridge().getAttribute("Clave_Puesto_Trabajo");
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Method: getCentroDeTrabajo");
			centroDeTrabajo = "";
		}
		return centroDeTrabajo;
	}
	public void setCentroDeTrabajo(String centroDeTrabajo) {
		this.centroDeTrabajo = centroDeTrabajo;
	}
	public String getFechaDeIngreso() {
		try {
			fechaDeIngreso = (String) user.getExpandoBridge().getAttribute("Fecha_Antiguedad");
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Method: getFechaDeIngreso");
			fechaDeIngreso = "";
		}
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	public Trabajador(String nombres, String apellidos, String idEmpleado, String puesto, String departamento,
			String centroDeCostos, String centroDeTrabajo, String fechaDeIngreso) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.idEmpleado = idEmpleado;
		this.puesto = puesto;
		this.departamento = departamento;
		this.centroDeCostos = centroDeCostos;
		this.centroDeTrabajo = centroDeTrabajo;
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	public Trabajador(User user,ThemeDisplay themeDisplay) {
		this.user = user;
		this.themeDisplay = themeDisplay;
	}
	public Trabajador() {
		this.nombres = "";
		this.apellidos = "";
		this.idEmpleado = "";
		this.puesto = "";
		this.departamento = "";
		this.centroDeCostos = "";
		this.centroDeTrabajo = "";
		this.fechaDeIngreso = "";
	}
}
