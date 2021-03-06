package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Gravitonic Fiberplast"
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
public final class SWGGravitonicFiberplast extends SWGFiberplast {

  private static final long serialVersionUID = 458618L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1};
  private static final int[] maxStats = {0, 0, 1000, 0, 0, 0, 1000, 1000, 0, 1000, 1000};

  private static final SWGGravitonicFiberplast INSTANCE = new SWGGravitonicFiberplast();

  SWGGravitonicFiberplast() { super(); }

  public static SWGGravitonicFiberplast getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 595; }
  public int rcID() { return 57; }
  public String rcName() { return "Gravitonic Fiberplast";}
  public String rcToken() { return "grfib";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public boolean  isJTL() { return true; }

  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
