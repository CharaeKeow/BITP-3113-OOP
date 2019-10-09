public class Rental {
	private int rentalID;
	private Car car; //instead of using id, why not using class here for simplication
	private Customer customer;
	private long start;
	private int duration;
	private double total;
	
	//Getter
	public int getRental() {
		return rentalID;
	}
	
	
	public Car getCarID() {
		return car;
	}
	
	public Customer getCustomerID() {
		return customer;
	}
	
	
	public long getStart() {
		return start;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public double getTotal() {
		return total;
	}
	
	//Setter
	
	public void setRentalID(int rentalID) {
		this.rentalID = rentalID;
	}
	
	public void setCarID(Car car) {
		this.car = car;
	}
	
	public void setCustomerID(Customer customer) {
		this.customer = customer;
	}
	
	public void setStart(long start) {
		this.start = start;
	}
	
	public void setDuration(int duration) {
		if (duration > 0) {
			this.duration = duration;
			this.total = duration * car.getPrice(); //calculate the total here
		}
	}
	
	/*Total setter is not needed because it could be derived
	public void setTotal(double total) {
		this.total = total;
	} */
}

