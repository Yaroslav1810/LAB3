package objects;

import enums.Consciousness;
import enums.Wetness;
import exceptions.CharacterNonExistent;
import records.CharacterDescription;

public class Boy extends Characters {

	public Boy(String name, Consciousness consciousnes, Wetness wetness, CharacterDescription descr) {
		super(name, consciousnes, wetness, descr);
	}

	@Override
	public void interactUncle(Characters target) {
		target.setWetness(Wetness.Wet);
		System.out.println("Малыш подшутил над " + target.getName() + " и облил его водой.");
	}
	
	public void useItem (WateringCan can, Characters target) {
		if (target == null) {
			throw new CharacterNonExistent("Цель не существует");
		}
		try {
			System.out.println("Малыш использует лейку на " + target.getName());
			can.use(target);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
