package me.wony.demospring51;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class Demospring51Application {

    public static void main(String[] args) {
        SpringApplication.run(Demospring51Application.class,args);
    }

    @Bean
    public MessageSource messageSource(){
        MessageSource messageSource  = new ReloadableResourceBundleMessageSource();
        ((ReloadableResourceBundleMessageSource) messageSource).setBasename("classpath:/messages");
        ((ReloadableResourceBundleMessageSource) messageSource).setDefaultEncoding("UTF-8");
        ((ReloadableResourceBundleMessageSource) messageSource).setCacheSeconds(3);
        return messageSource;
    }

}
