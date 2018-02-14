package featuretests;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;

public class SimpleFeature {

	@Given ("^Something is going on$")
	public void somethingsgoingOn() {
		System.out.println("Something is going on!");
	}

	@When ("^Another thing is happening$")
	public void anotherThing() {
		System.out.println("Another thing is happening!");
	}

	@Given ("^The shit hits the fan$")
	public void shitHitsFan() {
		System.out.println("The shit hits the fan!");
	}

	@Then ("^Everything should be fine anyway\\.$")
	public void vergleicheSollzeit() {
		System.out.println("Everything is fine!");
	}
}
