import com.example.books.Book;
import com.example.books.Journal;
import com.example.books.model.LordOfTheRings;
import com.example.books.blueprint.Printable;
import com.example.solid.open_closed.Animal;
import com.example.solid.open_closed.Lion;
import com.example.solid.open_closed.Shinshilla;
import com.example.solid.open_closed.Squirrel;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Printable book = new Book("Мартин", "Песнь льда и пламени");
        Printable journal = new Journal("Penthouse");
        Printable book1 = new LordOfTheRings("John Tolkien", "Return of the king");
        Animal[] animals = new Animal[]{new Lion("Lion"),new Shinshilla("mouse"), new Squirrel("Kapibara") , new Lion("Eagle")};
        List<Animal> animalList = Arrays.asList(animals);

        book.print();
        journal.print();
        book1.print();
        Printable.read();

        System.out.println("SOLID INVOCATIONS EXAMPLES");

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }


        for (Animal a : animalList) {
            a.legCount();
        }




    }
}
