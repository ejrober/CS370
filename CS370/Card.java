public class Card {
	int quantity;
	char suit;
	public Card(int q, char s) {
		quantity = q;
		suit = s;
	}
	public boolean equals(Card other) {
		return (this.quantity == other.quantity && this.suit == other.suit);
	}
	public String toString() {
		String sting = quantity + "\tof\t" + suit;
		switch (quantity) {
		case 1: sting = "Two of ";
		break;
		case 2: sting = "Three of ";
		break;
		case 3: sting = "Four of ";
		break;
		case 4: sting = "Five of ";
		break;
		case 5: sting = "Six of ";
		break;
		case 6: sting = "Seven of ";
		break;
		case 7: sting = "Eight of ";
		break;
		case 8: sting = "Nine of ";
		break;
		case 9: sting = "Ten of ";
		break;
		case 10: sting = "Jack of ";
		break;
		case 11: sting = "Queen of ";
		break;
		case 12: sting = "King of ";
		break;
		case 13: sting = "Ace of ";
		break;
		}
		switch (suit) {
			case 's': sting += "Spades";
			break;
			case 'h': sting += "Hearts";
			break;
			case 'c': sting += "Clubs";
			break;
			case 'd': sting += "Diamonds";
			break;
		}
		return sting;
	}

}
