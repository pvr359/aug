package welltech.config;

import lodsve.web.webservice.EnableWebService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * .
 *
 * @author ram
 */
@Configuration
@EnableWebService
@ComponentScan(value = {"welltech.service"})
@ImportResource({"classpath*:/META-INF/spring/*.xml"})
public class AppConfig {

}