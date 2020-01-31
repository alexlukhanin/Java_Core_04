package ua.lviv.lgs.third;

public class Application {

	public static void main(String[] args) {

		Animal animal = new Animal("Black Mamba", 10.5, 5); // in honor of Kobe Bryant!

		String name = animal.getName();
		double speed = animal.getSpeed();
		int age = animal.getAge();
		// - зі змінними читабильніше
		System.out.println(
				"Animal name = " + name + ", Animal speed = " + speed + " kmph, Animal age = " + age + " years"); // по-англійські
																													// цікавіше
																													// :)
		System.out.println("Назва тварини = " + name + ", Швидкість тварини = " + speed + " км/год, Вік тварини = "
				+ age + " років"); // локалізовано

		animal.setName("Hawk");
		animal.setSpeed(45.9);
		animal.setAge(2);

		name = animal.getName();
		speed = animal.getSpeed();
		age = animal.getAge();
		System.out.println("\n");
		System.out.println(
				"Animal name = " + name + ", Animal speed = " + speed + " kmph, Animal age = " + age + " years");
		System.out.println("Назва тварини = " + name + ", Швидкість тварини = " + speed + " км/год, Вік тварини = "
				+ age + " років");

	}

}
