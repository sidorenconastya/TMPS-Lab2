package car_body;

import car.CarComponent;

abstract class CarBody {
	public CarBody() {}
	
	public CarBody(CarComponent carType){
		String carBodyType = null;
		String name = carBodyType + carType.name;
	}
}
