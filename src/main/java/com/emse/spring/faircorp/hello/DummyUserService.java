package com.emse.spring.faircorp.hello;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DummyUserService {

    private final GreetingService greetingService;

    public DummyUserService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public void greetAll(){
        List<String> names = Arrays.asList("Elodie", "Charles");
        for(String element : names){
            greetingService.greet(element);
        }

    }

}
