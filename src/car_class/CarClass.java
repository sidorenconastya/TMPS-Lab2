package car_class;

import car.AudioSystem;
import car.Car;
import car.CruiseControl;
import car.PanoramicWindow;
import car_body.Crossover;
import car_body.Sedan;

public class CarClass {
	public Crossover carPremiumClass() {
		return new Crossover(new PanoramicWindow(new CruiseControl(new Car())));
	}
	public Sedan carMediumClass() {
		return new Sedan(new AudioSystem(new Car()));
	}
}
