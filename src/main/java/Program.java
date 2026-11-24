import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 19));
        people.add(new Person("Jane", "Doe", 42));
        people.add(new Person("Janeathan", "Doerthy", 38));
        people.add(new Person("Janet", "Doeberman", 49));
        people.add(new Person("Jonathan", "Doecur", 10));
        people.add(new Person("JohnMichael", "Carlo", 14));
        people.add(new Person("Kobo", "Doeberman", 70));
        people.add(new Person("Twuaaa", "Doecur", 84));
        people.add(new Person("Michael", "Carlo", 15));
        people.add(new Person("Quach", "Snowpearlv", 84));


        System.out.println("Enter name to search (first or last)");
        String name = read.nextLine();

        List<Person> matchPerson = new ArrayList<>();
        for (Person person : people) {
            if (person.firstName().equalsIgnoreCase(name) || person.lastName().equalsIgnoreCase(name)) {
                matchPerson.add(person);
            }
        }
        System.out.println("Matching Person To Name Starting...");
        if (matchPerson.isEmpty()) {
            System.out.println("No Match Found");

        } else {
            for (Person match : matchPerson) {
                System.out.println(match.firstName() + " " + match.lastName() + " - Age: " + match.age());
            }
        }

        int totalAge = 0;
        int oldestAge = 0;
        int youngestAge = people.get(0).age();
        people.get(0).age();

        for (Person person : people) {
            int age = person.age();
            totalAge += age;
            if (age > oldestAge) {
                oldestAge = age;
            }
            if (age < youngestAge) {
                youngestAge = age;
            }
        }
            double averageAge = (double) totalAge / people.size();

            System.out.println("Average Age: " + averageAge);
            System.out.println("Youngest Age: " + youngestAge);
            System.out.println("Oldest Age: " + oldestAge);
        }
    }
