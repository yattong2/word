package container;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * web.xml문서를 대신할 클래스
 * @author NEW
 *
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {//스프링컨테이너를 구동할 초기설정 클래스
	//  /WEB-INF/myApplicationContext2.xml 설정파일을 대신할 클래스
		return new Class[] {ApplicationContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {//스프링 web mvc를위한 설정
	//	/WEB-INF/myServletContext.xml 설정파일을 대신할 클래스
		return new Class[] {ServletContext.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
