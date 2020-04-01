package com.centric.stepdefinition;

import com.centric.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions {
	
	Commonactions ca = new Commonactions();

	
	@Before
	public void before() {

		 ca.launch("http://win16sql19-ccd.centricsoftware.com/WebAccess/login.html");

	}
	
	@After
	public void after() {
		
		

		
	}

}
