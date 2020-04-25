package me.shuke.logging;

import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

public class LoggingImageViewer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(System.getProperty("java.util.logging.config.class") == null && System.getProperty("java.util.logging.config.file") == null)
		{
			try
			{
				Logger.getLogger("me.shuke.logging").setLevel(Level.ALL);
				final int LOG_RDTATION_COUNT = 10;
				Handler handler = new FileHandler("%h/LoggingImageViewer.log", 0, LOG_RDTATION_COUNT);
				Logger.getLogger("me.shuke.logging").addHandler(handler);
			}
			catch(IOException e)
			{
				Logger.getLogger("me.shuke.logging").log(Level.SEVERE, "Can't create log file handler", e);
			}
		}

		EventQueue.invokeLater(()->
		{
			Handler windowHandler = new WindowHandler();
			windowHandler.setLevel(Level.ALL);
			Logger.getLogger("me.shuke.logging").addHandler(windowHandler);

			JFrame frame = new ImageViewerFrame();
			frame.setTitle("LoggingImageViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			Logger.getLogger("me.shuke.logging").fine("Showing frame");
			frame.setVisible(true);
		});

	}

}
