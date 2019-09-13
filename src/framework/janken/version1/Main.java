package framework.janken.version1;

/**
 * じゃんけんプログラム.
 */
public class Main {
    /* ジャンケンの手を表す定数. */
    public static final int STONE = 0; // グー
    public static final int SCISSORS = 1; // チョキ
    public static final int PAPER = 2; // パー

    public static void main(String[] args) {
        // プレイヤー１の勝ち数.
        int player1WinCount = 0;

        // プレイヤー２の勝ち数
        int player2WinCount = 0;

        // プレイヤー１が出す手
        int player1Hand = 0;

        // プレイヤー２が出す手
        int player2Hand = 0;

        // ジャンケンの手を決めるのに使用する乱数
        double randomNum;

        System.out.println("【ジャンケン開始】\n");

        for (int cnt = 0; cnt < 3; cnt++) {
            System.out.println("【" + (cnt + 1) + "回戦目】");

            // プレイヤー１の手
            randomNum = Math.random() * 3;

            if (randomNum < 1) {
                player1Hand = STONE;
                System.out.print("グー");
            } else if (randomNum < 2) {
                player1Hand = SCISSORS;
                System.out.print("チョキ");
            } else if (randomNum < 3) {
                player1Hand = PAPER;
                System.out.print("パー");
            }

            System.out.print(" vs. ");

            // プレイヤー２の手
            randomNum = Math.random() * 3;

            if (randomNum < 1) {
                player2Hand = STONE;
                System.out.print("グー");
            } else if (randomNum < 2) {
                player2Hand = SCISSORS;
                System.out.print("チョキ");
            } else if (randomNum < 3) {
                player2Hand = PAPER;
                System.out.print("パー");
            }

            // プレイヤー１が勝つ場合
            if ((player1Hand == STONE && player2Hand == SCISSORS)
                    || (player1Hand == SCISSORS && player2Hand == PAPER)
                    || (player1Hand == PAPER && player2Hand == STONE)) {
                System.out.println("\nプレイヤー１が勝ちました！\n");

                player1WinCount++;
            }
            // プレイヤー２が勝つ場合
            else if ((player1Hand == STONE && player2Hand == PAPER)
                    || (player1Hand == SCISSORS && player2Hand == STONE)
                    || (player1Hand == PAPER && player2Hand == SCISSORS)) {
                System.out.println("\nプレイヤー２が勝ちました！\n");

                player2WinCount++;
            }
            // 引き分けの場合
            else {
                System.out.println("\n引き分けです！\n");
            }
        }

        System.out.println("【ジャンケン終了】\n");

        if (player1WinCount > player2WinCount) {
            System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー１の勝ちです！\n");
        } else if (player1WinCount < player2WinCount) {
            System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー２の勝ちです！\n");
        } else if (player1WinCount == player2WinCount) {
            System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです！\n");
        }
    }
}
