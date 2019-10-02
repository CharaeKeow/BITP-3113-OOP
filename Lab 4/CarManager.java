public class CarManager {
	
	//As we still have no DB for now, array is used
	//to simulate dealing with DB
	private Car[] cars; 
	//Why private? Because we want only this obj to access 
	//this class
	
	private int count; //Keep track of num of items in array
	
	//Constructor (same as class name)
	public CarManager(int length) {
		cars = new Car[length]; //creating new object!
	}
	
	int addCar(Car car) {
		int status = 0;
		
		if (count < cars.length) {			
			//cars[count] = car; //add to array
			//count++;
			
			cars[count++] = car; //simplicied, using post-increment
			status = count; 
		}
		
		return status; //check if addition is successful
	}
}