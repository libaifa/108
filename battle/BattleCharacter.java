import java.util.ArrayList;

public class BattleCharacter {
  
  private final String originalName;
  private String charName;
  private int charNumber = 1;
  private boolean isPlayer;
  
  private int maxHealth, cHealth, maxEnergy, cEnergy;
  private int str, mag, ten, ref;
  
  private ArrayList<ElementEffectiveness> eEffects;
  
  private ArrayList<Move> knownMoves;
  private ArrayList<ActiveSkill> knownSkills;
  
  private TurnPreference turnPreference;
  private BattleAI ai;
  private BattleState battleState;

}
