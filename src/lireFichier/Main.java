package lireFichier;

public class Main {

	public static void main(String[] args){
		LecteurTexte lt = new LecteurTexte();
		
		lt.lireFichier("test1.txt");
		lt.lireFichierPalindrome("test1.txt");
	}

}
