package framework.sevens;

import framework.trump.*;

/**
 * 七並べプログラム.
 */
public class Main {
    public static void main(String[] args) {
        Master master = new SevensMaster();

        Table table = new SevensTable();

        Rule rule = new SevensRule();

        Player murata = new SevensPlayer("村田", master, table, rule);
        Player yamada = new SevensPlayer("山田", master, table, rule);
        Player saito = new SevensPlayer("斎藤", master, table, rule);

        master.registerPlayer(murata);
        master.registerPlayer(yamada);
        master.registerPlayer(saito);

        // トランプを生成する
        Hand trump = createTrump();

        // ゲームの準備をする
        master.prepareGame(trump);

        // ゲームを開始する
        master.startGame();
    }

    /**
     * 53枚のトランプを生成する.
     *
     * @return トランプを格納したDeal
     */
    private static Hand createTrump() {
        Hand trump = new Hand();

        // 各スート53枚のカードを生成する
        for (int number = 1; number <= Card.CARD_NUM; number++) {
            trump.addCard(new Card(Card.SUIT_CLUB, number));
            trump.addCard(new Card(Card.SUIT_DIAMOND, number));
            trump.addCard(new Card(Card.SUIT_HEART, number));
            trump.addCard(new Card(Card.SUIT_SPADE, number));
        }

        return trump;
    }
}
