package sevens.trump;

/**
 * トランプのカードを表すクラス.
 */
public class Card {
    /* スートを表す定数. */
    public static final int SUIT_SPADE = 1; // スペード
    public static final int SUIT_DIAMOND = 2; // ダイヤ
    public static final int SUIT_CLUB = 3; // クラブ
    public static final int SUIT_HEART = 4; // ハート

    /* スートの数. */
    public static final int SUIT_NUM = 4;

    /* 値の数. */
    public static final int CARD_NUM = 13;

    // カードのスート
    protected int suit;

    // カードの数字
    protected int number;

    /**
     * コンストラクタ.
     *
     * @param suit   スート
     * @param number 数字
     */
    public Card(int suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    /**
     * 数字を見る.
     *
     * @return 数字
     */
    public int getNumber() {
        return number;
    }

    /**
     * スートを見る.
     *
     * @return スート
     */
    public int getSuit() {
        return suit;
    }

    /**
     * カードを文字列で表現する.
     *
     * @return カードの文字表現
     */
    public String toString() {
        StringBuffer string = new StringBuffer();

        switch (suit) {
            case SUIT_SPADE:
                string.append("S");
                break;

            case SUIT_DIAMOND:
                string.append("D");
                break;

            case SUIT_CLUB:
                string.append("C");
                break;

            case SUIT_HEART:
                string.append("H");
                break;

            default:
                break;
        }

        switch (number) {
            case 1:
                string.append("A");
                break;

            case 10:
                string.append("T");
                break;

            case 11:
                string.append("J");
                break;

            case 12:
                string.append("Q");
                break;

            case 13:
                string.append("K");
                break;

            default:
                string.append(number);
                break;
        }

        return string.toString();
    }
}
