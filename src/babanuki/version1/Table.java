package babanuki.version1;

import java.util.ArrayList;

/**
 * テーブルを表すクラス.
 */
public class Table {
    // 捨てられたカードを保持しておくためのリスト
    private ArrayList disposedCards = new ArrayList();

    /**
     * カードを捨てる.
     *
     * @param card 捨てるカードの配列
     */
    public void disposeCard(Card card[]) {
        for (int index = 0; index < card.length; index++) {
            System.out.print(card[index] + " ");
        }

        System.out.println("を捨てました");

        disposedCards.add(card);
    }
}
