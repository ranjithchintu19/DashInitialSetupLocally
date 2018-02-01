package org.ranjith.QuickStart.DashLocalSetupForMaven;

/**
 * Hello world!
 *
 */
public class App {
	public int addition(int a, int b) {
		return a + b;
	}

	public int Subtraction(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {

		App ap = new App();
		ap.addition(2, 3);
		ap.Subtraction(5, 2);
	}
}
