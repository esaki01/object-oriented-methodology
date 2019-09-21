package designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new TopPageBuilder(); // 別のページを作成する場合はこの実装クラスを変更すれば良い
        Director director = new Director(builder);

        Page page = director.construct();
    }
}
