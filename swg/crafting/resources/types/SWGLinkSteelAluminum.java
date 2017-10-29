package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGAluminum;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Link-Steel Aluminum"
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
public final class SWGLinkSteelAluminum extends SWGAluminum {

  private static final long serialVersionUID = 2316763L;

  private static final int[] minStats = {608, 494, 494, 0, 0, 570, 732, 1, 0, 670, 670};
  private static final int[] maxStats = {742, 707, 707, 0, 0, 730, 918, 1000, 0, 830, 830};

  private static final SWGLinkSteelAluminum INSTANCE = new SWGLinkSteelAluminum();

  SWGLinkSteelAluminum() { super(); }

  public static SWGLinkSteelAluminum getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 678; }
  public int rcID() { return 292; }
  public String rcName() { return "Link-Steel Aluminum";}
  public String rcToken() { return "lsalu";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}