package project;

import java.util.List;
import java.util.ArrayList;

public class Player {
	private int id;
	private String name;
	private List<Card> cards;// List/ArrayList can use Collections.sort method
	
	public Player(int id,String name){
		setId(id);
		setName(name);
		this.cards = new ArrayList<Card>();
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void addCard(Card card){
		this.cards.add(card);
	}
	public void removeCard(Card card){
		this.cards.remove(card);
	}
	public List<Card> getCards(){
		return this.cards;
	}
}
