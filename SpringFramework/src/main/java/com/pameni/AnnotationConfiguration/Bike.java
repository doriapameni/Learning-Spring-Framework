package com.pameni.AnnotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
  
  public void drive() {
    System.out.println("I'm riding your bike :)");
  }

}
