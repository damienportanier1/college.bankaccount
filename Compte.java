//package TP.src.src; //on fait appel au package

public class Compte { //Compte = même nom que le fichier java

//variables
	int numero, solde; //int car nombre entier 0 à 9
	String proprietaire; //String/chaine de caractères car lettres a b c A B C

//constructor
	public Compte (int s, int num, String prop) {//on reprend le nom de la public class //entre () on met les paramètres //int s pour le solde //int num pour numero // String proprietaire
		this.solde = s; //on renvoi à la class et on link la var solde avec s etc
		this.numero = num;
		this.proprietaire = prop;
	}//ferme constructor class

	//set - input depot de l'user
	public void depot (int montant) {//user input le montant nb entier
		solde += montant; //or solde = solde + montant;

		System.out.println (proprietaire+"a depose "+montant); //print
	}
	//input retrait user
	public void retrait (int montant) {//user input le montant nb entier
		solde -= montant; //or solde = solde + montant;

		System.out.println (proprietaire+"a retire "+montant); //print
	}
	//virement d'un compte A à un compte B
	public static void virer (int montant, Compte env, Compte ben) {// Compte est un datatype
		env.solde -= montant; //compte envoi débité d'un certain montant donc le solde se réduit
		ben.solde += montant; //compte beneficiaire crédité du montant donc le solde augmente

		System.out.println (env.proprietaire+" a vire "+montant+" a "+ben.proprietaire); //print
	}

	//main class qu'on retrouve general dans le fichier app.java car regle de bonne programmation
	public static void main (String[] args){
		Compte c1 = new Compte (1, 200,"Damien"); //var + declare and create object + input

		Compte c2 = new Compte (2, 500,"Marina");

		//depot
		c1.depot (300);
		//retrait
		c1.retrait (100);

		//method virer faite plus haut
		virer (100, c1, c2); //c1 envoi à c2
	}

} //ferme public class