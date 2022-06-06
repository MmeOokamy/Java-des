package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import model.De;
import view.DeView;

public class DeController {
//Attribut + get et set
	private static DeView viewD;

	public DeView getViewD() {
		return viewD;
	}

	public void setViewD(DeView viewD) {
		DeController.viewD = viewD;
		//this.viewD = viewD;
	}
	
	/**
	 * creation d'une function pour factorisé les Dés
	 * 1-> une class pour les btnDe et le clic  puis une fonction pour traiter le clik
	 */
	public static class JDeBtn extends JButton{
		public JDeBtn(String text) {
			super(text);
			addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					btnDeAction(e);

				}
			});
		}
	}
	
	private static void btnDeAction(ActionEvent e) {
		//recupère la source du clic (ici le bouton du choix de dé)
		JButton button = (JButton) e.getSource();// getSource sert a recupéré le composant qui a ete cliqué
		
		//Affiche la valeur du dé dans le champs text
		viewD.textChoix.setText(button.getText());
		//System.out.println(button.getText());

		
	
	}
	
	
	/**
	 * Gestion de la vue
	 * @throws IOException 
	 */
	public DeController(){
		viewD = new DeView();
		viewD.setVisible(true);
		
		viewD.btnLancer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nbString = viewD.textChoix.getText();
				int nb = Integer.parseInt(nbString);
				De choix = new De(nb);
			int resultat = choix.lancer(nb);
			viewD.textResultat.setText(String.valueOf(resultat));
			}
		});
	}
	
}
