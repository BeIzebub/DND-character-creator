package com.belzebub.charactercreator.races;

import com.belzebub.charactercreator.Constants;

import java.util.*;

public abstract class Dwarf extends Race{

    @Override
    public String name() {
        return "Dwarf";
    }

    @Override
    public int speed() {
        return 25;
    }

    @Override
    public Map<String, Integer> modifiers() {
        Map<String, Integer> mods = new HashMap<>();
        mods.put(Constants.CON, 2);
        return mods;
    }

    @Override
    public Set<String> languages() {
        Set<String> langs = new HashSet<>();
        langs.add("Common");
        langs.add("Dwarvish");
        return langs;
    }

    @Override
    public List<String> proficiencies() {
        return null;
    }

    @Override
    public List<String> specials() {
        List<String> specials = new ArrayList<>();
        specials.add("Vou " +
                "can see in dim light within 60 feet ofyou as if it were " +
                "bright light, and in darkness as if it were dim lighl. Vou " +
                "can't discern color in darkness, only shades of gray.");
        specials.add("Vou have advantage on saving " +
                "throws against poison, and you have resistance against " +
                "poison damage");
        return null;
    }
}
