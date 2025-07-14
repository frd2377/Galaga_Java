package views;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.ControllerViewMain;
import models.Caracteres;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JProgressBar;

public class ViewMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelTemporizador;
	public JPanel PanelMain;
	public Caracteres nave,bala,enemigo1,enemigo2,enemigo3;
	public JLabel lbl_min;
	public JLabel lbl_seg;
	public Caracteres enemigo1_1;
	public Caracteres enemigo1_2;
	public Caracteres enemigo3_1;
	public Caracteres enemigo3_2;
	public Caracteres enemigo3_3;
	public Caracteres enemigo2_1;
	public Caracteres enemigo2_2;
	public Caracteres enemigo2_3;
	
	public ArrayList<Boolean> flags = new ArrayList<>();
	private JPanel panelLabel;
	public JProgressBar progressBarVida;

	public ViewMain() {
		flags.add(false);
		flags.add(false);
		flags.add(false);
		flags.add(false);
		flags.add(false);
		flags.add(false);
		flags.add(false);
		flags.add(false);
		flags.add(false);
		flags.add(false);		
		flags.add(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		PanelMain = new JPanel();
		PanelMain.setBackground(new Color(0, 0, 0));
		PanelMain.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelMain);
		setResizable(false);
		PanelMain.setLayout(null);
		
		/*JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(ViewMain.class.getResource("/caracteres/img1.jpg")));
		lblNewLabel.setBounds(200, 24, 58, 30);
		PanelMain.add(lblNewLabel);*/
		
		nave = new Caracteres("/caracteres/nave.png",310, 382, 62, 50);
		PanelMain.add(nave);
		
		enemigo1 = new Caracteres("/caracteres/img1.jpg", 208, 24, 30, 30);
		enemigo1.setLocation(233, 24);
		PanelMain.add(enemigo1);
		
		enemigo2 = new Caracteres("/caracteres/img2.jpg", 122, 197, 40, 50);
		enemigo2.setLocation(158, 197);
		PanelMain.add(enemigo2);
		
		enemigo3 = new Caracteres("/caracteres/img3.jpg", 145, 92, 40, 40);
		enemigo3.setLocation(202, 121);
		PanelMain.add(enemigo3);
		
		enemigo1_1 = new Caracteres("/caracteres/img1.jpg", 200, 24, 58, 38);
		enemigo1_1.setBounds(326, 24, 30, 30);
		PanelMain.add(enemigo1_1);
		
		enemigo1_2 = new Caracteres("/caracteres/img1.jpg", 200, 24, 58, 38);
		enemigo1_2.setBounds(426, 24, 30, 30);
		PanelMain.add(enemigo1_2);
		
		enemigo3_1 = new Caracteres("/caracteres/img3.jpg", 155, 73, 43, 50);
		enemigo3_1.setBounds(299, 121, 40, 40);
		PanelMain.add(enemigo3_1);
		
		enemigo3_2 = new Caracteres("/caracteres/img3.jpg", 155, 73, 43, 50);
		enemigo3_2.setBounds(407, 121, 40, 40);
		PanelMain.add(enemigo3_2);
		
		enemigo3_3 = new Caracteres("/caracteres/img3.jpg", 155, 73, 43, 50);
		enemigo3_3.setBounds(498, 121, 40, 40);
		PanelMain.add(enemigo3_3);
		
		enemigo2_1 = new Caracteres("/caracteres/img2.jpg", 91, 141, 43, 50);
		enemigo2_1.setBounds(256, 197, 40, 50);
		PanelMain.add(enemigo2_1);
		
		enemigo2_2 = new Caracteres("/caracteres/img2.jpg", 91, 141, 43, 50);
		enemigo2_2.setBounds(374, 197, 40, 50);
		PanelMain.add(enemigo2_2);
		
		enemigo2_3 = new Caracteres("/caracteres/img2.jpg", 91, 141, 43, 50);
		enemigo2_3.setBounds(468, 197, 40, 50);
		PanelMain.add(enemigo2_3);
		
		panelTemporizador = new JPanel();
		panelTemporizador.setBackground(new Color(0, 0, 0));
		panelTemporizador.setBounds(637, 11, 87, 42);
		PanelMain.add(panelTemporizador);
		panelTemporizador.setLayout(null);
		
		lbl_min = new JLabel("00");
		lbl_min.setForeground(new Color(255, 255, 255));
		lbl_min.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbl_min.setBounds(0, 0, 38, 42);
		panelTemporizador.add(lbl_min);
		
		lbl_seg = new JLabel("00");
		lbl_seg.setForeground(new Color(255, 255, 255));
		lbl_seg.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbl_seg.setBounds(48, 0, 39, 42);
		panelTemporizador.add(lbl_seg);
		
		JLabel lblSeparador = new JLabel(":");
		lblSeparador.setForeground(new Color(255, 255, 255));
		lblSeparador.setBounds(35, 8, 11, 26);
		panelTemporizador.add(lblSeparador);
		lblSeparador.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		progressBarVida = new JProgressBar();
		progressBarVida.setBackground(new Color(0, 0, 0));
		progressBarVida.setForeground(new Color(255, 43, 43));
		progressBarVida.setBounds(71, 11, 120, 14);
		progressBarVida.setValue(100);
		progressBarVida.setBorder(BorderFactory.createEmptyBorder());
		PanelMain.add(progressBarVida);
		
		panelLabel = new JPanel();
		panelLabel.setBackground(new Color(0, 0, 0));
		panelLabel.setBounds(10, 11, 51, 14);
		PanelMain.add(panelLabel);
		panelLabel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VIDA:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 51, 14);
		panelLabel.add(lblNewLabel);
		
		ControllerViewMain controllerViewMain = new ControllerViewMain(this);
		
	}
}
