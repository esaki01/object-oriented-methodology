package framework.trump;

/**
 * プレイヤーを表すクラス.
 */
public abstract class Player {
    // 名前
    protected String name;

    // テーブル
    protected Table table;

    // 手札
    protected Hand myHand = new Hand();

    // 進行役
    protected Master master;

    // ルール
    protected Rule rule;

    /**
     * コンストラクタ.
     *
     * @param name   名前
     * @param master 進行役
     * @param table  テーブル
     * @param rule   ルール
     */
    public Player(String name, Master master, Table table, Rule rule) {
        this.name = name;
        this.master = master;
        this.table = table;
        this.rule = rule;
    }

    /**
     * 順番を指名する.
     *
     * @param nextPlayer 次のプレイヤー
     */
    public abstract void play(Player nextPlayer);

    /**
     * カードを配る.
     *
     * @param card 受け取ったカード
     */
    public void receiveCard(Card card) {
        myHand.addCard(card);
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
