package framework.sevens;

import framework.trump.*;

/**
 * 七並べ用プレイヤークラス.
 */
public class SevensPlayer extends Player {
    // パスした回数
    private int pass;

    /**
     * コンストラクタ.
     *
     * @param name   プレイヤーの名前
     * @param master 進行役
     * @param table  テーブル
     * @param rule   ルール
     */
    public SevensPlayer(String name, Master master, Table table, Rule rule) {
        super(name, master, table, rule);
    }

    /**
     * カードを配る.
     *
     * @param card 受け取ったカード
     */
    public void receiveCard(Card card) {
        if (card.getNumber() == 7) {
            // カードが7の場合は、テーブルにカードを置く
            System.out.println(name + "：" + card + "を置きました。");
            table.putCard(new Card[]{card});
        } else {
            // カードが7でない場合は、受け取ったカードを手札へ加える
            super.receiveCard(card);
        }
    }

    /**
     * 順番を指名する。
     *
     * @param nextPlayer 次のプレイヤー
     */
    public void play(Player nextPlayer) {
        // 現在の手札を表示する
        System.out.println("  " + myHand);

        // 現在の手札からテーブルに出せるものを探す
        Card[] candidate = rule.findCandidate(myHand, table);

        // 候補がある場合はテーブルに出す
        if (candidate != null) {
            System.out.println("  " + candidate[0] + "を置きました。\n");
            table.putCard(candidate);

            // テーブルの状態を表示する
            System.out.println(table);

            // 手札がなくなったら、上がりを宣言する
            if (myHand.getNumberOfCards() == 0) {
                master.declareWin(this);
            }
        } else {
            // テーブルに出せるカードがなかった場合、パスする
            pass++;
            ((SevensMaster) master).pass(this);

            // パス回数が制限回数以上ならばカードを全てテーブルに置く
            if (pass > SevensMaster.PASS_LIMIT) {
                int numberOfHand = myHand.getNumberOfCards();
                // 手札を全てテーブルに置く
                for (int count = 0; count < numberOfHand; count++) {
                    table.putCard(new Card[]{myHand.pickCard(0)});
                }
            }
        }
    }

    /**
     * パス回数を教える.
     *
     * @return パス回数
     */
    public int getPass() {
        return pass;
    }
}
