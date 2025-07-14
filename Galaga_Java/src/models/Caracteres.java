package models;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import views.ViewMain;

public class Caracteres extends JLabel{
	
	private String rutaImagen;

    public Caracteres(String rutaImagen,int x, int y, int width,int height) {
        this.rutaImagen = rutaImagen;
        setHorizontalAlignment(SwingConstants.CENTER);
        setIcon(new ImageIcon(Caracteres.class.getResource(this.rutaImagen)));
        setBounds(x, y, width, height);
    }
	
}
