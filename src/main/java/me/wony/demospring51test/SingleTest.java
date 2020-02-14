package me.wony.demospring51test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingleTest {

    @Autowired
    ProtoTest proto;

    public ProtoTest getProto(){
        return proto;
    }
}
