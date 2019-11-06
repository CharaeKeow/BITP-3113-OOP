package model;

//Constructor, if not defined, will be added by compiler

public class Car extends Model {
	// private int carID; No longer required. We inherit from Model
	private String plateNo;
	private String model;
	private double price;
	private int capacity;
	private boolean Auto;
	private boolean Usable;
	
	public Car(int carID) {
		super(carID); //pass this constructor to superclass
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAuto() {
		return Auto;
	}

	public void setAuto(boolean auto) {
		Auto = auto;
	}

	public boolean isUsable() {
		return Usable;
	}

	public void setUsable(boolean usable) {
		Usable = usable;
	}
	

}

