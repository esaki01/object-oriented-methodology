package designpattern.templatemethod;

/**
 * テンプレートメソッド.
 * 実際に何をするのかは、open, print, closeを実装するサブクラスに任される.
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() { // finalをつけることでサブクラスがテンプレートメソッドをOverrideすることを禁止している
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
