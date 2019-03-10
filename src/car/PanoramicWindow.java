package car;

public class PanoramicWindow implements CarComponent{
	public PanoramicWindow(CarComponent base) {
		String name = base.name + "with Panoramic Window";
	}
}
