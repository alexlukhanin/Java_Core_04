package ua.lviv.lgs.composition;

public class Car {

	private String color;
	private String modelName;
	private double weight;

	private Wheel wheel;
	private SteeringWheel steeringWheel;
	private CarBody carBody;

	public Car(String color, String modelName, double weight, Wheel wheel, SteeringWheel steeringWheel,
			CarBody carBody) {
		super();
		this.color = color;
		this.modelName = modelName;
		this.weight = weight;
		this.wheel = wheel;
		this.steeringWheel = steeringWheel;
		this.carBody = carBody;
	}

	public void changeColor(String newColor) {
		this.color = newColor;
	}

	public void changName(String newName) {
		this.modelName = newName;
	}

	public void changeWeight(double newWheight) {
		this.weight = newWheight;
	}

	public void changeWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void changeSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public CarBody getCarBody() {
		return carBody;
	}

	public void setCarBody(CarBody carBody) {
		this.carBody = carBody;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", modelName=" + modelName + ", weight=" + weight + ", wheel=" + wheel
				+ ", \nsteeringWheel=" + steeringWheel + ", \ncarBody=" + carBody + "]";
	}

}
