package org.example;

import java.util.*;


public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
//        int[] list = new int[10];
//        for (int i = 0; i < list.length; i++) {
//            list[i] = rand.nextInt(101);
//            System.out.print(list[i] + " ");
//        }
// a
//        int max=list[0];
//        for (int i = 0; i <list.length; i++) {
//            if(max<list[i])
//                max = list[i];
//        }
//        System.out.println();
//        System.out.println("max is: "+ max);
//        double avarege=0;
//        for (int i = 0; i < list.length ; i++) {
//            avarege+=list[i]/list.length;
//        }
//        System.out.println();
//        System.out.println("AVAREGE " + avarege);
//
//        int[] arr = {72, 89, 3, 5, 7, 8, 3, 21, 64, 2};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tiv = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tiv;
//                }
//            }
//        }
//        for(int i:arr)
//                    System.out.print(i + " ");
//        int[] arr = {72, 89, 3, 5, 7, 8, 3, 21, 64, 2};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tiv = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tiv;
//                }
//            }
//        }
//        for (int i : arr) {
//            System.out.print(i+" ");
//        }
//        int[] arr = {78, 89, 3, 5, 5, 5, 3, 21, 64, 2};
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tiv = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tiv;
//                }
//            }
//        }
//        for (int i:arr) {
//            System.out.print(i+" ");
//
//        }
//        int max_count = 0;
//        int temp_count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                temp_count ++;
//            } else {
//                if (temp_count > max_count) {
//                    max_count = temp_count;
//                    temp_count = 1;
//                } else {
//                    temp_count = 1;
//
//                }
//
//            }
//        }
//            System.out.println();
//        System.out.print(max_count+" ");
//        int[] arr = {78, 89, 3, 5, 5, 5, 3, 21, 64, 2};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        int temp=0;
//        int max=0;
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if(arr[i]==arr[i+1]){
//                temp+=1;
//            }else {
//                if(temp>max){
//                    max=temp;
//                    temp=1;
//                }
//            }
//        }
//        System.out.println(max);
//        int[] arr={2,1,1,3,4,2};
//        int step=0;
//        int temp=0;
//        for (int i = 0; i < arr.length ; i++) {
//            step=arr[i+step];
//            temp+=step;
//            System.out.println(temp);
//            if(temp==0){
//            System.out.println("false");
//            break;}
//            if (temp> arr.length){
//                System.out.println("false");
//                break;}
//        }
//        int count_un = args.length;
//        int count_ch = 0;
//        String[] arr = {"Baarev"};
//        for (int i = 0; i < arr.length(); i++) {
//            if (arr.charAt(i) != arr.charAt(i)) {
//                count_un--;
//            } else {
//                count_ch++;
//            }
//            System.out.println(count_un);
//        }
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("Barev");
//        String s = "Barev", sub = "Barev";
//        int count = 0;
//        int count_0 = 0;
//        if (s.indexOf(sub) != -1) {
//            count++;
//        } else {
//            count_0++;
//        }
//        System.out.println(count_0);
//        ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        System.out.println("Enter number");
//        int num= sc.nextInt();
//        ArrayList<Integer> clone = (ArrayList<Integer>) arr.clone();
//        System.out.print(clone.get(5-num)+" " +clone.get(5-1));
//            arr.add(j);}1

//        System.out.println(clone);
//
//        int[] arr = {5, -1, 36, 72, -1, -1, 13, 4, 7};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int i : arr) {
//            System.out.println(i);
//
//        }
//        int max = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] == -1 || arr[j] == -1)
//                    continue;
//                    if (arr[i] > arr[j]) {
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//            for (int i : arr)
//                System.out.print(i+" ");
//        int value=10, value2=12, value3=34, num1,num2,smallest;
//num1 = (value < value2)?value:value2;
//num2= (value2 < value3)?value2:value3;
//smallest=(num1<num2)?num1:num2;
//        System.out.println(smallest);\
//        String text = "BarevB";
//        ArrayList<Character> myArr = new ArrayList<>();
//        for (int i = 0; i < text.length(); i++) {
//            if (myArr.contains(text.charAt(i))) {
//                continue;
//            } else myArr.add(text.charAt(i));
//        }
//        System.out.println(myArr);
//        System.out.println(myArr.size());
//        String text = "Hello";
//        ArrayList<Character> myArr = new ArrayList<>();
//        for (int i = 0; i < text.length(); i++) {
//            if (myArr.contains(text.charAt(i))) {
//                continue;
//            } else myArr.add(text.charAt(i));
//        }
//        System.out.println(myArr);
//        System.out.println(myArr.size());
//        ArrayList<Integer> num=new ArrayList<>();
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        num.add(5);
//        int step= 3;
//        for (int i= 0; i <step; i++) {
//           int x= num.removeLast();
//            num.addFirst(x);
//        }
//        System.out.println(num);
//        System.out.println("Enter Number");
//        int number = sc.nextInt();
//        ArrayList<Integer>numberArray=new ArrayList<>();
//        int sum=0;
//        for (int i = 1; i <number ; i++) {
//            if(number%i==0){
//                sum+=i;}}
//            if (sum ==number){
//                System.out.println("idealakan");}
//        else System.out.println("sovorakan");
//        System.out.println("Enter Number");
//        int number = sc.nextInt();
//        ArrayList<Integer> numberArray = new ArrayList<>();
//        int sum = 0;
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0)
//            {
//                sum += i;
//            }
//        }
//        if (sum == number) {
//            System.out.println("idealakan");
//        } else System.out.println("Sovorakan");
//        int[]arr={2,54,6,47,2,33,4};
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i; j <arr.length; j++) {
//                if (arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        for (int i:arr) {
//            System.out.print(i+" ");
//        System.out.println("Enter number");
//        int number = sc.nextInt();
//        int sum=0;
//        ArrayList<Integer>numberarray=new ArrayList<>();
//        for (int i = 1; i <number ; i++) {
//            if (number % i == 0){
//                sum+=i;
//            }
//        }
//        if (sum==number) {
//            System.out.println("Idealakan");
//        }else System.out.println("Sovorakan");
//        }
//        System.out.println("Enter number");
//        int num = sc.nextInt();
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num * 2 - 1; j++) {
//                if (j < (num * 2 - 1) / 2 - i || j > (num * 2 - 1) / 2 + i) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("#");
//
//                }
//            }
//            System.out.println();
//        }


//            int[] arr = {32,12,412,12,33,2,5,712,};
//            {
//                for (int i = 0; i < arr.length; i++) {
//                    for (int j = i; j < arr.length; j++) {
//                        if (arr[i] > arr[j]) {
//                            int num = arr[i];
//                            arr[i] = arr[j];
//                            arr[j] = num;
//                        }
//                    }
//                }
//                for (int i : arr) {
//                    System.out.print(i + " ");
//
//                }
//            }
//        int user = 0;
//        int pc = 0;
//        System.out.println("Enter number");
//        int usernum = sc.nextInt();
//        int pcnum = rand.nextInt(1, 5);
//        if (usernum == pcnum) {
//            user += 1;
//            System.out.println("Win user");
//        } else {
//            pc += 1;
//            System.out.println("Win pc number is "+pcnum);
//        }
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put ("A",1);
//        map.put ("B",2);
//        map.put ("C",2);.,?!:
//        HashMap<String,ArrayList> map2 = new HashMap<>();
//        for (int i = 0; i < map.size() ; i++) {
//            if (map.get(i).intValue()==map.get(i+1).intValue()){
//                System.out.println(map);
//            }
// //////////////////////////////////////////////////////////////////////////////
//        HashMap<Integer,String> phone = new HashMap();
//        phone.put( 1,".,?!:");
//        phone.put( 2,"ABC");
//        phone.put( 3,"DEF");
//        phone.put( 4,"GHI");
//        phone.put( 5,"JKL");
//        phone.put( 6,"MNO");
//        phone.put( 7,"PQRS");
//        phone.put( 8,"TUV");
//        phone.put( 9,"WXYZ");
//        phone.put(0, " ");
//        "HELLO"
//        System.out.print("Enter text: ");
//        int num = sc.nextInt();
//        for(int i = 0; i < phone.size() ; i ++){
//            if (phone.containsKey(num))
//            System.out.print(phone.keySet());
//        }
//        ----------------------XNDIR 138-----------------------
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, ".,?!:");
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "PQRS");
        map.put(8, "TUV");
        map.put(9, "WXYZ");
        map.put(0, " ");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int key : map.keySet()) {
                String letter = String.valueOf(Character.toUpperCase(name.charAt(i)));
                if (map.get(key).contains(letter)) {
                    for (int j = 0; j < 2; j++) {

                        System.out.print(key);
                    }
                }
            }
        }
    }
}
