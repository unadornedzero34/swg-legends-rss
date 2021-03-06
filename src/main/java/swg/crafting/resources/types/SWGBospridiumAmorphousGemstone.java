package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Bospridium Amorphous Gemstone"
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
public final class SWGBospridiumAmorphousGemstone extends SWGAmorphousGemstone {

  private static final long serialVersionUID = 5131655L;

  private static final int[] minStats = {0, 1, 1, 1, 0, 600, 1, 1, 0, 1, 1};
  private static final int[] maxStats = {0, 131, 131, 105, 0, 652, 79, 1000, 0, 131, 131};

  private static final SWGBospridiumAmorphousGemstone INSTANCE = new SWGBospridiumAmorphousGemstone();

  SWGBospridiumAmorphousGemstone() { super(); }

  public static SWGBospridiumAmorphousGemstone getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 747; }
  public int rcID() { return 648; }
  public String rcName() { return "Bospridium Amorphous Gemstone";}
  public String rcToken() { return "boamo";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
