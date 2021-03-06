package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Sedrellium Amorphous Gemstone"
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
public final class SWGSedrelliumAmorphousGemstone extends SWGAmorphousGemstone {

  private static final long serialVersionUID = 1162341L;

  private static final int[] minStats = {0, 570, 570, 456, 0, 828, 342, 1, 0, 570, 570};
  private static final int[] maxStats = {0, 730, 730, 584, 0, 892, 438, 1000, 0, 730, 730};

  private static final SWGSedrelliumAmorphousGemstone INSTANCE = new SWGSedrelliumAmorphousGemstone();

  SWGSedrelliumAmorphousGemstone() { super(); }

  public static SWGSedrelliumAmorphousGemstone getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 753; }
  public int rcID() { return 146; }
  public String rcName() { return "Sedrellium Amorphous Gemstone";}
  public String rcToken() { return "seamo";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
