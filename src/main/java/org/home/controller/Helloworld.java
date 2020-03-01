package org.home.controller;

import javax.annotation.Generated;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	

    @RequestMapping(value="/home/sayhello", method = RequestMethod.GET)
    public String sayhello() {
    	
    	System.out.println("this is a test");
    	return "Hello Mava world" ;
    	
    }

  
}
