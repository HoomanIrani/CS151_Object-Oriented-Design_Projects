/**
 *
 * @author Houman Irano
 * @version 1.02
 * @since 05-15-2021
 *
 * Assignment 9    --------->   Reflection
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {


        Method[] publicMethod_person = Class.forName("Person").getDeclaredMethods();
        System.out.println("Display all declared methods of Person Class:");

        for (Method m : publicMethod_person) {
            String methodName = m.getName();
            Class[] parameters = m.getParameterTypes();

            if (parameters.length == 0)
                System.out.println(m + " has 0 parameters");
            else {
                System.out.println(m + " has " + parameters.length + " parameter(s) of the following types:");
            }

            for (Class c : parameters)
                System.out.println("" + c.getName());
        }


        Method[] publicMethod_address = Class.forName("Address").getMethods();
        System.out.println("Display all methods of Address Class: ");

        for (Method m : publicMethod_address) {
            String methodName = m.getName();
            Class[] parameters = m.getParameterTypes();
            if (parameters.length == 0)
                System.out.println(m + " has 0 parameters");
            else {
                System.out.println(m + " has " + parameters.length + " parameter(s) of the following types:");
            }
            for (Class p : parameters)
                System.out.println("" + p.getName());
        }

        System.out.println("\n************...........************\n");


        Field[] Field_person = Class.forName("Address").getDeclaredFields();
        System.out.println("Display all Declared fields of Address class:");
        for (Field s : Field_person)
            System.out.println(s.getName());
        System.out.println("\nField names and types:");
        for (Field s : Field_person)
            System.out.println(s.toString());

        System.out.println("\n************...........************\n");


        try {
            Constructor<Address> addressConstructor = Address.class.getConstructor(int.class, String.class,
                    String.class, String.class, String.class);

            Constructor<Person> personConstructor = Person.class.getConstructor(String.class, String.class, int.class,
                    String.class, Address.class);

            Address Address1 = addressConstructor.newInstance(1, "10189 Viceroy Ct", "Cupertino", "CA", "95014");
            Person personInstance1 = personConstructor.newInstance("H", "Houman", 27, "123456789", Address1);
            Address Address2 = addressConstructor.newInstance(2, "550 E Weddell Dr", "Sunnyvale", "CA", "94089");
            Person personInstance2 = personConstructor.newInstance("A", "Aryan", 24, "456456734", Address2);
            Address Address3 = addressConstructor.newInstance(3, "325 Kirschner Ln", "Placentia", "CA", "92870");
            Person personInstance3 = Person.class.newInstance();

            personInstance3.setFirstName("Hamid");
            personInstance3.setLastName("Irani");
            personInstance3.setAge(27);
            personInstance3.setSsn("123456789");
            personInstance3.setAddress(Address3);


            System.out.println("Information of 3 instance person:");
            System.out.println("1st Person: " + personInstance1.toString());
            System.out.println("2nd Person: " + personInstance2.toString());
            System.out.println("3rd Person: " + personInstance3.toString());



            Class p = personInstance1.getClass();


            try {

                Class personClass = personInstance1.getClass();
                Method setFirstNameMethod = personClass.getDeclaredMethod("setFirstName", String.class);
                setFirstNameMethod.invoke(personInstance1, "Hoomee");
                Method setLastNameMethod = personClass.getDeclaredMethod("setLastName", String.class);
                setLastNameMethod.invoke(personInstance1, "Klienman");
                Method setAgeNameMethod = personClass.getDeclaredMethod("setAge", int.class);
                setAgeNameMethod.invoke(personInstance1, 72);

            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {

                System.out.println("Attention: Problem Invoking the Method");

            }


            System.out.println("\n1st Person: " + personInstance1.toString());


        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException e) {
            
            e.printStackTrace();
        }


    }

}