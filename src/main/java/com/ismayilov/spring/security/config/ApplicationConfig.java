package com.ismayilov.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.ismayilov.spring.security")
@EnableWebMvc
public class ApplicationConfig {

    //     <bean id="viewResolver"
    //    class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    //        <property name="prefix" value="/WEB-INF/view/"/>
    //        <property name="suffix" value=".jsp"/>
    //    </bean>

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
        //     <bean id="viewResolver"
        //    class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        //        <property name="prefix" value="/WEB-INF/view/"/>
        //        <property name="suffix" value=".jsp"/>
        //    </bean>
    }

}
