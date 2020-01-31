package ua.lviv.lgs.inherit;

public class CoffeRobot extends Robot {

	public CoffeRobot() {
		super();
		this.name = "CoffeRobot";
		this.doingWork = "варю каву";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CoffeRobot [name=" + name + "]";
	}

}
