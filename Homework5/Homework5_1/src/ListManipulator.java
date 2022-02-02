/**
 *
 * @author Houman Irani
 * @version 1.00
 * @since 03-19-2021
 *<p>
 * This application uses 3 methods to sort data in different ways.
 * </p>
 */

import java.util.ArrayList;
import java.util.Collections;


public class ListManipulator {

    public static ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (Integer num : myLst) {
            if (!newList.contains(num)) {
                newList.add(num);
            }
        }


        if (ascending == true) {

            Collections.sort(newList);
        }

        else {

            Collections.sort(newList, Collections.reverseOrder());
        }

        return newList;
    }



    public static ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {

        System.out.println(myLst);

        ArrayList<Integer> list = new ArrayList<Integer>();


        for (Integer num : myLst) {
            list.add(num);
        }

        Collections.sort(list);

        int smallest = list.get(0);
        int largest = list.get(myLst.size() - 1);


        for (int i = 0; i < myLst.size(); i++) {

            if (myLst.get(i) == smallest) {

                smallest = i;
                break;
            }
        }


        for (int j = 0; j < myLst.size(); j++) {
            if (myLst.get(j) == largest) {

                largest = j;
                break;
            }
        }


        Collections.swap(myLst, smallest, largest);

        return myLst;
    }



    public static void table(ArrayList<Integer> myLst) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();


        for (Integer num : myLst) {
            if (!l1.contains(num))
                l1.add(num);
        }


        Collections.sort(l1);

        int repeat;


        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " occurs ");
            repeat = l1.get(i);
            System.out.println(Collections.frequency(myLst, repeat) + " times");
        }

    }

}
