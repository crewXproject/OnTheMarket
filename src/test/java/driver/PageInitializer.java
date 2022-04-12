package driver;

import pages.*;

public class PageInitializer extends Driver {

	public static commonPage comm;
	public static buyPage buy;
	public static rentPage rent;
	public static rentPage rentButton;
	public static agentsPage agents;
	public static signinPage signin;
	public static newHomesPage newHomes;
	public static retirementProperties retireHome;

	public static void initialize() {
		comm = new commonPage();
		buy = new buyPage();
		rent = new rentPage();
		agents = new agentsPage();
		signin = new signinPage();
		newHomes = new newHomesPage();
		rentButton=new rentPage();
		retireHome = new retirementProperties();
	}
}
