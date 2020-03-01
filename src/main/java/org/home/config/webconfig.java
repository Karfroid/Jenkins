package org.home.config;

import java.util.ArrayList;
import java.util.List;

import org.home.viewresolver.JsonViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.home")

public class webconfig extends WebMvcConfigurerAdapter
{
	

	  @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	       configurer.enable();
	    
    }
	
	@Bean
    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setContentNegotiationManager(manager);
 
        // Define all possible view resolvers
        List<ViewResolver> resolvers = new ArrayList<ViewResolver>();
        
 
//        resolvers.add(jaxb2MarshallingXmlViewResolver());
          resolvers.add(jsonViewResolver());
//        resolvers.add(jspViewResolver());
//        resolvers.add(pdfViewResolver());
//        resolvers.add(excelViewResolver());
        
        resolver.setViewResolvers(resolvers);
        return resolver;
    }

	private ViewResolver jsonViewResolver() {
		return new JsonViewResolver();
	}
}
