package com.belzebub.charactercreator;

import com.belzebub.charactercreator.races.MountainDwarf;
import com.belzebub.charactercreator.races.Race;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Character {

    private Clazz clazz;
    private Race race;
    private Background background;

    private String alignment;
    private int ac;
    private int initiative;
    private int hp;
    private int maxHP;
    private int hitDice;
    private int tempHP;
    private int proficiency = 2;
    private int passivePerception;

    private Map<String, Integer> stats = new HashMap<>();

    private List<String> skills = new ArrayList<>();

    // TODO: 15-Sep-18 this is harcoded for now
    Character(){
        race = new MountainDwarf();
        proficiency = getProficiencyFromLevel(5);

        stats.put(Constants.STR, 16 + race.modifiers().getOrDefault(Constants.STR, 0));
        stats.put(Constants.DEX, 8 + race.modifiers().getOrDefault(Constants.DEX, 0));
        stats.put(Constants.CON, 14 + race.modifiers().getOrDefault(Constants.CON, 0));
        stats.put(Constants.INT, 12 + race.modifiers().getOrDefault(Constants.INT, 0));
        stats.put(Constants.WIS, 12 + race.modifiers().getOrDefault(Constants.WIS, 0));
        stats.put(Constants.CHA, 14 + race.modifiers().getOrDefault(Constants.CHA, 0));

        skills.add(Constants.ARCANA);
        skills.add(Constants.HISTORY);
        skills.add(Constants.RELIGION);
        skills.add(Constants.INVESTIGATION);
        skills.add(Constants.INTIMIDATION);
    }

    public int getModifier(String abilityOrSkill) throws RuntimeException{
        if(stats.containsKey(abilityOrSkill)){
            return getModifier(stats.get(abilityOrSkill));
        }
        else if(Constants.skillMap.containsKey(abilityOrSkill)){
            int modifier = 0;
            modifier += getModifier(stats.get(Constants.skillMap.get(abilityOrSkill)));
            if(skills.contains(abilityOrSkill)){
                modifier += proficiency;
            }
            return modifier;
        }
        else {
            throw new RuntimeException("Not an ability or skill");
        }
    }

    private int getModifier(int stat){
        int temp = stat - 10;
        if(temp >= 0){
            return temp / 2;
        }
        else{
            return (temp - 1) / 2;
        }
    }

    private int getProficiencyFromLevel(int level) {
        if (level < 5) {
            return 2;
        }
        else if (level < 9){
            return 3;
        }
        else if (level < 13){
            return 4;
        }
        else if (level < 17){
            return 5;
        }
        else {
            return 6;
        }
    }
}
