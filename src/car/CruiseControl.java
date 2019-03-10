package car;

public class CruiseControl implements CarComponent{
	public CruiseControl(CarComponent base) {
		String name = base.name + "with Cruise-Control";
	}
}
