package project;

import java.util.Collections;
import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		CardComparator CardComparator = new CardComparator();
		Collections.sort(p1.getCards(), CardComparator);
		Collections.sort(p2.getCards(), CardComparator);
		Card p1MaxCard = p1.getCards().get(p1.getCards().size()-1);
		Card p2MaxCard = p2.getCards().get(p2.getCards().size()-1);
		System.out.println("player1 max card is "+p1MaxCard.getColorName()+p1MaxCard.getIndex());
		System.out.println("player2 max card is "+p2MaxCard.getColorName()+p2MaxCard.getIndex());
		/*
		 * bad way: copy CardComparator code,and
		 * return compareCard(p1MaxCard,p2MaxCard);
		 */
		return CardComparator.compare(p1MaxCard,p2MaxCard);
	}

}
