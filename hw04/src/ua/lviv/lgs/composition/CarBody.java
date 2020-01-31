package ua.lviv.lgs.composition;

public class CarBody {

	private double height;
	private double width;
	private double length;

	public CarBody(double height, double width, double length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public double multiplyHeight(double coefficient) {
		return coefficient * this.height;
	}

	public double multiplyWidth(double coefficient) {
		return coefficient * this.width;
	}

	public double multiplyLength(double coefficient) {
		return coefficient * this.length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "CarBody [height=" + height + ", width=" + width + ", length=" + length + "]";
	}

}
