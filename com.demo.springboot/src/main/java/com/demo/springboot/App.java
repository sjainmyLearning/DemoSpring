package com.demo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{


	public static void main( String[] args )
    {

    	SpringApplication.run(App.class, args);
        // a new text for testing
        // one more comment is added
        // comment - 2
<<<<<<< HEAD
        //comment added after update from another source
=======
	// comment added from different source 
>>>>>>> 3860de93854dff38cc493352d9c5bd605a2d49a2
    }

}
