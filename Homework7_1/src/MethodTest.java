import java.util.ArrayList;

public class MethodTest {

    public static <T> int count(ArrayList<T> list) {

        return list.size();
    }


    public static void main(String[] args) {

        ArrayList<String> string = new ArrayList<>();
        ArrayList<Integer> integer = new ArrayList<>();
        ArrayList<Double> doubleObj = new ArrayList<>();

        string.add("CS 151 Object Oriented Design");
        string.add("SJSU");
        string.add("Spring 2021");
        string.add("Professor Yulia Newton");
        string.add("Houman Irani");


        integer.add(7);
        integer.add(13);
        integer.add(20);
        integer.add(32);
        integer.add(77);
        integer.add(101);

        doubleObj.add(7.77);
        doubleObj.add(1.43);
        doubleObj.add(4.345);
        doubleObj.add(101.01);
        doubleObj.add(7.88);
        doubleObj.add(13.31);
        doubleObj.add(119.21);
        doubleObj.add(021.273);

        System.out.println("String List Count: " + count(string));
        System.out.println("Integer List Count: " + count(integer));
        System.out.println("Double List Count: " + count(doubleObj));
    }
}