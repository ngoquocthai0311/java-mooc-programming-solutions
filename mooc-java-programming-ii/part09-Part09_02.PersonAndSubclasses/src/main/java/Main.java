import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here    
//        ArrayList<Person> persons = new ArrayList<Person>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//
//        printPersons(persons);
        Counter counter = new Counter();
        Counter superCounter = new SuperCounter();
        int number = 3;
        number = superCounter.subtractFromNumber(number);
        number = superCounter.subtractFromNumber(number);
        number = counter.addToNumber(number);
        System.out.println(number);
        
    }
    public static void printPersons(ArrayList<Person> persons) {
        for (Person each: persons) {
            System.out.println(each);
        }
    }
}
