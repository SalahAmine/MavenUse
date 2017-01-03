package com.packt.samples;

import org.apache.log4j.Logger;


public class Main {

	final static Logger log = Logger.getLogger(Main.class);

	
	public static void main(String[] args) {
		
		log.error("this is an error message");
		log.debug("this is a debug message");

	}

}
