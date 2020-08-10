package com.mulesoft.training;

import org.junit.Ignore;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest  extends FunctionalTestCase {
	
	@Override
	protected String  getConfigFile() {
		return "maven-project.xml";
	}

	@Test @Ignore
	public void mavenFlowReturnsHelloMaven() throws Exception {
	runFlowAndExpect("mavenFlow", "Hello Maven");
	}
	
}
