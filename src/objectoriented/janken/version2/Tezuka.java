package objectoriented.janken.version2;

/**
 * プレイヤーを継承した手塚さんクラス.
 */
public class Tezuka extends Player {
    /**
     * コンストラクタ.
     *
     * @param name 名前
     */
    public Tezuka(String name) {
        super(name);
    }

    /**
     * ジャンケンの手を出す.
     * 必ずグーを出す.
     *
     * @return ジャンケンの手
     */
    @Override
    public int showHand() {
        return STONE;
    }
}
