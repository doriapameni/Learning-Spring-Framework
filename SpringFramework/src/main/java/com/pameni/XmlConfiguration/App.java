package com.pameni.XmlConfiguration;

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
      //Car obj = new Car(); --> 2 dependencies(on left side and rigth side)
      //Vehicle obj = new Car(); --> still not good (dependent on new car)
      /**
       * WHat is getBean?
       * you can use getBean method from BeanFactory and from ApplicationContext
       * both are interface, so you need to call the constructor of one the class that 
       * implement the interface you choose to use.
       */
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      
      Vehicle obj = (Vehicle)context.getBean("vehicle"); //whatever vehicle I defined in the spring.xml, give it to me
      //advantage: we don't have to recompile, we just have to save because we are changing only the xml to get a bike 
      //or car. While using Car obj = new Car(), if we want a bike we are changing the source code.
      
      obj.drive();
    }
}
