package swg.gui.common;

import javax.swing.plaf.metal.*;

import javax.swing.plaf.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Insets;
import java.util.*;

/**
* Defines all themes which can allow the user to customize the Java Look and Feel.
*
* <P>This application uses only the cross-platform Java Look-and-Feel, and never 
* attempts to adapt to the native look-and-feel (Windows, Metal, Mac).
*/
public final class SWGTheme { 
  
  /*
  * Implementation Note:
  * This item has not been converted to an enum class, since it 
  * contains so many data-related settings. 
  */
  
  /**
  * A theme identical to the default Java look-and-feel, but whose name 
  * is "Default" instead of the cryptic "Steel", and which provides a 
  * <tt>toString</tt> method (required if <tt>Theme</tt> objects 
  * passed to a combo box). Used as the base class for all other themes 
  * used in this application.
  */
  public static final MetalTheme DEFAULT = new Default();
  
  /**
  * Much like {@link #DEFAULT}, but uses some slightly different colors.
  */
  public static final MetalTheme STD = new Std();
  
  /**
   * Theme on vanilla game colors
   */
  public static final MetalTheme SWG = new SWG();
  
  /**
   * A very dark theme. Charcoal best describes it.
   */
  public static final MetalTheme DARK = new Dark();

  /** 
  * Convert <tt>aText</tt> into its corresponding <tt>Theme</tt> object, 
  * if possible.
  *
  * @param aText possibly-null text which may map to a Theme.
  * @return null if <tt>aText</tt> is null, else try to match to a 
  * known <tt>Theme</tt>.
  * @throws IllegalArgumentException if <tt>aText</tt> cannot be 
  * matched to a known theme.
  */
  public static MetalTheme valueOf(String aText) { 
	  if (aText == null) return null; 
	  for(MetalTheme theme: VALUES){
		  if (aText.endsWith(theme.getName())){
			  return theme;
		  }
	  }
	  throw new IllegalArgumentException("Cannot parse into Theme object:" + aText); 
  } 

  private static final MetalTheme[] fValues = { 
		  DEFAULT, 
		  STD,
		  SWG,
		  DARK
  };
  
  /**Allows user to iterate over all elements of this enumeration.  */
  public static final java.util.List<MetalTheme> VALUES = 
		  Collections.unmodifiableList(Arrays.asList(fValues)
  );

  private static final String fDEFAULT_NAME = "Default";
  private static final String fSTD_NAME = "Std";
  private static final String fDARK_NAME = "MidnightDark";
  private static final String fSWG_NAME = "SWGDark";
  
  /*
  * All items below are private nested classes which define the various
  * themes.
  */
  
  private static class Default extends OceanTheme {
    public String getName(){ 
    	return fName;
    }
    /**
    * This override is provided such that Theme objects can 
    * be directly passed to JComboBox, instead of Strings. (This would
    * not be necessary if getName had been named toString instead).
    */
    @Override public final String toString() {
    	return getName();
    }
    private final String fName = fDEFAULT_NAME;
  }  
  
