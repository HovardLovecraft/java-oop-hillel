package init.run;

import init.account.Account;
import init.devices.Phone;
import init.people.Person;

public class Init {
    public static void main(String[] args) {

//        Phone samsung = new Phone();
//        Phone xiaomi = new Phone("+38(000)000-00-11", "redmi", 100.0);
//        Phone iPhone = new Phone("+38(111)111-11-11", "iPhone12");
//
//        samsung.setPhoneNumber("+38(000)000-000-0");
//
//
//        System.out.println(samsung.getPhoneNumber());
//        System.out.println(xiaomi.getPhoneNumber());
//        System.out.println(iPhone.getPhoneNumber());
//
//        System.out.println("---------------------------------------");
//
//        samsung.receiveCall("Alex");
//        xiaomi.receiveCall("Andrew");
//        iPhone.receiveCall("John");
//
//        System.out.println("---------------------------------------");
//
//
//        System.out.println("SAMSUNG DETAILS");
//        System.out.println(samsung.getPhoneNumber());
//        System.out.println(samsung.getModel());
//        System.out.println(samsung.getWeight());
//
//        System.out.println("XIAOMI DETAILS");
//        System.out.println(xiaomi.getPhoneNumber());
//        System.out.println(xiaomi.getModel());
//        System.out.println(xiaomi.getWeight());
//
//
//        System.out.println("IPHONE DETAILS");
//        System.out.println(iPhone.getPhoneNumber());
//        System.out.println(iPhone.getModel());
//        System.out.println(iPhone.getWeight());
//
//        System.out.println("---------------------------------------");
//
//        iPhone.receiveCall("Alex", samsung.getPhoneNumber());
//
//        System.out.println("---------------------------------------");
//
//        iPhone.sendMessage(samsung.getPhoneNumber(), xiaomi.getPhoneNumber(), iPhone.getPhoneNumber());
//        iPhone.sendMessage(samsung.getPhoneNumber());


        Account personsAccount = new Account(0);

        Person person = new Person("Name", 30, personsAccount);

        System.out.println(person.getAccount().getAmount());

        person.submitFunds(200);

        System.out.println(personsAccount.getAmount());

        System.out.println(person.getAccount().getAmount());

    }
}
