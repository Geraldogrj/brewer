package com.algaworks.brewer.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.algaworks.brewer.config.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Essa classe é responsável por fornecer ao Dispatcher mecanismos de achar o Controller
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	/**
	 * Como eu coloquei "/" tudo que vier da aplicação será entregue ao DispatcherServlet
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
