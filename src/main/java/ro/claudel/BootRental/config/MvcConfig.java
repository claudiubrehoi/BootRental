package ro.claudel.BootRental.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/new-client").setViewName("new-client");
        registry.addViewController("/new-product").setViewName("new-product");
        registry.addViewController("/new-rental").setViewName("new-rental");
        registry.addViewController("/login").setViewName("login");
    }

}
