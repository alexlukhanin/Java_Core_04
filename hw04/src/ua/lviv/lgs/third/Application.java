package ua.lviv.lgs.third;

public class Application {

	public static void main(String[] args) {

		Animal animal = new Animal("Black Mamba", 10.5, 5); // in honor of Kobe Bryant!

		String name = animal.getName();
		double speed = animal.getSpeed();
		int age = animal.getAge();
		// - � ������� �����������
		System.out.println(
				"Animal name = " + name + ", Animal speed = " + speed + " kmph, Animal age = " + age + " years"); // ��-��������
																													// �������
																													// :)
		System.out.println("����� ������� = " + name + ", �������� ������� = " + speed + " ��/���, ³� ������� = "
				+ age + " ����"); // �����������

		animal.setName("Hawk");
		animal.setSpeed(45.9);
		animal.setAge(2);

		name = animal.getName();
		speed = animal.getSpeed();
		age = animal.getAge();
		System.out.println("\n");
		System.out.println(
				"Animal name = " + name + ", Animal speed = " + speed + " kmph, Animal age = " + age + " years");
		System.out.println("����� ������� = " + name + ", �������� ������� = " + speed + " ��/���, ³� ������� = "
				+ age + " ����");

	}

}
