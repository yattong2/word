package container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = {
		"com.my.account.control",
		"com.my.board.control"
})
@EnableWebMvc // WebApplicationContext컨테이너 구동 설정파일
public class ServletContext implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://192.168.0.26:5500")
				.allowCredentials(true)
				.allowedMethods("GET","POST","PUT","DELETE");
	}
	
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver cmr = new CommonsMultipartResolver();
		cmr.setDefaultEncoding("utf-8");
		cmr.setMaxUploadSize(1024*10000);
		cmr.setMaxUploadSizePerFile(1024*10000);
		return cmr;
	}
	
	
			
}

