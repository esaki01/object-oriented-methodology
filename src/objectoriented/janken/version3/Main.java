package objectoriented.janken.version3;

import objectoriented.janken.version3.tactics.impl.AskTactics;
import objectoriented.janken.version3.tactics.impl.RandomTactics;

/**
 * インターフェスを用いてプレイヤーに戦略を持たせたジャンケンプログラム.
 */
public class Main {
    public static void main(String[] args) {
        Judge judge = new Judge();

        Player tezuka = new Player("手塚さん");
        tezuka.setTactics(new AskTactics());

        Player nikaido = new Player("二階堂さん");
        nikaido.setTactics(new RandomTactics());

        judge.startJanken(tezuka, nikaido);
    }
}
