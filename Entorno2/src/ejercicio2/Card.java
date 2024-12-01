package ejercicio2;

public class Card {

	public String suit; // palo de la carta, ej: corazones, picas...
	public String value; // valor d ela carta, ej: A, 2, Q...
	
	public Card (String suit, String value) { // inicializa una carta con un palo y un valor
		this.suit = suit;
		this.value = value;
	}
	
	public String toString () { // transforma el método card en un formato legible ( estructura: palo - valor )
		return (this.suit+"-"+this.value);
	}
}
