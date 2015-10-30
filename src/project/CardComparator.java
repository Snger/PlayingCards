package project;

import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class CardComparator implements Comparator<Card> {
	private String[] cardsShow = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private Map<String,Integer> cardsMap;
	
	public CardComparator(){
		this.cardsMap = new HashMap<String,Integer>();
		initCardComparator();
	}
	
	public void initCardComparator(){
		int i = 0;
		for (String card : cardsShow) {
			cardsMap.put(card,i);
			i++;
		}
	}
	@Override
	public int compare(Card c1,Card c2){
		/*
		 * wrong way: int c1Index = cardsMap.get(c1.getIndex());
		 */
		String c1Index = c1.getIndex();
		String c2Index = c2.getIndex();
		if(c1Index == c2Index){
			if(c1.getColor() == c2.getColor()){
				System.out.println("Who is card shark?");
				return 0;
			}else if(c1.getColor() > c2.getColor()){
				return -1;
			}else{
				return 1;
			}
		}else{
			int c1map = cardsMap.get(c1Index);
			int c2map = cardsMap.get(c2Index);
			if(c1map == c2map){
				return 0;
			}else if(c1map > c2map){
				return 1;
			}else{
				return -1;
			}
		}
	}
}
