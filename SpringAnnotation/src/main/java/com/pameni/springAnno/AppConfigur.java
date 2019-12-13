package com.pameni.springAnno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * how to create beans without using bean tags
 * annotation component
 * autowired primary qualifier
 * 
 * if you have multiple packages, you can specify multiple packages 
 * using coma.
 */
@Configuration
@ComponentScan(basePackages="com.pameni.springAnno")
public class AppConfigur {

 
}
