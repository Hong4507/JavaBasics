package me.hong.test;

import javax.swing.*;
import java.sql.Struct;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Primitive data types
        int interger1 = 1;
        double double1 = 0.5;
        char character1 = 'L';
        boolean boolean1 = true;
        float float1 = 0.13f;

        //Primitive data type wrapper classes (Non-primitive data types)
        String string = "hahahahaha";
        Integer interger2 = 1;
        Double double2 = 0.5;
        Character character2 = ';';
        Boolean boolean2 = false;

        //Operators
        /*
          > greater than
          < smaller than
          >= greater than/equal to
          <= smallen than/equal to
          = Equals (Use when assigning a variable to a value.)
          == Equals to (Use when comparing.)
          != Not equal to
          && and
          || or
         */

        //if statement
        boolean Boolean = false;

        if (Boolean) {

            //if(Boolean = true) == if(Boolean)
            System.out.println("The boolean is true.");

        } else {

            System.out.println("The boolean is false.");

        }

        //switch-case
        int a = 5;
        switch (a) {
            case 3:
                System.out.println("small");
                break;
            case 5:
                System.out.println("medium");
                break;
            case 7:
                System.out.println("big");
                break;
            case 9:
                System.out.println("hmm");
        }

        //For loop
        for (int i = 6; i > 3; i--) {

            System.out.println("for" + i);

            if (i == 4) {
                System.out.println("The for loop ends here.");

            }

        }

        //While loop
        int w = 1;
        while (w < 4) {
            System.out.println("The while loop runs " + w + " times.");
            w++;
        }

        //Null & Try-Catch
        //Put the exceptions you're waiting for in the small bracket.
        String Null = "null";

        try {

            System.out.println(Null.substring(0));
            System.out.println("Damn the try-catch works!");

        } catch (NullPointerException n) {

            System.out.println("There is something wrong! Check the error messages.");
            n.printStackTrace();

        }

        //Instance of SecondClass
        SecondClass secondClass = new SecondClass("The constructor of SecondClass is working!");
        secondClass.asdasd();


        //Array
        String[] array = new String[]{"What", "The", "Fuck"};
        int[] array1 = new int[]{1, 100};
        char[] char2 = new char[]{'h', 'i'};
        System.out.println(array[0]);

        //if u want to print the whole array, this will be a good way.
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }

        //I'm not fully understand about this.
        //You can't do this with HashMap bcz you'll need the key to access.
        //check this: https://www.twblogs.net/a/5d1765c7bd9eee1ede055d48
        for (String s : array) {

            System.out.println(s);

        }

        //ArrayList
        //Since List only accept objects, you cannot type primitive types (int, char, double...)
        //You can use primitive type wrapper classes instead (Interger, Character, Double...)
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

        //LinkedList
        List<Integer> llist = new LinkedList<Integer>();


        //HashMap (Linked HashMap??)
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alpha");
        map.put(2, "Beta");
        System.out.println(map.get(0));

        for (int i = 0; i < map.size(); i++) {

            System.out.println("key: " + map.keySet().toArray()[i]);
            System.out.println("Value: " + map.values().toArray()[i]);


        }

        //LinkedHashMap
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();


        print("yaaaaaaa");
        qmarkTest();


    }

    private static void print(String print) {
        JFrame frame = new JFrame(print);
        JLabel label = new JLabel(print, JLabel.CENTER);
        frame.add(label);
        frame.setSize(500, 300);
        frame.setVisible(true);

    }

    private static void qmarkTest() {
        boolean testtest = false;
        String test = testtest ? "True" : "False";
        System.out.println(test);
    }
}
