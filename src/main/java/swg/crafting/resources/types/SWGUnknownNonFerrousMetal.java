package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Unknown Non-Ferrous Metal"
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
public final class SWGUnknownNonFerrousMetal extends SWGNonFerrousMetal {

  private static final long serialVersionUID = 1312574L;

  private static final int[] minStats = {300, 1, 1, 0, 0, 200, 300, 1, 0, 300, 300};
  private static final int[] maxStats = {1000, 800, 700, 0, 0, 800, 1000, 1000, 0, 900, 1000};

  private static final SWGUnknownNonFerrousMetal INSTANCE = new SWGUnknownNonFerrousMetal();

  SWGUnknownNonFerrousMetal() { super(); }

  public static SWGUnknownNonFerrousMetal getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 671; }
  public int rcID() { return 165; }
  public String rcName() { return "Unknown Non-Ferrous Metal";}
  public String rcToken() { return "unnfr";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
