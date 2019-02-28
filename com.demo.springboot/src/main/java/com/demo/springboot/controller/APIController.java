package com.demo.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;

@RestController
public class APIController {

	@RequestMapping("/home")
	public String home() {
		return "Home page, reporting for duty!";
	}
	
	
	@RequestMapping(value="/readFile/{filename}",method=RequestMethod.GET)
	public String ReadFile(@PathVariable String filename) throws IOException {
		
		FileInputStream in = null;
	    FileOutputStream out = null;
	    
	    
	    // docker build -f dockerfile -t demofile/app .
	    
	    // docker run -d -p 8080:8080 -v /tmp demofile/app
	    
	    // docker run -d -p 8080:8080 -v /Users/mac/demodir:/host/demodir demofile/app
	    
	 // docker run -d -p 8080:8080 -v /Users/mac/demodir:/host/demodir -w "/host/demodir" demofile/app
	    
	    //VOLUME /Users/mac/demodir:/host/demodir
	    
	     //String fileName_1="/Users/mac/demodir/testfile.txt";
	     System.out.println("Sandebug: inside the program");
	     String fileName_1="/host/demodir/testfile.txt";
	     String fileName_o="/host/demodir/output.txt";
	      try {
	          in = new FileInputStream(fileName_1);
	          out = new FileOutputStream("output1.txt");
	          
	          int c;
	          while ((c = in.read()) != -1) {
	             out.write(c);
	             //System.out.println(in.toString());
	          }
	       }finally {
	          if (in != null) {
	             in.close();
	          }
	          if (out != null) {
	             out.close();
	          }
	       }
	      System.out.println("outfile file is: "+out.toString());
	      return "Input file is: " + fileName_1;
	}
	
}
