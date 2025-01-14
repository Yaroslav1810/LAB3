package objects;

import enums.*;
import records.CharacterDescription;

public abstract class Characters {
	protected String name;
	protected Consciousness consciousnes;
	protected Wetness wetness;
	protected final CharacterDescription descr;
	
	abstract public void interactUncle(Characters target); // TODO все абстрактные методы выше остальных методов имена методов с маленькой

	public void move (Characters target, Location loc1, Location loc2) {
		if(target.getConsciousnes() == Consciousness.Consсious) {
			loc1.removeCharacter(target);
			loc1.removeCharacter(this);
			
			loc2.addCharacter(target);
			loc2.addCharacter(this);
			
			System.out.println(this.name + " увел " + target.name + " из " + loc1.getName() + " в " + loc2.getName());
		}
		else {
			System.out.println(target.name + " без сознания, перемещение невозможно.");
		}
	

	}
	
	public void useItem (Item item, Characters target) throws Exception {
	}
	
	
	public Characters(String name, Consciousness consciousnes, Wetness wetness, CharacterDescription descr) {
		this.consciousnes = consciousnes;
		this.name = new String(name);
		this.wetness = wetness;
		this.descr = descr;
	}
	
    public String getName() {
        return name;
    }

    public Consciousness getConsciousnes() {
        return consciousnes;
    }

    public Wetness getWetness() {
        return wetness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConsciousnes(Consciousness consciousnes) {
        this.consciousnes = consciousnes;
    }

    public void setWetness(Wetness wetness) {
        this.wetness = wetness;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Characters character = (Characters) obj; // equals строчных типов данных 
        return this.getName() == character.getName() && this.getWetness() == character.getWetness() && this.getConsciousnes() == character.getConsciousnes();
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode();
    }

    @Override
    public String toString() {
        return "Character{name = '" + this.getName() + "', wetness = " + this.getWetness() + " consciousness = " + this.getConsciousnes() + "}";
    }

}
