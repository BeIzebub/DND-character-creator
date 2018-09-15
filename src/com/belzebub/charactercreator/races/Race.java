package com.belzebub.charactercreator.races;

import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Race {

    public abstract String name();
    public abstract int speed();
    public abstract Map<String, Integer> modifiers();
    public abstract Set<String> languages();

    // TODO: 15-Sep-18 should be skill proficiencies
    public abstract List<String> proficiencies();
    public abstract List<String> specials();

    // TODO: 15-Sep-18 add weapon, armor and tool proficiencies
}
