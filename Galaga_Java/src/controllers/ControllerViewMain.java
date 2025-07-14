package controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import models.Caracteres;
import views.ViewMain;

public class ControllerViewMain implements KeyListener{

	private ViewMain viewMain;
	private ProcesoTemporizador procesoTemporizador;
	
	public ControllerViewMain(ViewMain viewMain) {
		this.viewMain = viewMain;
		this.viewMain.addKeyListener(this);
		this.procesoTemporizador = new ProcesoTemporizador(this.viewMain);
		this.procesoTemporizador.start();
		ProcesoBalaEnemigas procesoBalaEnemigas = new ProcesoBalaEnemigas(this.viewMain);
		procesoBalaEnemigas.start();
		ProcesoSonido sonidoPrincipal = new ProcesoSonido("src/sonidos/sonidoPrincipal.wav",4);
		sonidoPrincipal.start();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			viewMain.nave.setLocation(viewMain.nave.getX(), viewMain.nave.getY()-10);
			
		}else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			viewMain.nave.setLocation(viewMain.nave.getX(), viewMain.nave.getY()+10);
				
		}else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			viewMain.nave.setLocation(viewMain.nave.getX()+10, viewMain.nave.getY());	
			
		}else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			viewMain.nave.setLocation(viewMain.nave.getX()-10, viewMain.nave.getY());
			
		}	

		//bala
		if (e.getKeyCode()==KeyEvent.VK_A) {
			Caracteres bala = new Caracteres("/caracteres/bala.png",viewMain.nave.getX()+28, viewMain.nave.getY()-30, 7, 25);
			/*viewMain.PanelMain.add(bala);
			viewMain.PanelMain.repaint();*/
			ProcesoBala procesoBala = new ProcesoBala(viewMain, bala);
			procesoBala.start();
			ProcesoSonido sonidoBala = new ProcesoSonido("src/sonidos/sonidoDisparo.wav",0);
			sonidoBala.start();
			
		}
		
		if (e.getKeyCode()==KeyEvent.VK_S) {
			this.procesoTemporizador.suspend();
			int opcion = JOptionPane.showConfirmDialog(viewMain, "Desea salir del programa?");
			if (opcion==0) {
				viewMain.dispose();
			}else {
				this.procesoTemporizador.resume();
			}
		}
	
	}
	
}
