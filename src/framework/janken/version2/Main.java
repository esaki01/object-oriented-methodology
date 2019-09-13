package framework.janken.version2;

/**
 * じゃんけんプログラム.
 */
public class Main {
    public static void main(String[] args) {
        Judge judge = new Judge();

        Player tezuka = new Player("手塚さん");
        Player nikaido = new Player("二階堂さん");

        judge.startJanken(tezuka, nikaido);
    }
}
