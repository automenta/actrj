package actr.env;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

import actr.Main;

/**
 * The resources module used primarily for retrieving image and icon resources.
 * 
 * @author Dario Salvucci
 */
public class Resources
{
	/**
	 * Gets an image from the resource directory.
	 * @param name the file name
	 * @return the image, or <tt>null</tt> if an error occurs
	 */
	public static Image getImage (String name)
	{

        return Toolkit.getDefaultToolkit().getImage("./src/main/resources/" + name);
//		try
//		{
//			if (Main.inApplet())
//				return Main.getApplet().getImage (Main.getApplet().getCodeBase(), "resources/" + name);
//			else
//				return Toolkit.getDefaultToolkit().getImage (Resources.class.getResource (name));
//		}
//		catch (Exception e) { return null; }
	}

	/**
	 * Gets an icon from the resource directory.
	 * @param name the file name
	 * @return the icon, or <tt>null</tt> if an error occurs
	 */
	public static Icon getIcon (String name)
	{
		Image image = getImage (name);
		return (image != null) ? new ImageIcon (image) : null;
	}
}
