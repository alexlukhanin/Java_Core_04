package ua.lviv.lgs.composition;

public class SteeringWheel {

	private double diameter;
	private String material;

	public SteeringWheel(double diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}

	public double multiplyDiameter(double coefficient) {
		return coefficient * this.diameter;
	}

	public void changeMaterial(String newMaterial) {
		this.material = newMaterial;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [diameter=" + diameter + ", material=" + material + "]";
	}

}
