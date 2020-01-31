package ua.lviv.lgs.composition;

public class Application {

	public static void main(String[] args) {

		double k1 = 1.5; // for Wheel class modification
		double k2 = 0.75; // for SteeringWheel class modification
		Wheel wheel = new Wheel(16.5, 7.2);
		Wheel wheel2 = new Wheel(17.5, 8.0);
		SteeringWheel steeringWheel = new SteeringWheel(18.2, "wooden");
		SteeringWheel steeringWheel2 = new SteeringWheel(19.5, "wooden2");
		CarBody carBody = new CarBody(84, 30.5, 120.5);
		CarBody carBody2 = new CarBody(82, 31.5, 114.5);
		Car car = new Car("red", "Mazda RX-5", 1520, wheel, steeringWheel, carBody);
		Car car2 = new Car("black", "Mercedes SLX-500", 2200, wheel2, steeringWheel2, carBody2);

		System.out.println("Before modification");
		System.out.println("First car:");
		System.out.println(car);
		System.out.println("Second car:");
		System.out.println(car2);

		wheel.setRadius(wheel.multiplyRadius(k1));
		wheel.setWidth(wheel.multiplyWidth(1.2));

		steeringWheel.setDiameter(steeringWheel.multiplyDiameter(k2));
		steeringWheel.changeMaterial("iron");

		carBody.setHeight(carBody.multiplyHeight(0.8));
		carBody.setLength(carBody.multiplyLength(0.75));
		carBody.setWidth(carBody.multiplyWidth(1.1));

		car.changeColor("green");
		car.changeWeight(1200.5);
		car.changName("Suzuki K-500");

		car2.changeSteeringWheel(steeringWheel);
		car2.changeWheel(wheel);

		System.out.println("\nAfter modification");
		System.out.println("First car:");
		System.out.println(car);
		System.out.println("Second car:");
		System.out.println(car2);

	}

}
