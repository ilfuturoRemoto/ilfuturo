package it.futuroprossimo.futuro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import it.futuroprossimo.action.FuturoController;
import it.futuroprossimo.configuration.JspConfig;


@SpringBootApplication
@ComponentScan("it.futuroprossimo.action")
@Import({JspConfig.class})
public class FuturoApplication extends SpringBootServletInitializer {
    private static final Logger logger = LoggerFactory.getLogger(FuturoApplication.class);
	
	private static Class applicationClass = FuturoApplication.class;
	
	public static void main(String[] args) {
		SpringApplication.run(FuturoApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(applicationClass);
	 }
}
