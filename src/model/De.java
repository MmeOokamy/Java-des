package model;

import java.util.Scanner;

public class De {
	//Attributs
	private Integer valeur;
	
	public Integer getValeur() {
		return valeur;
	}

	public void setValeur(Integer valeur) {
		this.valeur = valeur;
	}
	//Constructeur
	public De(int valeur) {
		this.valeur = valeur;
	}
	
	
	//methode
	public int lancer(int valeur) {
		int nb = (int) (Math.random() * (valeur) + 1);
		
		//System.out.println(nb);
		return nb;
	}
	
	/**
	 * quand run de.java
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Choissisez le Dé a utiliser : ");
	    Scanner scan = new Scanner(System.in);
	   int nb = scan.nextInt();
	   De de = new De(nb);
	   int test = de.lancer(nb);
		System.out.println(test);
	}


}
