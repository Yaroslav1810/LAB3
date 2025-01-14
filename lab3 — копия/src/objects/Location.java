package objects;

import java.util.ArrayList;
import java.util.List;

public class Location {
	private String name;
    private List<Characters> characters = new ArrayList<>();

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Characters> getCharacters() {
        return characters;
    }

    public void addCharacter(Characters character) {
        characters.add(character);
    }

    public void removeCharacter(Characters character) {
        characters.remove(character);
    }

    public void printCharacters() {
        System.out.println("Characters in " + getName() + ":");
        for (Characters character : characters) {
            System.out.println("- " + character.name);
        }
    }
}
