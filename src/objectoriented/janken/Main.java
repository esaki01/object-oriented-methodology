package objectoriented.janken;

/**
 * オブジェクト指向によるジャンケンプログラム.
 */
public class Main {
    public static void main(String[] args) {
        Judge judge = new Judge();

        Player murata = new Player("手塚さん");
        Player yamada = new Player("二階堂さん");

        judge.startJanken(murata, yamada);
    }
}