  private static class Std extends OceanTheme {
	  public void addCustomEntriesToTable(UIDefaults aTable) {
		  super.addCustomEntriesToTable(aTable);
		  @SuppressWarnings("rawtypes")
		  java.util.List buttonGradient = Arrays.asList(
	                 new Object[] {Float.valueOf(.3f), Float.valueOf(0f),
	                 new ColorUIResource(0xe3e4e5), getWhite(), getSecondary2() });

		  ColorUIResource ovd = new ColorUIResource(0x555555);
		  aTable.put("MenuBar.borderColor",  fBlack);
		  aTable.put("Button.gradient",  buttonGradient);
		  aTable.put("CheckBox.gradient",  buttonGradient);
		  aTable.put("CheckBoxMenuItem.gradient",  buttonGradient);
		  aTable.put("InternalFrame.activeTitleGradient",  buttonGradient);
		  aTable.put("RadioButton.gradient",  buttonGradient);
		  aTable.put("RadioButtonMenuItem.gradient",  buttonGradient);
		  aTable.put("ScrollBar.gradient",  buttonGradient);
		  aTable.put("ToggleButton.gradient",  buttonGradient);
		  aTable.put("SplitPane.dividerFocusColor",  ovd);
		  //aTable.put("Label.background",  getWhite());
		  aTable.put("TabbedPane.contentBorderInsets",   new Insets(2, 2, 3, 3));
		  aTable.put("TabbedPane.contentAreaColor",  getSecondary3());
		  aTable.put("Table.dropLineShortColor",  fOCEAN_BLACK);
		  aTable.put("Table.dropCellBackground",  fOCEAN_DROP);
		  aTable.put("Table.gridColor",  getSecondary1());
		  aTable.put("Tree.dropCellBackground",  fOCEAN_DROP);
		  aTable.put("List.dropCellBackground",  fOCEAN_DROP);
		  // put SWGAide specific colors here. These used to be constants in SWGGuiUtils
		  aTable.put("SWG.colorAlert",  new Color(0xffcc66));
		  aTable.put("SWG.colorCategory",  new Color(0xfff0ff));
		  aTable.put("SWG.colorComponent",  new Color(0xedf6ff));
		  aTable.put("SWG.colorDepleted",  new Color(0x990099));
		  aTable.put("SWG.colorItem",  new Color(0xffffcc));
		  aTable.put("SWG.colorLightGray",  new Color(0xdddddd));
		  aTable.put("SWG.colorNonHarvested",  new Color(0xddddff));
		  aTable.put("SWG.colorResource",  new Color(0xf1ffe3));
		  aTable.put("SWG.colorThinBorder",  new Color(0xcce0ff));
		  aTable.put("SWG.colorWarning",  new Color(0xffafaf));
		  aTable.put("SWG.todaysCyan",  new Color(0x00ffff));
		  aTable.put("SWG.benchBAD",  new Color(0xFF0000));
		  aTable.put("SWG.benchFAIR",  new Color(0xFF8C00));
		  aTable.put("SWG.benchGREAT",  new Color(0x014709));
	  }
	  public String getName(){ return fName; }
	  protected ColorUIResource getPrimary1() { return fPrimary1; }
	  protected ColorUIResource getPrimary2() { return fPrimary2; }
	  protected ColorUIResource getPrimary3() { return fPrimary3; }
	  protected ColorUIResource getSecondary1() { return fSecondary1; }
	  protected ColorUIResource getSecondary2() { return fSecondary2; }
	  protected ColorUIResource getSecondary3() { return fSecondary3; }
	  public ColorUIResource getInactiveControlTextColor() { return fINACTIVE_CONTROL_TEXT_COLOR; }
	  public ColorUIResource getControlTextColor() { return fCONTROL_TEXT_COLOR; }
	  public ColorUIResource getMenuDisabledForeground() { return fMENU_DISABLED_FOREGROUND; }
	  protected ColorUIResource getWhite() { return fWhite; }
	  protected ColorUIResource getBlack() { return fBlack; }
	  public ColorUIResource getDesktopColor() { return fWhite; }
	  public ColorUIResource getWindowBackground() { return fWhite; }
	  private final String fName = fSTD_NAME;
	  private final ColorUIResource fPrimary1 = new ColorUIResource(0x6382BF);
	  private final ColorUIResource fPrimary2 = new ColorUIResource(0xA3B8CC);
	  private final ColorUIResource fPrimary3 = new ColorUIResource(0xB8CFE5);
	  private final ColorUIResource fSecondary1 = new ColorUIResource(0x868686);
	  private final ColorUIResource fSecondary2 = new ColorUIResource(0xc9c9c9);
	  private final ColorUIResource fSecondary3 = new ColorUIResource(0xEEEEEE);
	  private final ColorUIResource fINACTIVE_CONTROL_TEXT_COLOR = new ColorUIResource(0x999999);
	  private final ColorUIResource fCONTROL_TEXT_COLOR = new ColorUIResource(0x333333);
	  private final ColorUIResource fMENU_DISABLED_FOREGROUND = new ColorUIResource(0x999999);
	  private final ColorUIResource fOCEAN_BLACK = new ColorUIResource(0x333333);
	  private final ColorUIResource fOCEAN_DROP = new ColorUIResource(0xD2E9FF);
	  private final ColorUIResource fBlack = new ColorUIResource(0x222222);
	  private final ColorUIResource fWhite = new ColorUIResource(0xffffff);
  }
  
