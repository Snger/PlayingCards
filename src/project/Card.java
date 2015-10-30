package project;

public class Card {
	private String index;
	private int color;
	
	public Card(String index,int color){
		setIndex(index);
		setColor(color);
	}
	
	/*
	 * TODO language package
	 */
	public String getColorName(){
		String colorName = null;
		switch(this.color){
			case 1:colorName="黑桃";
					break;
			case 2:colorName="红桃";
					break;
			case 3:colorName="梅花";
					break;
			case 4:colorName="方块";
					break;
		}
		return colorName;
	}
	public void setIndex(String index){
		this.index = index;
	}
	public String getIndex(){
		return this.index;
	}
	public void setColor(int color){
		this.color = color;
	}
	public int getColor(){
		return this.color;
	}
}
