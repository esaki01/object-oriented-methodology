package designpattern.singleton;

public class Configure {
    // クラスのロード時に１度だけ初期化を実行
    private static Configure instance = new Configure();

    // Configureクラス以外からコンストラクタを呼び出すことを禁止
    private Configure() {
        System.out.println("インスタンスを生成しました。");
    }

    public static Configure getInstance() {
        return instance;
    }
}
