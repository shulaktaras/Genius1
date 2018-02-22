package Start;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int mass[] = {11,12,-7,2,0,10,1,0};
//
//       int arr[] = {1,5,7,5,4,2,1,5,4,2,1,5,2};
//       int newMass[] = calc(arr);
//        show(newMass);
       //        int min1 = mass[0];
//        int min2 = mass[0];
//        int in1 = 0;
//        int in2 = 0;
//
//        for (int i = 0; i < mass.length; i++) {
//            if (min1 < mass[i]){
//                min1 = mass[i];
//                in1 = i;
//            } else if (min2 < mass[i]){
//                min2 = mass[i];
//                in2 = i;
//            }
//        }

//        System.out.println(min1);
//        System.out.println(min2);
//        System.out.println(in1);
//        System.out.println(in2);

//        int arr[] = max2(mass);
//        System.out.println(Arrays.toString(arr));
//        String result = isPow(7);
//        System.out.println(result);
//        int arr[] = min(mass);
//        System.out.println(Arrays.toString(arr));
//        int arr[] = {1,4,6,9,4,9,10,10,10,10,11};
//        calc(arr);

        int mass[] = {1,1};
        int arr[] = max(mass);
        System.out.println(Arrays.toString(arr));
    }

    public  static int[] max(int[] arr){
        int max1 = arr[0]; int maxIndex1 = 0;
        int max2 = arr[0]; int maxIndex2 = 0;
        int newMass[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]){
                max1 = arr[i];
                maxIndex1 = i;
            }else if (max2 < arr[i]){
                max2 = arr[i];
                maxIndex2 = i;
            }
        }
        newMass[0] = maxIndex1;
        newMass[1] = maxIndex2;
        return newMass;
    }
//        public static void calc(int[] arr){  //знаходить унікальні значення і їх к-сть
//        Arrays.sort(arr);
//
//        int a = 1;
//            for (int i = 0; i < arr.length-1; i++) {
//                if (arr[i] == arr[i+1]){
//                  a++;
//                  if ((i+1) == arr.length-1){
//                      System.out.println(arr[i]+"=>"+a);
//                  }
//                }else if (arr[i] != arr[i+1]){
//                    System.out.println(arr[i] +"=>" +a);
//                    a=1;
//                }
//            }if (arr[arr.length-1]!= arr[arr.length-2]){
//                System.out.println(arr[arr.length-1]+"=>"+a);
//            }
//
//        }
//    public static int[] min(int arr[]){
//        int min1 = arr[0];
//        int min2 = arr[0];
//        int min3 = arr[0];
//        int in1 = 0;
//        int in2 = 0;
//        int in3 = 0;
//        int newMass[] = new int[3];
//        for (int i = 0; i < arr.length; i++) {
//            if (min1 > arr[i]){
//                min1 = arr[i];
//                in1 = i;
//            }else if (min2 > arr[i]){
//                min2 = arr[i];
//                in2 = i;
//            }else if (min3 > arr[i]){
//                min3 = arr[i];
//                in3 = i;
//            }
//        }
//        newMass[0] = in1;
//        newMass[1] = in2;
//        newMass[2] = in3;
//        return newMass;
//    }
//
//    public static String isPow(int a){
//        if( a == 1 || a == 2){
//            return "Yes";
//        }else {
//            return a%2 == 0 ? isPow(a/2) : "No";
//        }
//    }
//
//    public static int[] max2(int mass[]){
//        int max1 = mass[0];
//        int max2 = mass[0];
//        int max1I = 0;
//        int max2I = 0;
//        int newMass[] = new int[2];
//        for (int i = 0; i < mass.length; i++) {
//            if (max1 < mass[i]){
//                max1 = mass[i];
//                max1I = i;
//            }else if (max2 < mass[i]){
//                max2 = mass[i];
//                max2I = i;            }
//        }
//        newMass[0] = max1I;
//        newMass[1] = max2I;
//        return newMass;
//    }

//public static int[] calc(int[] arr) {
//    int one = 1; int counterOne = 0;
//    int four = 4; int counterFour = 0;
//    int five = 5; int counterFive = 0;
//    int seven = 7; int counterSeven = 0;
//
//int newMass[] = new int[4];
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == one) {
//            counterOne++;
//        } else if (arr[i] == four) {
//            counterFour++;
//        } else if (arr[i] == five) {
//            counterFive++;
//        } else if (arr[i] == seven) {
//            counterSeven++;
//        }
//    }
//    newMass[0] = counterOne;
//    newMass[1] = counterFour;
//    newMass[2] = counterFive;
//    newMass[3] = counterSeven;
//    return newMass;
// }
// public static void show(int arr[]){
//     System.out.println("1=>" + arr[0] + " " +
//                        "4=>" + arr[1] + " " +
//                        "5=>" + arr[2] + " " +
//                        "7=>" + arr[3]);
// }
}
