package ua.lviv.lgs.inherit;

public class RobotCooker extends Robot {

	public RobotCooker() {
		super();
		this.name = "RobotCooker";
		this.doingWork = "просто готую";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RobotCooker [name=" + name + "]";
	}

}
