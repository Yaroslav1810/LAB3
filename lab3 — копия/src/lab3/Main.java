package lab3;

import enums.*;
import objects.*;
import records.*;

public class Main {
 public static void main(String[] args) {
	 Towel towel = new Towel(Wetness.Dry);
	 WateringCan can = new WateringCan(Wetness.Wet);
	 
	 CharacterDescription boydescr = new CharacterDescription("12", "красной куртке с шапкой набекрень", "Мальчик");
	 CharacterDescription frekendescr = new CharacterDescription("27", "в домашнем платье, высокого роста", "Женщина");
	 CharacterDescription uncledescr = new CharacterDescription("34", "в тулупе, плотные рабочие штаны", "Мужчина");
	 
	 Location room1 = new Location("комната1");
	 Location room2 = new Location("Комната2");
	 
	 
    Boy boy = new Boy("Малыш", Consciousness.Consсious , Wetness.Dry, boydescr);
    FrekenBok freken = new FrekenBok("Фрекен Бок", Consciousness.Consсious , Wetness.Dry, frekendescr);
    Uncle uncle = new Uncle("Дядя Юлиус", Consciousness.UnConsсious , Wetness.Dry, uncledescr);
    
    boy.useItem(can, uncle);
    freken.useItem(towel, uncle);
    
    freken.move(uncle, room1, room2);
    freken.explain(uncle, "этот толстый мальчишка -- школьный товарищ Малыша и что всякий раз он придумывает бог знает какие дикие шалости.");
    
    
 }
}
