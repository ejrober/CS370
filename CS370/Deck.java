import java.util.Random;

public class Deck {
	int top;
	Card[] cards;
	public Deck() {
		cards = new Card[52];
		for (int i = 0; i < 52; i++) {
			top = i;
			cards[top] = makeCard();
			//System.out.println(cards[top].suit + " " + cards[top].quantity);
		}
		
	}
	public Card makeCard() {
		Random r = new Random();
		int n = ((int) (r.nextDouble() * 13)) + 1;
		int s = ((int) (r.nextDouble() * 4)) + 1;
		char c = 'e';
		switch (s) {
			case 1: c = 's';
					break;
			case 2: c = 'h';
					break;
			case 3: c = 'c';
					break;
			case 4: c = 'd';
					break;
		}
		if (c == 'e') System.out.println("I don't know what to tell you");
		Card newCard = new Card(n, c);
		boolean copy = false;
		for (int i = 0; i < top; i++) {
			if (cards[i].equals(newCard)) copy = true;
		}
		if (copy) newCard = makeCard();
		//System.out.println("check");
		//System.out.println(newCard.suit + " " + newCard.quantity);
		return newCard;
	}
	public Card draw() {
		Card drawn = cards[top];
		top--;
		return drawn;
	}


}
