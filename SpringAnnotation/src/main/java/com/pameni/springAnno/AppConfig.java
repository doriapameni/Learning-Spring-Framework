package com.pameni.springAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * how to create beans using bean tags
 */
@Configuration
public class AppConfig {

  @Bean
  public Samsung getPhone() {
    return new Samsung ();
  }
  
  @Bean
  public MobileProcessor getProcessor() {
    return new Snapdragon();
  }
 
}
