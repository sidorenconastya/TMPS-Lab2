package car;

public class AudioSystem implements CarComponent{
	public AudioSystem(CarComponent base) {
		String name = base.name + "with Audio System";
	}
}
