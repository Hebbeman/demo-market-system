package jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class JbehaveExample extends MarketStory {
	
	@Given("prereq")
	public void prereq() {
		System.out.println("Setting up prerequisites...");
	}
	
	@When("actor interacts with system")
	public void actorInteracts() {
		System.out.println("Actor interacts");
	}
	
	@Then("systems state change")
	public void systemsStateChange() {
		System.out.println("System changed");
	}

}
