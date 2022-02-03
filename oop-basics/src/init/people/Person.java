package init.people;

import init.account.Account;

public class Person {

    private String name;
    private int age;
    private Account account;

    public Person(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void submitFunds(int funds) {
        this.getAccount().increaseAmount(funds);
    }
}
