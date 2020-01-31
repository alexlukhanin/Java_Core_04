package ua.lviv.lgs.inherit;

public class Application {

	public static void main(String[] args) {

		Robot robot1 = new Robot();
		CoffeRobot robot2 = new CoffeRobot();
		RobotDancer robot3 = new RobotDancer();
		Robot robot4 = new RobotCooker(); // можна визначити змінну типом батьківського класу, або класу-нащадку, як
											// вище

		Robot[] arrayRobot = { robot1, robot2, robot3, robot4 };

		for (int i = 0; i < arrayRobot.length; i++) {

			arrayRobot[i].work();
		}

	}

}
