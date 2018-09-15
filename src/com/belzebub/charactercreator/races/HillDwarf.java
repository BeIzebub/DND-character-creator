package com.belzebub.charactercreator.races;

import com.belzebub.charactercreator.Constants;

import java.util.Map;

public class HillDwarf extends Dwarf {

    @Override
    public String name() {
        return "Hill" + super.name();
    }

    @Override
    public Map<String, Integer> modifiers() {
        Map<String, Integer> mods = super.modifiers();
        mods.put(Constants.WIS, 1);
        return mods;
    }

    // TODO: 15-Sep-18 handle each level hit point increase
}
