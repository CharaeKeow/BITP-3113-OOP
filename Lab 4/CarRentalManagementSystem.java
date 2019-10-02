//Main class
//camelCase for method
//PascalCase for name of class
public class CarRentalManagementSystem {	
	public static void main(String[] args) {
		CarManager carManager = new CarManager(10);
		
		//create car obj
		Car car1 = new Car();
		car1.setCarID(1001);
		car1.setPlateNo("DAM 2501");
		car1.setModel("Perodua Kancil");
		car1.setPrice(5);
		car1.setCapacity(4);
		car1.setAuto(false);
		car1.setUsable(true);
		
		Car car2 = new Car();
		car2.setCarID(1101);
		car2.setPlateNo("CAM 2511");
		car2.setModel("Perodua Avanza");
		car2.setPrice(7);
		car2.setCapacity(8);
		car2.setAuto(true);
		car2.setUsable(false);		
		
		Car car3 = new Car();
		car3.setCarID(1111);
		car3.setPlateNo("DGH 8888");
		car3.setModel("Perodua Myvi");
		car3.setPrice(6);
		car3.setCapacity(5);
		car3.setAuto(true);
		car3.setUsable(true);		
		
		if (carManager.addCar(car1) != 0) {
			System.out.println("Car added!");
		} else {
			System.out.println("Car not added!");
		}
		
		if (carManager.addCar(car2) != 0) {
			System.out.println("Car added!");
		} else {
			System.out.println("Car not added!");
		}
		
		if (carManager.addCar(car3) != 0) {
			System.out.println("Car added!");
		} else {
			System.out.println("Car not added!");
		}
	}
}