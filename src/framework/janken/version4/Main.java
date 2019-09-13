package framework.janken.version4;

import framework.janken.version4.tactics.impl.AskTactics;
import framework.janken.version4.tactics.impl.RandomTactics;

/**
 * じゃんけんプログラム.
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
