import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static final String STR = "strength";
    public static final String DEX = "dexterity";
    public static final String CON = "constitution";
    public static final String INT = "intelligence";
    public static final String WIS = "wisdom";
    public static final String CHA = "charisma";

    public static final String ATHLETICS = "ATHLETICS";

    public static final String ACROBATICS = "ACROBATICS";
    public static final String SLEIGHT_OF_HAND = "SLEIGHT_OF_HAND";
    public static final String STEALTH = "STEALTH";

    public static final String ARCANA = "ARCANA";
    public static final String HISTORY = "HISTORY";
    public static final String INVESTIGATION = "INVESTIGATION";
    public static final String NATURE = "NATURE";
    public static final String RELIGION = "RELIGION";

    public static final String ANIMAL_HANDLING = "ANIMAL_HANDLING";
    public static final String INSIGHT = "INSIGHT";
    public static final String MEDICINE = "MEDICINE";
    public static final String PERCEPTION = "PERCEPTION";
    public static final String SURVIVAL = "SURVIVAL";

    public static final String DECEPTION = "DECEPTION";
    public static final String INTIMIDATION = "INTIMIDATION";
    public static final String PERFORMANCE = "PERFORMANCE";
    public static final String PERSUASION = "PERSUASION";

    public static final Map<String, String> skillMap = new HashMap<>();
    static {
        skillMap.put(ATHLETICS, STR);
        skillMap.put(ACROBATICS, DEX);
        skillMap.put(SLEIGHT_OF_HAND, DEX);
        skillMap.put(STEALTH, DEX);
        skillMap.put(ARCANA, INT);
        skillMap.put(HISTORY, INT);
        skillMap.put(INVESTIGATION, INT);
        skillMap.put(NATURE, INT);
        skillMap.put(RELIGION, INT);
        skillMap.put(ANIMAL_HANDLING, WIS);
        skillMap.put(INSIGHT, WIS);
        skillMap.put(MEDICINE, WIS);
        skillMap.put(PERCEPTION, WIS);
        skillMap.put(SURVIVAL, WIS);
        skillMap.put(DECEPTION, CHA);
        skillMap.put(INTIMIDATION, CHA);
        skillMap.put(PERFORMANCE, CHA);
        skillMap.put(PERSUASION, CHA);
    }

//    private static final String[] allSkills = new String[]{
//            ATHLETICS,
//
//            ACROBATICS,
//            SLEIGHT_OF_HAND,
//            STEALTH,
//
//            ARCANA,
//            HISTORY,
//            INVESTIGATION,
//            NATURE,
//            RELIGION,
//
//            ANIMAL_HANDLING,
//            INSIGHT,
//            MEDICINE,
//            PERCEPTION,
//            SURVIVAL,
//
//            DECEPTION,
//            INTIMIDATION,
//            PERFORMANCE,
//            PERSUASION
//    };

//    public static final List<String> skillList = Arrays.asList(allSkills);

//    public static final Map<String, String[]> skillMap = new HashMap<>();
//    static {
//        skillMap.put(STR, new String[]{
//                ATHLETICS
//        });
//        skillMap.put(DEX, new String[]{
//                ACROBATICS,
//                SLEIGHT_OF_HAND,
//                STEALTH
//        });
//        skillMap.put(INT, new String[]{
//                ARCANA,
//                HISTORY,
//                INVESTIGATION,
//                NATURE,
//                RELIGION
//        });
//        skillMap.put(WIS, new String[]{
//                ANIMAL_HANDLING,
//                INSIGHT,
//                MEDICINE,
//                PERCEPTION,
//                SURVIVAL
//        });
//        skillMap.put(CHA, new String[]{
//                DECEPTION,
//                INTIMIDATION,
//                PERFORMANCE,
//                PERSUASION
//        });
//    }
}