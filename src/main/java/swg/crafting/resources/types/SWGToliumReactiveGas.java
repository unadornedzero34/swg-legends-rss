package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Tolium Reactive Gas"
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
public final class SWGToliumReactiveGas extends SWGKnownReactiveGas {

  private static final long serialVersionUID = 1106992L;

  private static final int[] minStats = {0, 0, 500, 0, 0, 0, 0, 1, 0, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 0, 0, 0, 1000, 0, 0, 0};

  private static final SWGToliumReactiveGas INSTANCE = new SWGToliumReactiveGas();

  SWGToliumReactiveGas() { super(); }

  public static SWGToliumReactiveGas getInstance() { return INSTANCE; }

  public int expectedStats() { return 2; }
  public int sortIndex() { return 781; }
  public int rcID() { return 139; }
  public String rcName() { return "Tolium Reactive Gas";}
  public String rcToken() { return "toktv";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}