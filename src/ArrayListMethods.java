import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {

//    /*
    public static ArrayList<Integer> numberList() {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
       numberList.add(0);
       System.out.println(numberList);
       numberList.add(-5);
       System.out.println(numberList);
       numberList.add(7);
       System.out.println(numberList);
        numberList.add(12);
        System.out.println(numberList);
        numberList.add(-1);
        System.out.println(numberList);
        numberList.add(2, 10);
        numberList.set(1, 9);
        numberList.remove(4);

       return numberList;


    }



    public static ArrayList<Double> firstAndLast() {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        System.out.print("Please enter a list of decimal numbers one at a time and when you are finished please enter '0'");
        Double first = scan.nextDouble();
        if (first == 0) {
            ArrayList<Double> firstAndLast = new ArrayList<Double>();
            firstAndLast.add(0.0);
            System.out.println(firstAndLast);
            firstAndLast.add(0.0);
            System.out.println(firstAndLast);
            firstAndLast.add(0.0);
            System.out.println(firstAndLast);
            return firstAndLast;
        }
        else {
            total++;
            System.out.print("Please enter a list of decimal numbers one at a time and when you are finished please enter '0'");
            Double last = scan.nextDouble();
            if (last == 0) {
                ArrayList<Double> firstAndLast = new ArrayList<Double>();
                firstAndLast.add(total);
                System.out.println(firstAndLast);
                firstAndLast.add(first);
                System.out.println(firstAndLast);
                firstAndLast.add(first);
                System.out.println(firstAndLast);
                return firstAndLast;
            } else {
                total++;
                Double last1 = last;
                while (last != 0) {
                    last1 = last;
                    System.out.print("Please enter a list of decimal numbers one at a time and when you are finished please enter '0'");
                    last = scan.nextDouble();
                    total++;
                }
                total--;
                ArrayList<Double> firstAndLast = new ArrayList<Double>();
                firstAndLast.add(total);
                System.out.println(firstAndLast);
                firstAndLast.add(first);
                System.out.println(firstAndLast);
                firstAndLast.add(last1);
                System.out.println(firstAndLast);

                return firstAndLast;
            }
        }
    }
//
//
//
//    public static boolean double23(ArrayList<Integer> nums) {
//
//
//    }
//
//
//
//
//    public static boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {


   // }


}
