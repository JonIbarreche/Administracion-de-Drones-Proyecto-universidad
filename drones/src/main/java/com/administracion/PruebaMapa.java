package com.administracion;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import com.logger.AdminLogger;

public class PruebaMapa {
	
	private static final Logger LOGGE = Logger.getLogger(PruebaMapa.class.getName());
	private final Logger LOGGER = new AdminLogger(LOGGE, "pruebamapa.log").getLOGGER();

	public PruebaMapa() {
		try {
			final InputStream is = this.getClass().getClassLoader().getResourceAsStream("mapa.png");
			final BufferedImage image = ImageIO.read(is);
			final JLabel label = new JLabel(new ImageIcon(image));
			final JFrame f = new JFrame();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().add(label);
			f.pack();
			f.setLocation(200, 200);
			f.setVisible(true);
		} catch (final IOException ex) {
			LOGGER.info("Cargando mapa");
		}
	}
}