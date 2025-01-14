package objects;

import enums.Consciousness;
import enums.Wetness;
import records.CharacterDescription;

public class Uncle extends Characters {

	public Uncle(String name, Consciousness consciousnes, Wetness wetness, CharacterDescription descr) {
		super(name, consciousnes, wetness, descr);
	}

	@Override
	public void interactUncle(Characters target) {
		target.setConsciousnes(Consciousness.UnConsсious);
		System.out.println(this.getName() + " напился с " + target.getName() + " до потери сознания.");
		
	}
}
