# PlayingCards
一个简单的命令行扑克游戏。

## 特性
* 把发牌和判断胜者的方法封装在 Machine 中，保证了主程序的简洁。
* 区分对牌的比较（CardComparator）和对人的比较（PlayerComparator）。
* 发牌的数量自由控制。


## 未完成
* 语言包. @Card.java
* 当牌不够下一次游戏时，自动重新洗牌. @Machine.java
* 翻译玩法. @PlayCards.java
* 使用 Collections.shuffle(List<?> list) 方法优化.

