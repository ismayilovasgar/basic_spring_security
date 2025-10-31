package com.ismayilov.spring.security.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ismayilov.spring.security")
public class ApplicationConfig {

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

    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/my_db?useSSL=false");
            dataSource.setUser("root");
            dataSource.setPassword("a123@!");
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
        return dataSource;

        //  <bean id = "dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource"
        //     destroy - method = "close" >
        //     <property name = "driverClass" value = "com.mysql.cj.jdbc.Driver" / >
        //     <property name = "jdbcUrl" value = "jdbc:mysql://localhost:3306/my_db?useSSL=false" / >
        //     <property name = "user" value = "root" / >
        //     <property name = "password" value = "a123@!" / >
        // </bean >
    }

}
