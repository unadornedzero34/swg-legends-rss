package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGGreens;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Dantooine Vegetable Greens"
 *
 * <b>WARNING:</b>
 * This class is generated by SWGResourceClassGenerator.
 * Do not manually modify this class as your changes are
 * erased when the classes are re-generated.
 *
 * @author Steven M. Doyle <shadow@triwizard.net>
 * @author <a href="mailto:simongronlund@gmail.com">Simon Gronlund</a>
 * aka Chimaera.Zimoon
 */
@SuppressWarnings("all")
public final class SWGDantooineVegetableGreens extends SWGGreens {

  private static final long serialVersionUID = 4333048L;

  private static final int[] minStats = {0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 1000, 0, 0, 1000, 1000, 0, 0};

  private static final SWGDantooineVegetableGreens INSTANCE = new SWGDantooineVegetableGreens();

  SWGDantooineVegetableGreens() { super(); }

  public static SWGDantooineVegetableGreens getInstance() { return INSTANCE; }

  public int expectedStats() { return 4; }
  public int sortIndex() { return 435; }
  public int rcID() { return 547; }
  public String rcName() { return "Dantooine Vegetable Greens";}
  public String rcToken() { return "dngrn";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}