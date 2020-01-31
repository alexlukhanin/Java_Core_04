package ua.lviv.lgs.inherit;

public class Robot {

	String name; // ��� default - ����������� ��������
	String doingWork; // ��� default - ����������� ��������

	public Robot() {
		super();
		this.name = "Robot";
		this.doingWork = "������ ������";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ---------- the inherit metod --------------
	public void work() {
		System.out.println("� " + this.name + " - � " + this.doingWork);
	}

	// --------------------------------------------
	@Override
	public String toString() {
		return "Robot [name=" + name + "]";
	}

}
