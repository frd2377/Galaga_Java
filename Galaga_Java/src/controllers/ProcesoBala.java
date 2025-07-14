package controllers;

import models.Caracteres;
import views.ViewMain;

public class ProcesoBala extends Thread{

	public ViewMain viewMain;
	private Caracteres bala;
	
	public ProcesoBala(ViewMain viewMain,Caracteres bala) {
		this.viewMain = viewMain;
		this.bala = bala;
	}
	
	@Override
	public void run() {
		this.viewMain.PanelMain.add(bala);
		this.viewMain.PanelMain.repaint();
		for (int i = 0; i < 50; i++) {
			this.bala.setLocation(this.bala.getX(), this.bala.getY()-10);
			synchronized (viewMain.flags) {
				if (bala.getBounds().intersects(viewMain.enemigo1.getBounds())) {
					viewMain.remove(viewMain.enemigo1);
					viewMain.flags.set(0, true);
					
				}else if (bala.getBounds().intersects(viewMain.enemigo2.getBounds())) {
					viewMain.remove(viewMain.enemigo2);
					viewMain.flags.set(1, true);
					
				}else if (bala.getBounds().intersects(viewMain.enemigo3.getBounds())) {
					viewMain.remove(viewMain.enemigo3);
					viewMain.flags.set(2, true);
					
				} else if (bala.getBounds().intersects(viewMain.enemigo1_1.getBounds())) {
					viewMain.remove(viewMain.enemigo1_1);
					viewMain.flags.set(3, true);
					
				} else if (bala.getBounds().intersects(viewMain.enemigo1_2.getBounds())) {
					viewMain.remove(viewMain.enemigo1_2);
					viewMain.flags.set(4, true);
					
				} else if (bala.getBounds().intersects(viewMain.enemigo2_1.getBounds())) {
					viewMain.remove(viewMain.enemigo2_1);
					viewMain.flags.set(5, true);
					
				} else if (bala.getBounds().intersects(viewMain.enemigo2_2.getBounds())) {
					viewMain.remove(viewMain.enemigo2_2);
					viewMain.flags.set(6, true);
					
				} else if (bala.getBounds().intersects(viewMain.enemigo2_3.getBounds())) {
					viewMain.remove(viewMain.enemigo2_3);
					viewMain.flags.set(7, true);
					
				} else if (bala.getBounds().intersects(viewMain.enemigo3_1.getBounds())) {
					viewMain.remove(viewMain.enemigo3_1);
					viewMain.flags.set(8, true);
					
				} else if (bala.getBounds().intersects(viewMain.enemigo3_2.getBounds())) {
					viewMain.remove(viewMain.enemigo3_2);
					viewMain.flags.set(9, true);
				
				} else if (bala.getBounds().intersects(viewMain.enemigo3_3.getBounds())) {
					viewMain.remove(viewMain.enemigo3_3);
					viewMain.flags.set(10, true);
				
				}
				
			}
			
			viewMain.repaint();
			
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
						
		}
		viewMain.repaint();
	}
	
	/*
	 * viewMain.PanelMain.add(bala);
	 * viewMain.PanelMain.repaint();
	 * */
	
}
