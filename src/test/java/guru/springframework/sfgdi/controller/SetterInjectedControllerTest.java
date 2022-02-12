package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;
    @BeforeEach
    void setup(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }


    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}