package designpattern.command;

public class SpecialDiscountCommand extends Command {
    @Override
    public void execute() {
        double amount = book.getAmount();
        book.setAmount(amount * 0.7);
    }
}
