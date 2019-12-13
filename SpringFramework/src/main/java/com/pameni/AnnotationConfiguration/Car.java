package com.pameni.AnnotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
  
  public void drive() {
    System.out.println("I'm driving yout car :)");
  }

}
