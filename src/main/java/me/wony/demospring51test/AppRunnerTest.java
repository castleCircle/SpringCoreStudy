package me.wony.demospring51test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunnerTest implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("proto");
        System.out.println(ctx.getBean(ProtoTest.class));
        System.out.println(ctx.getBean(ProtoTest.class));

        System.out.println("single");
        System.out.println(ctx.getBean(SingleTest.class));
        System.out.println(ctx.getBean(SingleTest.class));

        System.out.println("proto by single");
        System.out.println(ctx.getBean(SingleTest.class).getProto());
        System.out.println(ctx.getBean(SingleTest.class).getProto());
    }
}
