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
	
	//Getter
	//as no longer needed:
	//can delete but need to replace with calls to getUniqueID
	public int getCarID() {
		//return carID;
		return uniqueID; //inherited
	}
	
	public String getPlateNo() {
		return plateNo;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public boolean isAuto() {
		return Auto;
	};
	public boolean isUsable() {
		return Usable;
	};
	
	//Setter
	/*public void setCarID(int carID) {
		this.carID = carID;
	} */	
	
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setAuto(boolean Auto) {
		this.Auto = Auto;
	}
	
	public void setUsable(boolean Usable) {
		this.Usable = Usable;
	}
}

