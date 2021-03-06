package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Endorian Deciduous Wood"
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
public final class SWGEndorianDeciduousWood extends SWGHardWood {

  private static final long serialVersionUID = 4514909L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 400, 1, 0, 300, 1};
  private static final int[] maxStats = {0, 0, 800, 0, 0, 0, 800, 1000, 0, 700, 800};

  private static final SWGEndorianDeciduousWood INSTANCE = new SWGEndorianDeciduousWood();

  SWGEndorianDeciduousWood() { super(); }

  public static SWGEndorianDeciduousWood getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 533; }
  public int rcID() { return 570; }
  public String rcName() { return "Endorian Deciduous Wood";}
  public String rcToken() { return "endwd";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
