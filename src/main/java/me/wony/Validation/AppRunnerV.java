package me.wony.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRunnerV implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Event event = new Event();
        EventValidator eventValidator = new EventValidator();
        Errors errors = new BeanPropertyBindingResult(event,"eve1nt");

        //eventValidator.validate(event,errors);
        validator.validate(event,errors);
        System.out.println(errors.hasErrors());
        errors.getAllErrors().forEach(e->{
            System.out.println("===error code===");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println("Default"+e.getDefaultMessage());
        });
    }
}
