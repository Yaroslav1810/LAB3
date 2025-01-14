package objects;

import enums.*;
import interfaces.Usable;

public class WateringCan implements Usable {
	
	protected Wetness wetness;
	
	public WateringCan(Wetness wetness) {
		this.wetness = wetness;
	}

	@Override
	public void use(Characters target) throws Exception {
		System.out.println(target.getName() + " теперь мокрый.");
		target.setWetness(Wetness.Wet);
		target.setConsciousnes(Consciousness.Consсious);
		this.wetness = Wetness.Dry;
	}
	
	public void fill() {
		this.wetness = Wetness.Wet;
	}
}
