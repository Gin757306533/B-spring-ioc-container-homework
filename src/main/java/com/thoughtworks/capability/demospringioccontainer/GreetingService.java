package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class GreetingService {
    public GreetingService(){
        System.out.println("this will create a new GreetingService");
    }

    String sayHi() {
        return "hello world";
    }
}
