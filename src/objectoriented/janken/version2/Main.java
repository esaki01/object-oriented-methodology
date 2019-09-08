package objectoriented.janken.version2;

/**
 * オブジェクト指向によるジャンケンプログラム.
 */
public class Main {
    public static void main(String[] args) {
        Judge judge = new Judge();

        Player tezuka = new Tezuka("手塚さん");
        Player nikaido = new Nikaido("二階堂さん");

        judge.startJanken(tezuka, nikaido);
    }
}
