package controllers;

import views.ViewMain;

public class ProcesoTemporizador extends Thread{

	private ViewMain viewMain;

	public ProcesoTemporizador(ViewMain viewMain) {
		this.viewMain = viewMain;
	}
	
	public void run() {
		for(int min=1;min<5;min++) {
			for(int seg=0;seg<60;seg++) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(seg<10) {
					viewMain.lbl_seg.setText("0"+seg);
				}else {
					viewMain.lbl_seg.setText(String.valueOf(seg));
				}
				
			}
			viewMain.lbl_min.setText("0"+min);
		}
	}
	
}
