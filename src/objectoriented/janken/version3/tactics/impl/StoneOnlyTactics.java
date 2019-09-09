package objectoriented.janken.version3.tactics.impl;

import objectoriented.janken.version3.Player;
import objectoriented.janken.version3.tactics.Tactics;

/**
 * 「グーが大好き！」戦略クラス。
 */
public class StoneOnlyTactics implements Tactics {
    /**
     * 戦略を読み、ジャンケンの手を得る.
     * 必ずグーを出す.
     *
     * @return ジャンケンの手
     */
    public int readTactics() {
        return Player.STONE;
    }
}

