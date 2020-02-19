package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Flora Structural"
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
public class SWGFloraStructural extends SWGFloraResources {

  private static final long serialVersionUID = 403269L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 200, 1, 0, 1, 1};
  private static final int[] maxStats = {0, 0, 800, 0, 0, 0, 1000, 1000, 0, 700, 800};

  private static final SWGFloraStructural INSTANCE = new SWGFloraStructural();

  SWGFloraStructural() { super(); }

  public static SWGFloraStructural getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 526; }
  public int rcID() { return 50; }
  public String rcName() { return "Flora Structural";}
  public String rcToken() { return "fls";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}