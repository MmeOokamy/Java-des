package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.DeController.JDeBtn;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Font;

public class DeView extends JFrame {

	private JPanel contentPane;
	private JPanel panelHeader;
	private JPanel panelBody;
	private JPanel panelFooter;
	
	/**
	private JButton btnD6;
	private JButton btnD8;
	private JButton btnD10;
	private JButton btnD20;
	private JButton btnD100;
	**/
	
	/**
	 * déclaration de la classe JDeBtn qui est dans DeController
	 * g�rer le clic en un seul code // Refactorisation //
	 */
	public JDeBtn btnD6;
	public JDeBtn btnD8;
	public JDeBtn btnD10;
	public JDeBtn btnD20;
	public JDeBtn btnD100;
	
	private JLabel lblChoix;
	private JLabel lblResultat;
	public JTextField textChoix;
	public JTextField textResultat;
	
	public JButton btnLancer;


	/**
	 * Create the frame.
	 * Il n'y a pas le main ici!
	 */
	public DeView() {
		setTitle("Les D\u00E9s de MmeOokamy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 200);
		
		
		/**
		 * Modification du new JPanel() pour integrer le kit d'image
		 */
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {  
				                      Image img = Toolkit.getDefaultToolkit().getImage(  
				                                DeView.class.getResource("/img/background.jpg"));  // nomView en debut puis le lien vers le fichier
				                      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
				                 }  
	  
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/**
		 * Creation des panels header body footer
		 * le panelHeader.setOpaque(false) sert a gerer la transparence du fond
		 */
		panelHeader = new JPanel();
		panelHeader.setOpaque(false);
		contentPane.add(panelHeader, BorderLayout.NORTH);
		
		panelBody = new JPanel();
		panelBody.setOpaque(false);
		contentPane.add(panelBody, BorderLayout.CENTER);
		
		panelFooter = new JPanel();
		panelFooter.setOpaque(false);
		contentPane.add(panelFooter, BorderLayout.SOUTH);
		
		/**
		 * PanelHeader
		 * Bouton des d�s 6 10 20 100
		 */
		btnD6 = new JDeBtn("6");
		/*
		 * btnD6.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseClicked(MouseEvent e) { String valeur =
		 * btnD6.getText(); textChoix.setText(valeur);
		 * 
		 * } });
		 */
		panelHeader.add(btnD6);
		
		btnD10 = new JDeBtn("10");
		/*
		 * btnD10.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseClicked(MouseEvent e) { String valeur =
		 * btnD10.getText(); textChoix.setText(valeur);
		 * 
		 * } });
		 */
		
		btnD8 = new JDeBtn("8");
//		btnD8.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				String valeur = btnD8.getText();
//				textChoix.setText(valeur);
//			}
//		});
		panelHeader.add(btnD8);
		panelHeader.add(btnD10);
		
		btnD20 = new JDeBtn("20");
//		btnD20.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				String valeur = btnD20.getText();
//				textChoix.setText(valeur);
//
//			}
//		});
		panelHeader.add(btnD20);
		
		btnD100 = new JDeBtn("100");
//		btnD100.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				String valeur = btnD100.getText();
//				textChoix.setText(valeur);
//
//			}
//		});
		panelHeader.add(btnD100);
		panelBody.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow]"));

		lblChoix = new JLabel("Choix du D\u00E9");
		lblChoix.setFont(new Font("Mass Effect Game 123", Font.PLAIN, 11));
		lblChoix.setForeground(new Color(255, 0, 255));
		lblChoix.setHorizontalAlignment(SwingConstants.CENTER);
		panelBody.add(lblChoix, "cell 0 0,alignx left,aligny center");
		
		//Texte Modifiable
		textChoix = new JTextField();
		textChoix.setHorizontalAlignment(SwingConstants.CENTER);
		textChoix.setEditable(false);
		panelBody.add(textChoix, "cell 1 0,alignx center,aligny center");
		textChoix.setColumns(10);
		lblResultat = new JLabel("Resultat :");
		lblResultat.setFont(new Font("Mass Effect Game 123", Font.PLAIN, 11));
		lblResultat.setForeground(new Color(173, 255, 47));
		lblResultat.setHorizontalAlignment(SwingConstants.CENTER);

		panelBody.add(lblResultat, "cell 0 1,alignx left,aligny center");
		
		textResultat = new JTextField();
		textResultat.setHorizontalAlignment(SwingConstants.CENTER);
		textResultat.setEditable(false);
		panelBody.add(textResultat, "cell 1 1,alignx center,aligny center");
		textResultat.setColumns(10);
		
		
		
		/**
		 * PanelFooter
		 */
		
		btnLancer = new JButton("Lancer le D\u00E9");
		
		panelFooter.add(btnLancer);
		
		
		
		
	}
}
