package car_credit;

import car_body.CarBody;
import car_class.CarClass;

public class MediumCarCredit implements Credit{

	@Override
	public CarBody buyViaCredit() {
		CarClass carClass = new CarClass();
		return carClass.carMediumClass();
	}

}
