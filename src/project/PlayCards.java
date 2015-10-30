package project;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PlayCards {
	private Machine machine;
	private List<Player> players;
	
	public PlayCards(){
		this.machine = new Machine();
		this.players = new ArrayList<Player>();
	}
	/*
	 * 玩法：
	 * 1.创建一副扑克牌，不考虑大小王
	 * 2.创建两名玩家，玩家至少要有ID、姓名、手牌等属性，手牌为扑克牌的集合
	 * 3.洗牌，将之前创建的扑克牌顺序打乱（目前使用的方式：牌有顺序、随机发牌）
	 * 4.发牌，将洗牌之后的扑克牌集合，从第一张开始，发给两名玩家，按照一人一张的方式，每人发两张
	 * 5.开始游戏，比大小，大小相同比花色
	 */
	public static void main(String[] args) {
		PlayCards pc = new PlayCards();
		pc.machine.createCards();
		pc.machine.showAllCards();
		Player player1 = new Player(1,"Poly");
		Player player2 = new Player(2,"John");
		pc.players.addAll(Arrays.asList(player1,player2));
//		Card card = pc.machine.sendSingleCard();
//		System.out.println("get a card:"+card.getColorName()+card.getIndex());
		pc.machine.sendCard(pc.players, 5);
		pc.machine.whoIsWinner(pc.players);
	}

}
