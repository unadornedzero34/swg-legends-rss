package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Methanagen Inert Gas"
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
public final class SWGMethanagenInertGas extends SWGKnownInertGas {

  private static final long serialVersionUID = 1035829L;

  private static final int[] minStats = {0, 0, 536, 0, 0, 0, 0, 1, 0, 0, 0};
  private static final int[] maxStats = {0, 0, 634, 0, 0, 0, 0, 1000, 0, 0, 0};

  private static final SWGMethanagenInertGas INSTANCE = new SWGMethanagenInertGas();

  SWGMethanagenInertGas() { super(); }

  public static SWGMethanagenInertGas getInstance() { return INSTANCE; }

  public int expectedStats() { return 2; }
  public int sortIndex() { return 795; }
  public int rcID() { return 130; }
  public String rcName() { return "Methanagen Inert Gas";}
  public String rcToken() { return "mekrt";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
