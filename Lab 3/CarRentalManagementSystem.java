//Main class
//camelCase for method
//PascalCase for name of class
public class CarRentalManagementSystem {
	public static void main(String[] args) {
		CarManager carManager = new CarManager(10);
		
		//create car obj
		Car car1 = new Car();
		car1.carID = 1001;
		car1.plateNo = "DAM 2501";
		car1.model = "Perodua Kancil";
		car1.price = 5;
		car1.capacity = 5;
		car1.isAuto = false;
		car1.isUsable = true;
		
		Car car2 = new Car();
		car2.carID = 1101;
		car2.plateNo = "CAM 2511";
		car2.model = "Perodua Avanza";
		car2.price = 7;
		car2.capacity = 8;
		car2.isAuto = true;
		car2.isUsable = false;		
		
		Car car3 = new Car();
		car3.carID = 1111;
		car3.plateNo = "DGH 8888";
		car3.model = "Perodua Myi";
		car3.price = 6;
		car3.capacity = 5;
		car3.isAuto = true;
		car3.isUsable = true;		
		
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