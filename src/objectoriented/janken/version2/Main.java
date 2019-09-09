package objectoriented.janken.version2;

/**
 * 継承を用いてプレイヤーごとに手の出し方を変更可能にしたジャンケンプログラム.
 * プレイヤーごとの手の出し方が被ってしまう場合はコードが重複してしまう...
 */
public class Main {
    public static void main(String[] args) {
        Judge judge = new Judge();

        Player tezuka = new Tezuka("手塚さん");
        Player nikaido = new Nikaido("二階堂さん");

        judge.startJanken(tezuka, nikaido);
    }
}
