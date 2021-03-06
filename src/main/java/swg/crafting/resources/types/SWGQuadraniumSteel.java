package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Quadranium Steel"
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
public final class SWGQuadraniumSteel extends SWGSteel {

  private static final long serialVersionUID = 2269321L;

  private static final int[] minStats = {436, 536, 835, 0, 0, 868, 268, 1, 0, 835, 802};
  private static final int[] maxStats = {540, 664, 915, 0, 0, 932, 332, 1000, 0, 915, 898};

  private static final SWGQuadraniumSteel INSTANCE = new SWGQuadraniumSteel();

  SWGQuadraniumSteel() { super(); }

  public static SWGQuadraniumSteel getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 652; }
  public int rcID() { return 286; }
  public String rcName() { return "Quadranium Steel";}
  public String rcToken() { return "qustl";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
