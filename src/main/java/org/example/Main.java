package org.example;

import javax.naming.InsufficientResourcesException;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
//        ----------------------------------------------46 shaxmat-----------------------------------
//        System.out.println("Enter letter");
//        String letter = sc.next();
//        System.out.println("Enter number");
//        int number = sc.nextInt();
//        ArrayList<Character> letters = new ArrayList<>();
//        letters.add('0');
//        for (int i = 97; i <104 ; i++) {
//            letters.add((char)i);}
//        int num = 0;
//        for (int i = 0; i < letter.length(); i++) {
//            num = (letters.indexOf(letter.charAt(i)));
//        }
//        if (num % 2 == 0 && number % 2 == 0) {
//            System.out.println("black");
//        } else if (number % 2 != 0 && num % 2 == 0) {
//            System.out.println("white");
//        } else {
//            System.out.println("black");
//        }
//        -------------------------------------63 mijin tvabanakan---------------------------------------------
//        ArrayList<Integer> list = new ArrayList<>();
//        int number=0;
//        while (true) {
//            System.out.println("Enter number");
//            int num = sc.nextInt();
//            if (num == 0) {
//                break;
//            } else {
//                list.add(num);
//                number+=num;}}
//        System.out.println(number/list.size());
//        ---------------------------------69 gazananoci tomser--------------------------------------
//        System.out.println("enter 0 for end");
//        double sum = 0;
//        while (true) {
//            System.out.println("Enter age");
//            int age = sc.nextInt();
//            if (age == 0) {
//                break;}
//            if (age == 1 && age == 2) {
//                    sum += 0;}
//            if (age >= 3 && age <= 12) {
//                sum += 14;
//            }
//            if (age >= 13 && age <= 65) {
//                sum += 23;
//            }
//            if (age > 65) {
//                sum += 18;
//            }
//        }
//        System.out.println(sum+"$");
//        ------------------------------72 fizz buzz------------------------------------------
//        for (int i = 1; i < 101; i++) {
//            System.out.println(i);
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("fizz-buzz");}
//            else if (i % 3 == 0) {
//                System.out.println("fizz");}
//               else  if (i % 5 == 0) {
//                    System.out.println("buzz");}
//                    }
//        ---------------------------------75 palindrom------------------------
//        System.out.println("enter text");
//        String str = sc.next();
//        boolean palindrome = false;
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = str.length() - 1; j > -1; j--) {
//                if (str.charAt(j) == str.charAt(i)) {
//                    palindrome = (true);
//                } else palindrome = (false);
//            }
//        }
//        if (palindrome = true) {
//            System.out.println("its palindrom");
//        } else {
//            System.out.println("not palindrom");
//        }
//        ----------------------------nuyn 75 rekursiyayov---------------------------------------
//        System.out.println("Enter text");
//        String s = sc.next();
//        System.out.println(name(s)?"palindrom e":"palindrom che");
//    }
//    private static boolean name(String s) {
//        if (s.length() == 1 || s.length() == 0)
//            return true;
//        if (s.charAt(0) == s.charAt(s.length()-1))
//        return name(s.substring(+1, s.length() - 1));
//        return false;
//        ------------------------------82 -----------------------------
//        System.out.println("Enter number");
//        int num = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        while (true) {
//            if (num == 0) {
//                break;
//            } else {
//                list.add(num / 2);
//                num=num/2;
//            }
//        }
//        ArrayList<Integer>list2=new ArrayList<>();
//        for (int i = 0; i <list.size() ; i++) {
//            list2.add(list.get(i)%2);
//        }
//        System.out.println(list2);
//        ----------------------------------138 mi qich xaxud-----------------------------------------
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, ".,?!:");
//        map.put(2, "ABC");
//        map.put(3, "DEF");
//        map.put(4, "GHI");
//        map.put(5, "JKL");
//        map.put(6, "MNO");
//        map.put(7, "PQRS");
//        map.put(8, "TUV");
//        map.put(9, "WXYZ");
//        map.put(0, " ");
//        System.out.print("Enter name: ");
//        String name = sc.nextLine();
//        for (int i = 0; i < name.length(); i++) {
//            for (int key : map.keySet()) {
//                String letter = String.valueOf(Character.toUpperCase(name.charAt(i)));
//                if (map.get(key).contains(letter)) {
//                    for (int j = 0; j <i+1; j++) {
//                        System.out.print(key);
//
//                    }
//                }
//            }
//        }
//        -----------------------------------145 Erudit-----------------------------------------
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "AEILNORSTU");
//        map.put(2, "DG");
//        map.put(3, "BCMP");
//        map.put(4, "FHVWY");
//        map.put(5, "K");
//        map.put(8, "JX");
//        map.put(10, "QZ");
//        System.out.println("Enter text");
//        String text = sc.next();
//        int num=0;
//        for (int i = 0; i < text.length(); i++) {
//            for (int key : map.keySet()) {
//                String letter = String.valueOf(Character.toUpperCase(text.charAt(i)));
//                if (map.get(key).contains(letter)) {
//                    for (int j = 0; j < 1; j++) {
//                        num+=key;
//                    }
//                }
//
//            }
//        }
//        System.out.println(num);
//        --------------------------------173 summa----------------------------------------
//        System.out.println(rekurs(0));
//    }
//    static int rekurs(int sum) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int temp = sc.nextInt();
//        if (temp != 0) {
//            return rekurs(sum += temp );
//        } else {
//            return sum;
//        }
//    }
//}
//---------------------------------------------------------------------------------------------
    }
}