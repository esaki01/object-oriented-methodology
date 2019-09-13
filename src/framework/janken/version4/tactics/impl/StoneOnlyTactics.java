package framework.janken.version4.tactics.impl;

import framework.janken.version4.Player;
import framework.janken.version4.tactics.Tactics;

/**
 * 「グーが大好き！」戦略クラス.
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

