package framework.oldmaid;

/**
 * ばば抜きプログラム.
 */
public class Main {
    public static void main(String[] args) {
        Master master = new Master();
        Table field = new Table();

        Player murata = new Player("村田", master, field);
        Player yamada = new Player("山田", master, field);
        Player saito = new Player("斎藤", master, field);

        master.registerPlayer(murata);
        master.registerPlayer(yamada);
        master.registerPlayer(saito);

        Hand trump = createTrump();

        // ゲームの準備をする
        master.prepareGame(trump);

        // ゲームを開始する
        master.startGame();
    }

    /**
     * 53枚のトランプを生成する.
     *
     * @return トランプを格納したHand
     */
    private static Hand createTrump() {
        Hand trump = new Hand();

        // 各スート53枚のカードを生成する
        for (int number = 1; number <= 13; number++) {
            trump.addCard(new Card(Card.SUIT_CLUB, number));
            trump.addCard(new Card(Card.SUIT_DIAMOND, number));
            trump.addCard(new Card(Card.SUIT_HEART, number));
            trump.addCard(new Card(Card.SUIT_SPADE, number));
        }

        // ジョーカーの作成
        trump.addCard(new Card(0, Card.JOKER));

        return trump;
    }
}
