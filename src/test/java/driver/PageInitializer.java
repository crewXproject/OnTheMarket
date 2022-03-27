package driver;

import pages.*;

public class PageInitializer extends Driver {

	public static commonPage comm;
	public static buyPage buy;
	public static rentPage rent;
	public static agentsPage agents;
	public static signinPage signin;

	public static void initialize() {
		comm = new commonPage();
		buy = new buyPage();
		rent = new rentPage();
		agents = new agentsPage();
		signin = new signinPage();
	}
}
