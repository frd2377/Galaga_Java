package controllers;

import java.util.Random;

import javax.swing.JOptionPane;

import models.Caracteres;
import models.MejoresJugadores;
import views.ViewMain;

public class ProcesoBalaEnemigas extends Thread{
	
	private ViewMain viewMain;
	private int turnos;
	private Caracteres balaEnemiga;
	private int vida = 100;
	private MejoresJugadores mejoresJugadores = new MejoresJugadores();
	
	public ProcesoBalaEnemigas(ViewMain viewMain) {
		this.viewMain = viewMain;
	}

	@Override
	public void run() {
		while(true) {
			turnos=numeroAleatorio(1, 10);
			boolean colision = false;
			
			if (turnos==1 && viewMain.flags.get(0).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo1.getX()+20, viewMain.enemigo1.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
						
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if(turnos==2 && viewMain.flags.get(1).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo2.getX()+20, viewMain.enemigo2.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);

					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
						
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==3 && viewMain.flags.get(2).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo3.getX()+20, viewMain.enemigo3.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==4 && viewMain.flags.get(3).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo3_1.getX()+20, viewMain.enemigo3_1.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==5 && viewMain.flags.get(4).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo3_2.getX()+20, viewMain.enemigo3_2.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==6 && viewMain.flags.get(5).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo3_3.getX()+20, viewMain.enemigo3_3.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.enemigo3.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==7 && viewMain.flags.get(6).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo1_1.getX()+20, viewMain.enemigo1_1.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==8 && viewMain.flags.get(7).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo1_2.getX()+20, viewMain.enemigo1_2.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==9 && viewMain.flags.get(8).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo2_1.getX()+20, viewMain.enemigo2_1.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==10 && viewMain.flags.get(9).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo2_2.getX()+20, viewMain.enemigo2_2.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.enemigo3.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}else if (turnos==11 && viewMain.flags.get(10).equals(false)) {
				this.balaEnemiga = new Caracteres("/caracteres/balaEnemiga.png",viewMain.enemigo2_3.getX()+20, viewMain.enemigo2_3.getY()+30, 7, 25);
				viewMain.PanelMain.add(balaEnemiga);
				viewMain.repaint();
				for (int i = 0; i < 50; i++) {
					this.balaEnemiga.setLocation(this.balaEnemiga.getX(), this.balaEnemiga.getY()+10);
					
					if (balaEnemiga.getBounds().intersects(viewMain.nave.getBounds())) {
						colision = true;
					}
					
					try {
						sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}
								
				}
				
			}
			
			if (colision) {
				viewMain.progressBarVida.setValue(vida-=10);
				ProcesoSonido restaVida = new ProcesoSonido("src/sonidos/sonidoVida.wav", 0);
				restaVida.start();
				if (viewMain.progressBarVida.getValue()<=0) {
					int opcion = JOptionPane.showConfirmDialog(viewMain, "Perdiste\nReiniciar:");
					if (opcion==0) {
						viewMain.dispose();
						System.exit(0);
						
					}
				}
			}
			
			if (CheckJuego()) {
				System.out.println(viewMain.lbl_min.getText());
				System.out.println(viewMain.lbl_seg.getText());
				
				try {
					mejoresJugadores.guardarTiempo(viewMain.lbl_min.getText()+":"+viewMain.lbl_seg.getText());
					mejoresJugadores.ordenarTiempos();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(viewMain, "WIN");
				viewMain.dispose();
				System.exit(0);
			}
			
			viewMain.repaint();
		}
	}
	
	public int numeroAleatorio(int a, int b) {
	    Random random = new Random();
	    return random.nextInt(b - a + 1) + a;
	}
	
	public boolean CheckJuego() {
		for (Boolean elemento : viewMain.flags) {
			if (elemento.equals(false)) {
				return false;
			}
		}
		return true;
	}
	
}
