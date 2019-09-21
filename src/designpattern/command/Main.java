package designpattern.command;

public class Main {
    public static void main(String[] args) {
        Book comic = new Book(500);
        Book technicalBook = new Book(2500);

        Command discountCommand = new DiscountCommand();
        Command specialDiscountCommand = new SpecialDiscountCommand();

        // コミックに割引を適用
        discountCommand.setBook(comic);
        discountCommand.execute();
        System.out.println("割引後金額は、" + comic.getAmount() + "円");

        // 技術書に割引を適用
        discountCommand.setBook(technicalBook);
        discountCommand.execute();
        System.out.println("割引後金額は、" + technicalBook.getAmount() + "円");

        // 技術書にさらに特別割引を適用
        specialDiscountCommand.setBook(technicalBook);
        specialDiscountCommand.execute();
        System.out.println("割引後金額は、" + technicalBook.getAmount() + "円");
    }
}
