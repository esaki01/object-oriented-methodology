package framework.oldmaid;

/**
 * トランプのカードを表すクラス.
 */
public class Card {
    /* ジョーカーを表す定数. */
    public static final int JOKER = 0;

    /* スートを表す定数. */
    public static final int SUIT_SPADE = 1; // スペード
    public static final int SUIT_DIAMOND = 2; // ダイヤ
    public static final int SUIT_CLUB = 3; // クラブ
    public static final int SUIT_HEART = 4; // ハート

    // カードのスート
    private int suit;

    // カードの数字
    private int number;

    /**
     * コンストラクタ.
     *
     * @param suit   スート
     * @param number 数字 (0の場合はジョーカーとして扱う)
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
     * カードを文字列で表現する.
     *
     * @return カードの文字表現
     */
    public String toString() {
        StringBuffer string = new StringBuffer();

        if (number > 0) {
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
        } else {
            string.append("JK");
        }

        return string.toString();
    }
}
