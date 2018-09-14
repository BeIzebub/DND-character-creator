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

    Character(){
        stats.put(Constants.STR, 16);
        stats.put(Constants.DEX, 9);
        stats.put(Constants.CON, 14);
        stats.put(Constants.INT, 12);
        stats.put(Constants.WIS, 12);
        stats.put(Constants.CHA, 14);

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
}
