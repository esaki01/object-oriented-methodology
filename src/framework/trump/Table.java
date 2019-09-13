package framework.trump;

/**
 * テーブルを表すインターフェース.
 */
public interface Table {
    /**
     * カードを置く.
     *
     * @param card カード
     */
    public void putCard(Card[] card);

    /**
     * カードを見る.
     *
     * @return テーブルに置かれたカードを表す配列
     */
    public Card[][] getCards();
}

