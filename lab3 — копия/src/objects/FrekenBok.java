package objects;

import enums.Consciousness;
import enums.Wetness;
import exceptions.*;
import records.CharacterDescription;

public class FrekenBok extends Characters {

	public FrekenBok(String name, Consciousness consciousnes, Wetness wetness, CharacterDescription descr) {
		super(name, consciousnes, wetness, descr);
	}
	@Override
	public void move (Characters target, Location loc1, Location loc2) {
			if(target.getConsciousnes() == Consciousness.Consсious) {
				loc1.removeCharacter(target);
				loc1.removeCharacter(this);
				
				loc2.addCharacter(target);
				loc2.addCharacter(this);
				
				System.out.println("Фрекен Бок увела " + target.getName() + " из " + loc1.getName() + " в " + loc2.getName());
			}
			else {
				System.out.println("Фрекен Бок не может увести " + target.getName() + " так как он без сознания.");
			}
			
		
	}
	
	public void useItem (Towel towel, Characters target) {
		if (target == null) {
			throw new CharacterNonExistent("Цель не существует");
		}
		try {
			System.out.println("фрекен Бок использует полотенце на " + target.getName());
			towel.use(target);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void explain(Characters target, String message) {
	    double randomValue = Math.random();
	    if (target == null) {
			throw new CharacterNonExistent("Цель не существует");
		}
	    if(target.getConsciousnes() == Consciousness.Consсious) {
	    	if (randomValue < 0.7) {
		        System.out.println("Фрекен Бок объясняет " + target.getName() + ": " + message);
		    } else {
		        System.out.println("Фрекен Бок говорит с " + target.getName());
		    }
	    }
	    else {
	    	System.out.println("Фрекен Бок думает что делать с  " + target.getName());
	    }
	}
	
	@Override
	public void interactUncle(Characters target) {
		target.setConsciousnes(Consciousness.Consсious);
		System.out.println("Фрекен бок привела в сознание " + target.getName());
		
	}

	
}
