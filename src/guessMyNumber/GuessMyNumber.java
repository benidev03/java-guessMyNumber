package guessMyNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	
	/*
	 * Scrivere un programma che genera un numero casuale (senza visualizzarlo) 
	 * e chiede all'utente di indovinarlo.Dopo ogni tentativo dell'utente il programma 
	 * deve indicare se il numero generato è maggiore o minore di quello inserito dall'utente.
	 * Il programma termina quando l'utente indovina, nel qual caso mostra anche il numero di tentativi effettuati
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int numRandom = r.nextInt(5);
		int count = 1;
		
		System.out.print("Inserisci un numero: ");
		int numIndovinato = sc.nextInt();
		
		while(numIndovinato != numRandom){
			
			if(numIndovinato  < numRandom) {
				System.out.println("Il numero generato è maggiore di "+numIndovinato);
			
			}else {
				System.out.println("Il numero generato è minore di "+numIndovinato);
			}
			
			System.out.print("Inserisci un numero: ");
			numIndovinato  = sc.nextInt();
			
			count++;
		}
		System.out.println("\nComplimenti! hai indovinato il numero giusto.");
		System.out.println("Numero di tentativo: "+count);
		
	}

}
