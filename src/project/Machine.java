package project;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Machine {
	private List<Card> cards;
	private Random random;
	
	public Machine(){
		this.cards = new ArrayList<Card>();
		this.random = new Random();
	}
	
	public void createCards(){
		String[] cardsShow = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		for (String cardShow : cardsShow) {
			for (int i = 1; i < 5; i++) {
				Card card = new Card(cardShow,i);
				cards.add(card);
//				System.out.println("We had add "+card.getColorName()+card.getIndex());
			}
		}
	}
	public void showAllCards(){
		int i =0;
		for (Card card : cards) {
			System.out.print("\tcard:"+card.getColorName()+card.getIndex());
			i++;
			if(i%4==0){
				System.out.println("");
			}
		}
	}
	public void resetCards(){
		createCards();
	}
	public Card sendSingleCard(){
		int randomIndex = random.nextInt(cards.size());
		Card card = this.cards.get(randomIndex);
		this.cards.remove(card);
		return card;
	}
	public void sendCard(List<Player> players,int number){
		//TODO count need cards and reset cards.
		for (int i = 0; i < number; i++) {
			for (Player player : players) {
				Card card;
				do{
					card = sendSingleCard();
				}while(player.getCards().contains(card));
				player.addCard(card);
				System.out.println("Player:"+player.getName()+" get "
						+"a card:"+card.getColorName()+card.getIndex());
			}
		}
		for (Player player : players) {
			System.out.print("Player:"+player.getName()+" get cards:");
			for (Card card : player.getCards()) {
				System.out.print(card.getColorName()+card.getIndex()+" ");
			}
			System.out.println(" ");
		}
	}
	public Player whoIsWinner(List<Player> players){
		Player winner;
//		System.out.println("before sort,players is ");
//		for (Player player : players) {
//			System.out.println("player is "+player.getName());
//		}
		Collections.sort(players, new PlayerComparator());
//		System.out.println("after sort,players is ");
//		for (Player player : players) {
//			System.out.println("player is "+player.getName());
//		}
		winner = players.get(players.size()-1);
		Card winCard = winner.getCards().get(winner.getCards().size()-1);
		System.out.println("Winner is "+winner.getName()+",and the bigger card"
				+"is "+winCard.getColorName()+winCard.getIndex());
		return winner;
	}
}
