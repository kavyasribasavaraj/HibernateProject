package com.src.service.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.src."}) /* go to the classes in that package and check all classes which have @Component and create 
										  bean of that particular class*/
public class MyConfigClass {

}
