package com.belzebub.charactercreator.races;

import com.belzebub.charactercreator.Constants;

import java.util.Map;

public class MountainDwarf extends Dwarf{

    @Override
    public Map<String, Integer> modifiers() {
        Map<String, Integer> mods = super.modifiers();
        mods.put(Constants.STR, 2);
        return mods;
    }

    // TODO: 15-Sep-18 armor proficiencies
}