package net.stephou.start.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Stéphane Timmermans
 * @version 1.0
 */
@Configuration
@ComponentScan(basePackages = "net.stephou.start.mvc", excludeFilters = {@Filter(Configuration.class)})
@PropertySource("classpath:net/stephou/start/mvc/config/application.properties")
@EnableTransactionManagement
public class MainConfig {
}
