package ua.lviv.lgs.inherit;

public class Robot {

	String name; // тип default - унаслідується нащадком
	String doingWork; // тип default - унаслідується нащадком

	public Robot() {
		super();
		this.name = "Robot";
		this.doingWork = "просто працюю";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ---------- the inherit metod --------------
	public void work() {
		System.out.println("Я " + this.name + " - я " + this.doingWork);
	}

	// --------------------------------------------
	@Override
	public String toString() {
		return "Robot [name=" + name + "]";
	}

}
