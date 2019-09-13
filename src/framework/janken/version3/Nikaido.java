package framework.janken.version3;

/**
 * プレイヤーを継承した二階堂さんクラス.
 */
public class Nikaido extends Player {
    /**
     * コンストラクタ.
     *
     * @param name 名前
     */
    public Nikaido(String name) {
        super(name);
    }

    /**
     * ジャンケンの手を出す.
     * 必ずパーを出す.
     *
     * @return ジャンケンの手
     */
    @Override
    public int showHand() {
        return PAPER;
    }
}
