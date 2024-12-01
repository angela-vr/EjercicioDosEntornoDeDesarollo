package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" }; // definición de palos
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" }; // definición de valores

		ArrayList<Card> deck = new ArrayList<Card>(); // método ArrayList para almacenar los datos
		
		// combinación de cada palo con cada valor, creando todas las cartas
		for (int i = 0; i < suits.length; i++) { 
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		// barajar cartas
		for (int i = 0; i < deck.size(); i++) { // i = posición del mazo
			int j = (int) Math.floor(Math.random() * i); // nº aleatorio entre 0 e i
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		for (int i = 0; i < 5; i++) { // impresión de las primeras 5 cartas
			System.out.println(deck.get(i));
		}

	}

}
