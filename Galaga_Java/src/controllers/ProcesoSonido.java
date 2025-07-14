package controllers;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import patron_grupo_v_10.archivos;

public class ProcesoSonido extends Thread{
	
	private archivos file;
	private Clip clip;
	private int num;
	
	public ProcesoSonido(String ruta,int num) {
		file = new archivos(ruta);
		this.num = num;
	}

	@Override
	public void run() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file.getFile());
	        clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.loop(num);
	        clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
