package ua.lviv.lgs.inherit;

public class RobotDancer extends Robot {

	public RobotDancer() {
		super();
		this.name = "RobotDancer";
		this.doingWork = "просто танцюю";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RobotDancer [name=" + name + "]";
	}

}
