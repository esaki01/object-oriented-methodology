package framework.oldmaid;

import java.util.ArrayList;

/**
 * ばば抜きの進行役を表すクラス.
 */
public class Master {
    // プレイヤーのリスト
    private ArrayList players = new ArrayList();

    /**
     * ゲームの準備をする.
     *
     * @param cards トランプを進行役の手札として渡す
     */
    public void prepareGame(Hand cards) {
        System.out.println("【カードを配ります】");

        // トランプをシャッフルする
        cards.shuffle();

        // トランプの枚数を取得する
        int numberOfCards = cards.getNumberOfCards();

        // プレイヤーの人数を取得する
        int numberOfPlayers = players.size();

        for (int index = 0; index < numberOfCards; index++) {
            // カードから一枚引く
            Card card = cards.pickCard();

            // 各プレイヤーに順番にカードを配る
            Player player = (Player) players.get(index % numberOfPlayers);
            player.receiveCard(card);
        }
    }

    /**
     * ゲームを開始する.
     */
    public void startGame() {
        System.out.println("\n【ばば抜きを開始します】");

        for (int count = 0; players.size() > 1; count++) {
            int playerIndex = count % players.size();
            int nextPlayerIndex = (count + 1) % players.size();

            Player player = (Player) players.get(playerIndex);
            Player nextPlayer = (Player) players.get(nextPlayerIndex);

            System.out.println("\n" + player + "さんの番です");
            player.play(nextPlayer);
        }

        System.out.println("【ばば抜きを終了しました】");
    }

    /**
     * 上がりを宣言する.
     *
     * @param winner 上がったプレイヤー
     */
    public void declareWin(Player winner) {
        System.out.println(winner + "さんが上がりました！");

        players.remove(players.indexOf(winner));

        // 残りプレイヤーが１人になった時は敗者を表示する
        if (players.size() == 1) {
            Player loser = (Player) players.get(0);
            System.out.println(loser + "さんの負けです！");
        }
    }

    /**
     * ゲームに参加するプレイヤーを登録する.
     *
     * @param player 参加するプレイヤー
     */
    public void registerPlayer(Player player) {
        players.add(player);
    }
}
