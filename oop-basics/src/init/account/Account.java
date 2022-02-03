package init.account;

public class Account {

    private int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public void increaseAmount(int amount) {
        this.amount = amount;
    }
}
