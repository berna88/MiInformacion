package com.consistent.cuervo.miinformacion.portlet.portlet;

import com.consistent.cuervo.miinformacion.portlet.constants.PortletInformacionPortletKeys;
import com.consistent.cuervo.miinformacion.portlet.models.Trabajador;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author bernardohernadez
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletInformacionPortletKeys.PortletInformacion,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PortletInformacionPortlet extends MVCPortlet {
	private static Log log = LogFactoryUtil.getLog(PortletInformacionPortlet.class.getName());
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		try {
			User user = PortalUtil.getUser(renderRequest);
			Trabajador trabajador = new Trabajador(user);
			if(trabajador.getUser() != null) {
			log.info("<--- Logeado --->");
			renderRequest.setAttribute("trabajador", trabajador);
			}else {
			log.info("<---No logeado --->");
			Trabajador trabajadorSinConexion = new Trabajador();
			renderRequest.setAttribute("trabajador", trabajadorSinConexion);
			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Obtiene el usuario en sesion
		
		super.render(renderRequest, renderResponse);
	}
}