import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
//        System.out.println("enter number");
//
//        int a = new Scanner(System.in).nextInt();
//
//        System.out.println("your number " + a);

//        int mass[] = {1,2,4,6,8};
//        for (int i : mass) {
//            System.out.println(i);
//        }
//
//        int arr[] = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("enter number of element with index - " + i);
//            arr[i]= new Scanner(System.in).nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
// вивести 2 мін значення

//        int arr[] = {3,0,1,0,2,4,-1};
//        int min1 =arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if(min1>arr[i]){
//                min1 = arr[i];
//                int a = min1;
//                arr[i]=arr[0];
//                arr[0] = a;
//
//                }
//        }
//        int min2 = arr[1];
//        int in = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]!=min1 && min2>min1){
//                min2 = arr[i];
//                in = i;
//            }
//
//        }
//        System.out.println(min1);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(min2);
//        System.out.println(in);

//int mass[] = {1,2,4};
//        for (int i = 0; i < mass.length; i++) {
//            System.out.println(mass[i]);
//            }
//
//            int a = mass[0];
//        mass[0]= mass[1];
//        mass[1]= a;
//
//
//        System.out.println(Arrays.toString(mass));

// 2 max values
//        int massive[] = {0,0,30,5,0,0};
//        int min = massive[0];
//        int max = massive[0];
//        for (int i = 0; i < massive.length; i++) {
//            if(min>massive[i]){
//                min = massive[i];
//
//            }
//            if(max<massive[i]){
//                max = massive[i];
//            }
//
//        }
//        System.out.println(min);
//        System.out.println(max);


//2 min
//
//        int mass[] = {11,32,5,7,2,12,6};
//        int min = mass[0];
//        for (int i = 1; i < mass.length; i++) {
//            if(min>mass[i]){
//                min = mass[i];
//            }
//
//        }
//        System.out.println(min);

//
//String [][] music = new String[2][3];
//music[0][0] ="rock";
//music[0][1] ="rock1";
//music[0][2] ="rock2";
//
//music[1][0] ="pop";
//music[1][1] ="pop1";
//music[1][2] ="pop2";
//
//
//
//        for (int i = 0; i < music.length; i++) {
//
//            for (int j = 0; j < music[i].length; j++) {
//
//                System.out.println(music[i][j]);
//            }
//        }

//
//int a  = new Scanner(System.in).nextInt();
//        System.out.println(a);


        //factorial
//        System.out.println("input your number");
//int a = new Scanner(System.in).nextInt();
//if(a==0){
//    a=1;
//    System.out.println(a);
//}else {
//    int result;
//    int result2 = 1;
//    int value = a - 1;
//    int mass[] = new int[value];
//    int x = 0;
//
//    for (int i = a; i > 1; i--) {
//        result = (i - 1);
//        mass[x] = result;
//        x++;
//    }
//    for (int i = 0; i < mass.length; i++) {
//        result2 = result2 * mass[i];
//    }
//    System.out.println(a * result2);
//
//}


        //bubble sort
//int mass[] = {1,2,6,12,8,34,0};
//        for (int i = 0; i <mass.length ; i++) {
//            for (int j = i+1; j <mass.length ; j++) {
//                if(mass[i]>mass[j]){
//                    int tmp = mass[i];
//                    mass[i] = mass[j];
//                    mass[j] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(mass));

//int newmass[] = new int[9];
//int a = 0;
//        int mass[][] = {
//                {1,3,5,7,9},
//                {2,4,6,8}};
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j++) {
//
//
//                newmass[a] = mass[i][j];
//                a++;
//            }
//        }
//        System.out.println(Arrays.toString(newmass));
//
//Arrays.sort(newmass);
//        System.out.println(Arrays.toString(newmass));
//        System.out.println(newmass[0] + " " + newmass[7] + " " + newmass[6]);
//        System.out.println(newmass[1] + " " + newmass[8] + " " + newmass[5]);
//        System.out.println(newmass[2] + " " + newmass[3] + " " + newmass[4]);


////fibonacci
//        System.out.println("how many values would you like to see");
//int value = new Scanner(System.in).nextInt();
//
//if(value <= 0){
//    System.out.println("try again");
//}else if(value == 1 ){
//    System.out.println(1);
//}else {
//    int result;
//    int arr[] = new int[value];
//    arr[0] = 1;
//    arr[1] = 1;
//    int x = 0;
//    int y = 1;
//    int z = 2;
//
//    for (int i = 0; i < value - 2; i++) {
//
//        result = arr[x] + arr[y];
//        arr[z] = result;
//        z++;
//        x++;
//        y++;
//    }
//    System.out.println(Arrays.toString(arr));
//}


    }
}

