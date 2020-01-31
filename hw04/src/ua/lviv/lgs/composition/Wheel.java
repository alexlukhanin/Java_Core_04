package ua.lviv.lgs.composition;

public class Wheel {

	private double radius;
	private double width;

	public Wheel(double radius, double width) {
		super();
		this.radius = radius;
		this.width = width;
	}

//-----------------------

	public double multiplyRadius(double coefficient) {
		return coefficient * this.radius;
	}

	public double multiplyWidth(double coefficient) {
		return coefficient * this.width;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", width=" + width + "]";
	}

}
