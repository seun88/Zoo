package com.project.Hooks;

import com.project.common.BrowserClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;




public class Hook extends BrowserClass 
{
	@Before
	public void setUp()
	{
		launchBrowser("Headless");
	}
	
	@After
	public void TearDown()
	{
		closeBrowser();
	}

}
