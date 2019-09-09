package objectoriented.janken.version3.tactics.impl;

import objectoriented.janken.version3.Player;
import objectoriented.janken.version3.tactics.Tactics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 標準入力によりジャンケンの手をユーザに聞く戦略クラス。
 */
public class AskTactics implements Tactics {
    /**
     * 戦略を読み、ジャンケンの手を得る.
     * グー・チョキ・パーのいずれかをPlayerクラスに定義された以下の定数で返す.
     * Player.STONE    ・・・ グー
     * Player.SCISSORS ・・・ チョキ
     * Player.PAPER    ・・・ パー
     *
     * @return ジャンケンの手
     */
    public int readTactics() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nジャンケンの手を入力して下さい。");
        System.out.println("0: グー");
        System.out.println("1: チョキ");
        System.out.println("2: パー\n");
        System.out.print("? ");

        int hand = 0;

        while (true) {
            try {
                String inputStr = br.readLine();
                hand = Integer.parseInt(inputStr);

                if (hand == Player.STONE
                        || hand == Player.SCISSORS
                        || hand == Player.PAPER) {
                    break;
                } else {
                    System.out.println("入力が正しくありません。再度入力して下さい。");
                    System.out.print("? ");
                }
            } catch (Exception ex) {
                System.out.println("入力が正しくありません。再度入力して下さい。");
                System.out.print("? ");
            }
        }

        return hand;
    }
}