  private static class Dark extends OceanTheme {
	  public void addCustomEntriesToTable(UIDefaults aTable) {
		  super.addCustomEntriesToTable(aTable);
		  @SuppressWarnings("rawtypes")
		  java.util.List buttonGradient = Arrays.asList(
				  new Object[] {Float.valueOf(.3f), Float.valueOf(0f),
						  new ColorUIResource(0x1a1a1a), new ColorUIResource(0x333333), getSecondary2() });

		  aTable.put("MenuBar.gradient",  Arrays.asList(new Object[] {
				  Float.valueOf(1f), Float.valueOf(0f),
				  getWhite(), getSecondary3(),
				  getSecondary3() }));
		  ColorUIResource ovd = new ColorUIResource(0x555555);
		  aTable.put("MenuBar.borderColor",  fBlack);
		  aTable.put("Button.gradient",  buttonGradient);
		  aTable.put("CheckBox.gradient",  buttonGradient);
		  aTable.put("CheckBoxMenuItem.gradient",  buttonGradient);
		  aTable.put("InternalFrame.activeTitleGradient",  buttonGradient);
		  aTable.put("RadioButton.gradient",  buttonGradient);
		  aTable.put("RadioButtonMenuItem.gradient",  buttonGradient);
		  aTable.put("ScrollBar.gradient",  buttonGradient);
		  aTable.put("ToggleButton.gradient",  buttonGradient);
		  aTable.put("SplitPane.dividerFocusColor",  ovd);
		  aTable.put("TabbedPane.selected",  ovd);
		  aTable.put("TabbedPane.foreground",  new ColorUIResource(0xeeeeee));
		  aTable.put("TabbedPane.contentAreaColor",  getSecondary2());
		  aTable.put("TabbedPane.tabAreaBackground",  getSecondary3());
		  aTable.put("TabbedPane.unselectedBackground",  new ColorUIResource(0x2a2a2a));
		  aTable.put("TableHeader.focusCellBackground",  ovd);
		  aTable.put("Table.dropLineShortColor",  fOCEAN_BLACK);
		  aTable.put("Table.dropCellBackground",  fOCEAN_DROP);
		  aTable.put("Table.gridColor",  getSecondary1());
		  aTable.put("Tree.dropCellBackground",  fOCEAN_DROP);
		  aTable.put("List.dropCellBackground",  fOCEAN_DROP);
		  // put SWGAide specific colors here. These used to be constants in SWGGuiUtils
		  aTable.put("SWG.colorAlert",  new Color(0xffcc66));
		  aTable.put("SWG.colorCategory",  new Color(0xd8b5d8));
		  aTable.put("SWG.colorComponent",  new Color(0xb7c2ce));
		  aTable.put("SWG.colorDepleted",  new Color(0xef22ef));
		  aTable.put("SWG.colorItem",  new Color(0xe2e290));
		  aTable.put("SWG.colorLightGray",  new Color(0x555555));
		  aTable.put("SWG.colorNonHarvested",  new Color(0x7f7ffa));
		  aTable.put("SWG.colorResource",  new Color(0xbed1aa));
		  aTable.put("SWG.colorThinBorder",  new Color(0xcce0ff));
		  aTable.put("SWG.colorWarning",  new Color(0xffafaf));
		  aTable.put("SWG.todaysCyan",  new Color(0x385252));
		  aTable.put("SWG.benchBAD",  new Color(0xFF0000));
		  aTable.put("SWG.benchFAIR",  new Color(0xFF8C00));
		  aTable.put("SWG.benchGREAT",  new Color(0x1cc530));
	  }
	  public String getName(){ return fName; }
	  protected ColorUIResource getPrimary1() { return fPrimary1; }
	  protected ColorUIResource getPrimary2() { return fPrimary2; }
	  protected ColorUIResource getPrimary3() { return fPrimary3; }
	  protected ColorUIResource getSecondary1() { return fSecondary1; }
	  protected ColorUIResource getSecondary2() { return fSecondary2; }
	  protected ColorUIResource getSecondary3() { return fSecondary3; }
	  public ColorUIResource getInactiveControlTextColor() { return fINACTIVE_CONTROL_TEXT_COLOR; }
	  public ColorUIResource getControlTextColor() { return fCONTROL_TEXT_COLOR; }
	  public ColorUIResource getMenuDisabledForeground() { return fMENU_DISABLED_FOREGROUND; }
	  protected ColorUIResource getWhite() { return fBlack; }
	  protected ColorUIResource getBlack() { return fWhite; }
	  public ColorUIResource getDesktopColor() { return fBlack; }
	  public ColorUIResource getWindowBackground() { return fBlack; }
	  private final String fName = fDARK_NAME;
	  private final ColorUIResource fPrimary1 = new ColorUIResource(0x666666);
	  private final ColorUIResource fPrimary2 = new ColorUIResource(0x4d4d4d);
	  private final ColorUIResource fPrimary3 = new ColorUIResource(0x444444);
	  private final ColorUIResource fSecondary1 = new ColorUIResource(0x555555);
	  private final ColorUIResource fSecondary2 = new ColorUIResource(0x333333);
	  private final ColorUIResource fSecondary3 = new ColorUIResource(0x191919);
	  private final ColorUIResource fINACTIVE_CONTROL_TEXT_COLOR = new ColorUIResource(0x666666);
	  private final ColorUIResource fCONTROL_TEXT_COLOR = new ColorUIResource(0xcccccc);
	  private final ColorUIResource fMENU_DISABLED_FOREGROUND = new ColorUIResource(0x666666);
	  private final ColorUIResource fOCEAN_BLACK = new ColorUIResource(0xcccccc);
	  private final ColorUIResource fOCEAN_DROP = new ColorUIResource(0x1c1c1c);
	  private final ColorUIResource fBlack = new ColorUIResource(0x222222);
	  private final ColorUIResource fWhite = new ColorUIResource(0xcccccc);
  }
  
