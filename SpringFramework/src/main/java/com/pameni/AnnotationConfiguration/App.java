package com.pameni.AnnotationConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
      ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfiguration.xml");
      
      //for the configuration based annotation you define the type of vehicle you want
      //to call here. Inside the spring.xml, you only specify the package to scan.
      // notice that even though your class is Car or Bike with upper case, it still find it
      Vehicle obj = (Vehicle)context.getBean("bike"); 
      
      obj.drive();
    }
}
