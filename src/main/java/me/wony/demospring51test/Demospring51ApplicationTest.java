package me.wony.demospring51test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class Demospring51ApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(Demospring51ApplicationTest.class,args);
    }

    @Bean
    public MessageSource test(){
        MessageSource reloadableResourceBundleMessageSource= new ReloadableResourceBundleMessageSource();
        ((ReloadableResourceBundleMessageSource) reloadableResourceBundleMessageSource).setBasename("classpath/messsages");
        ((ReloadableResourceBundleMessageSource) reloadableResourceBundleMessageSource).setDefaultEncoding("UTF-8");
        ((ReloadableResourceBundleMessageSource) reloadableResourceBundleMessageSource).setCacheSeconds(3);
        return reloadableResourceBundleMessageSource;
    }

}
