package designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        Configure configure1 = Configure.getInstance();
        Configure configure2 = Configure.getInstance();

        if (configure1 == configure2) {
            System.out.println("同じインスタンスです。");
        } else {
            System.out.println("同じインスタンスではありません。");
        }

        System.out.println("End.");
    }
}
