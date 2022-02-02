/**
 * @author Houman Irani
 * @version 1.0
 * @since 03-24-2021
 *
 *<p>
 *     This Application has Person class which has all the attributes of a person.
 *     Then sort Person instances in PersonTest.
 *</p>
 */
import java.util.*;


public class PersonTest {

    public static void main(String[] args) {

        /**
         * Main ArrayList of Person class.
         */
        List<Person> person = new ArrayList<>();
        /**
         * We add new data into our ArrayList.
         */
        person.add(new Person("Joe", "Smith", 40));
        person.add(new Person("Amy", "Gold", 32));
        person.add(new Person("Tony", "Stork", 21));
        person.add(new Person("Sean", "Irish", 24));
        person.add(new Person("Tina", "Brock", 28));
        person.add(new Person("Lenny", "Hep", 18));

        /**
         * Comparator method to sort Person data based on age.
         */
        Comparator<Person> myComparator1 = new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                return p1.getAge() - p2.getAge();
            }
        };

        /**
         * Converting our original ArrayList to TreeSet to sort them.
         */
        TreeSet<Person> person1 = new TreeSet<>(myComparator1);
        person1.addAll(person);

        /**
         * Iterator interface to print out data.
         */
        Iterator myIterator1 = person1.iterator();
        while (myIterator1.hasNext()) {

            System.out.println(myIterator1.next());
        }




        System.out.println("");
        /**
         * Comparator method to sort Person data based on age.
         */
        Comparator<Person> myComparator2 = new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                return p2.getAge() - p1.getAge();
            }
        };

        /**
         * Converting our original ArrayList to TreeSet to sort them.
         */
        TreeSet<Person> person2 = new TreeSet<>(myComparator2);
        person2.addAll(person);


        /**
         * Iterator interface to print out data.
         */
        Iterator myIterator2 = person2.iterator();
        while(myIterator2.hasNext()) {

            System.out.println(myIterator2.next());
        }


        System.out.println("");
        /**
         * Comparator method to sort Person data based on length of their first Name.
         */
        Comparator<Person> myComparator3 = new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                return p1.getFirstName().length() - p2.getFirstName().length();
            }
        };

        /**
         * Converting our original ArrayList to TreeSet to sort them.
         */
        TreeSet<Person> person3 = new TreeSet<>(myComparator3);
        person3.addAll(person);

        /**
         * Iterator interface to print out data.
         */
        Iterator myIterator3 = person3.iterator();
        while (myIterator3.hasNext()) {

            System.out.println(myIterator3.next());
        }



        System.out.println("");
        /**
         * Comparator method to sort Person data based on length of their first name.
         */
        Comparator<Person> myComparator4 = new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                return p2.getFirstName().length() - p1.getFirstName().length();
            }
        };

        /**
         * Converting our original ArrayList to TreeSet to sort them.
         */
        TreeSet<Person> person4 = new TreeSet<>(myComparator4);
        person4.addAll(person);


        /**
         * Iterator interface to print out data.
         */
        Iterator myIterator4 = person4.iterator();
        while (myIterator4.hasNext()) {

            System.out.println(myIterator4.next());
        }



        System.out.println("");
        /**
         * Comparator method to sort Person data based on length of their last name.
         */
        Comparator<Person> myComparator5 = new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                return p1.getLastName().length() - p2.getLastName().length();
            }
        };

        /**
         * Converting our original ArrayList to TreeSet to sort them.
         */
        TreeSet<Person> person5 = new TreeSet<>(myComparator5);
        person5.addAll(person);


        /**
         * Iterator interface to print out data.
         */
        Iterator myIterator5 = person5.iterator();
        while (myIterator5.hasNext()) {

            System.out.println(myIterator5.next());
        }



        System.out.println("");
        /**
         * Comparator method to sort Person data based on length of their last name.
         */
        Comparator<Person> myComparator6 = new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                return p2.getLastName().length() - p1.getLastName().length();
            }
        };

        /**
         * Converting our original ArrayList to TreeSet to sort them.
         */
        TreeSet<Person> person6 = new TreeSet<>(myComparator6);
        person6.addAll(person);


        /**
         * Iterator interface to print out data.
         */
        Iterator myIterator6 = person6.iterator();
        while (myIterator6.hasNext()) {

            System.out.println(myIterator6.next());
        }



    }

}