  private static class SWG extends OceanTheme {
	  public void addCustomEntriesToTable(UIDefaults aTable) {
		  super.addCustomEntriesToTable(aTable);
		  @SuppressWarnings("rawtypes")
		  java.util.List buttonGradient = Arrays.asList(
				  new Object[] {Float.valueOf(.3f), Float.valueOf(0f),
						  new ColorUIResource(0x1c383b), new ColorUIResource(0x1c383b), getSecondary2() });

		  aTable.put("MenuBar.gradient",  Arrays.asList(new Object[] {
				  Float.valueOf(1f), Float.valueOf(0f),
				  getWhite(), getSecondary3(),
				  getSecondary3() }));
		  aTable.put("MenuBar.borderColor",  fBlack);
		  aTable.put("Button.gradient",  buttonGradient);
		  aTable.put("CheckBox.gradient",  buttonGradient);
		  aTable.put("CheckBoxMenuItem.gradient",  buttonGradient);
		  aTable.put("InternalFrame.activeTitleGradient",  buttonGradient);
		  aTable.put("RadioButton.gradient",  buttonGradient);
		  aTable.put("RadioButtonMenuItem.gradient",  buttonGradient);
		  aTable.put("ScrollBar.gradient",  buttonGradient);
		  aTable.put("ToggleButton.gradient",  buttonGradient);
		  aTable.put("TabbedPane.selected",  getPrimary3());
		  aTable.put("TabbedPane.contentAreaColor",  getSecondary2());
		  aTable.put("TabbedPane.tabAreaBackground",  getSecondary3());
		  aTable.put("TabbedPane.unselectedBackground",  new ColorUIResource(0x1c383b));
		  aTable.put("Table.dropLineShortColor",  fOCEAN_BLACK);
		  aTable.put("Table.dropCellBackground",  fOCEAN_DROP);
		  aTable.put("Table.gridColor",  getSecondary1());
		  aTable.put("Tree.dropCellBackground",  fOCEAN_DROP);
		  aTable.put("List.dropCellBackground",  fOCEAN_DROP);
		// put SWGAide specific colors here. These used to be constants in SWGGuiUtils
		  aTable.put("SWG.colorAlert",  new Color(0xffcc66));
		  aTable.put("SWG.colorCategory",  new Color(0xd8b5d8));
		  aTable.put("SWG.colorComponent",  new Color(0xb7c2ce));
		  aTable.put("SWG.colorDepleted",  new Color(0xef22ef));
		  aTable.put("SWG.colorItem",  new Color(0xe2e290));
		  aTable.put("SWG.colorLightGray",  new Color(0x999999));
		  aTable.put("SWG.colorNonHarvested",  new Color(0x7f7ffa));
		  aTable.put("SWG.colorResource",  new Color(0xbed1aa));
		  aTable.put("SWG.colorThinBorder",  new Color(0xc1efed));
		  aTable.put("SWG.colorWarning",  new Color(0xffafaf));
		  aTable.put("SWG.todaysCyan",  new Color(0x2ebdbd));
		  aTable.put("SWG.benchBAD",  new Color(0xfd2525));
		  aTable.put("SWG.benchFAIR",  new Color(0xFF8C00));
		  aTable.put("SWG.benchGREAT",  new Color(0x23e63a));
	  }
	  public String getName(){ return fName; }
	  protected ColorUIResource getPrimary1() { return fPrimary1; }
	  protected ColorUIResource getPrimary2() { return fPrimary2; }
	  protected ColorUIResource getPrimary3() { return fPrimary3; }
	  protected ColorUIResource getSecondary1() { return fSecondary1; }
	  protected ColorUIResource getSecondary2() { return fSecondary2; }
	  protected ColorUIResource getSecondary3() { return fSecondary3; }
	  public ColorUIResource getInactiveControlTextColor() { return fINACTIVE_CONTROL_TEXT_COLOR; }
	  public ColorUIResource getControlTextColor() { return fCONTROL_TEXT_COLOR; }
	  public ColorUIResource getMenuDisabledForeground() { return fMENU_DISABLED_FOREGROUND; }
	  protected ColorUIResource getWhite() { return fBlack; }
	  protected ColorUIResource getBlack() { return fWhite; }
	  public ColorUIResource getDesktopColor() { return fSecondary1; }
	  public ColorUIResource getWindowBackground() { return fBlack; }
	  private final String fName = fSWG_NAME;
	  private final ColorUIResource fPrimary1 = new ColorUIResource(0x7acece);
	  private final ColorUIResource fPrimary2 = new ColorUIResource(0x005d6d);
	  private final ColorUIResource fPrimary3 = new ColorUIResource(0x326564);
	  private final ColorUIResource fSecondary1 = new ColorUIResource(0x618989);
	  private final ColorUIResource fSecondary2 = new ColorUIResource(0x162b2e);
	  private final ColorUIResource fSecondary3 = new ColorUIResource(0x162b2e);
	  private final ColorUIResource fINACTIVE_CONTROL_TEXT_COLOR = new ColorUIResource(0x87a09a);
	  private final ColorUIResource fCONTROL_TEXT_COLOR = new ColorUIResource(0xeeffff);
	  private final ColorUIResource fMENU_DISABLED_FOREGROUND = new ColorUIResource(0x87a09a);
	  private final ColorUIResource fOCEAN_BLACK = new ColorUIResource(0x028ba8);
	  private final ColorUIResource fOCEAN_DROP = new ColorUIResource(0x97ffff);
	  private final ColorUIResource fBlack = new ColorUIResource(0x1d3b3b);
	  private final ColorUIResource fWhite = new ColorUIResource(0xeeffff);
  }
}