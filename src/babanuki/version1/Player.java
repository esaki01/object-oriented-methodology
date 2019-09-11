package babanuki.version1;

/**
 * ばば抜きのプレイヤークラス.
 */
public class Player {
    // 進行役
    private Master master;

    // テーブル
    private Table table;

    // 自分の手札
    private Hand myHand = new Hand();

    // プレイヤー名
    private String name;

    /**
     * コンストラクタ.
     *
     * @param name   プレイヤー名
     * @param master 進行役
     * @param table  テーブル
     */
    public Player(String name, Master master, Table table) {
        this.name = name;
        this.master = master;
        this.table = table;
    }

    /**
     * 順番を指名する.
     *
     * @param nextPlayer 次のプレイヤー
     */
    public void play(Player nextPlayer) {
        // 次のプレイヤーに手札を出してもらう
        Hand nextHand = nextPlayer.showHand();

        // 相手の手札からカードを一枚引く
        Card pickedCard = nextHand.pickCard();

        System.out.println(this + "：" + nextPlayer + "さんから " + pickedCard + " を引きました");

        // 引いたカードを自分の手札に加え、同じ数のカードがあったら捨てる
        dealCard(pickedCard);

        // 手札がゼロになったかどうか調べる
        if (myHand.getNumberOfCards() == 0) {
            // 進行役に上がりを宣言する
            master.declareWin(this);
        } else {
            System.out.println(this + "：残りの手札は " + myHand + "です");
        }
    }

    /**
     * 手札を見せる.
     *
     * @return 自分の手札
     */
    public Hand showHand() {
        // もしこの時点で手札が残り1枚ならば上がりとなるので宣言する
        if (myHand.getNumberOfCards() == 1) {
            master.declareWin(this);
        }

        // 見せる前にシャッフルする
        myHand.shuffle();

        return myHand;
    }

    /**
     * カードを受け取る.
     *
     * @param card 受け取ったカード
     */
    public void receiveCard(Card card) {
        // 引いたカードを自分の手札に加え、同じ数のカードがあったら捨てる
        dealCard(card);
    }

    /**
     * カードを自分の手札に加え、同じ数のカードがあったら捨てる.
     *
     * @param card
     */
    private void dealCard(Card card) {
        // カードを自分の手札に加える
        myHand.addCard(card);

        // 今加えたカードと同じカードを探す
        Card[] sameCards = myHand.findSameNumberCard();

        // 同じカードの組み合わせが存在した場合
        if (sameCards != null) {
            // テーブルへカードを捨てる
            System.out.print(this + "：");
            table.disposeCard(sameCards);
        }
    }

    /**
     * プレイヤーの名前を返す.
     *
     * @return プレイヤーの名前
     */
    public String toString() {
        return name;
    }
}
