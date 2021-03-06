package swg.crafting.resources.types;

import swg.crafting.Stat;

/*
 * Represents a resource class of type "Diamond Asteroid"
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
public final class SWGDiamondAsteroid extends SWGAsteroidalGemstone {

  private static final long serialVersionUID = 6096309L;

  private static final int[] minStats = {0, 0, 0, 0, 0, 0, 0, 500, 0, 0, 0};
  private static final int[] maxStats = {0, 0, 0, 0, 0, 0, 0, 500, 0, 0, 0};

  private static final SWGDiamondAsteroid INSTANCE = new SWGDiamondAsteroid();

  SWGDiamondAsteroid() { super(); }

  public static SWGDiamondAsteroid getInstance() { return INSTANCE; }

  public int expectedStats() { return 1; }
  public int sortIndex() { return 810; }
  public int rcID() { return 770; }
  public String rcName() { return "Diamond Asteroid";}
  public String rcToken() { return "admn";}
  public boolean isSpaceOrRecycled()  { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
