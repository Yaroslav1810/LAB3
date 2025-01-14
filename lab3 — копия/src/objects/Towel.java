package objects;

import enums.*;
import exceptions.*;
import interfaces.Usable;

public class Towel implements Usable {
	
	protected Wetness wetness;
	
	public Towel(Wetness wetness) {
		this.wetness = wetness;
	}
	
	@Override
    public void use(Characters target) throws Exception {
        if (target.getWetness() == Wetness.Dry) {
            throw new AlreadyDryException(target.getName() + " уже сухой, не нужно использовать полотенце.");
        }
        if (this.wetness == Wetness.Wet) {
        	throw new TowelWet("Полотенце мокрое, использовать невозможно");
        }
        
        
        target.setWetness(Wetness.Dry);
        this.wetness = Wetness.Wet;
        System.out.println(target.getName() + " был высушен полотенцем.");
    }
	
	public void dry() {
		this.wetness = Wetness.Dry;
	}
}
