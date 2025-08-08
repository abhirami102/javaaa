package Bookjava;
class Vehicle{
	String model;
	String brand;
	Vehicle(String brand,String model){
		this.model=model;
		this.brand=brand;		
	}
	public void display() {
		System.out.println("Car Brand:"+brand);
		System.out.println("Car Model"+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
		
	}
	public void display() {
		super.display();
		System.out.println("Fuel Type:"+fuelType);
	}
}
class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand,String model,String fuelType,double batteryCapacity){
		super(brand,model,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
	public void display() {
		super.display();
		System.out.println("Battery capacity:"+batteryCapacity);
}
}
public class Vehiclemain {
	public static void main(String[]args) {
	ElectricCar electric=new ElectricCar("Tesla","Model 3","Electric",200);
	electric.display();
}
}
