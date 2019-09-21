package designpattern.strategy;


public class Main {
    public static void main(String[] args) {
        Book comic = new Book(500);
        Book technicalBook = new Book(2500);

        Strategy discountStrategy = new DiscountStrategy();
        Strategy specialDiscountStrategy = new SpecialDiscountStrategy();

        Shop shop = new Shop(discountStrategy);
        shop.shell(comic);
        System.out.println("割引後金額は、" + comic.getAmount() + "円");

        shop.setStrategy(specialDiscountStrategy);
        shop.shell(technicalBook);
        System.out.println("割引後金額は、" + technicalBook.getAmount() + "円");
    }
}
