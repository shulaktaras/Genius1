package Practic;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Popeluowka popeluowka = new Popeluowka("Zaia",18,36);
//        Popeluowka popeluowka2 = new Popeluowka("Nastia",22,34);
//        Popeluowka popeluowka3 = new Popeluowka("Marta",24,35);
//
//        int arr[] = new int[3];
//        arr[0] = popeluowka.sizeLeg;
//        arr[1] = popeluowka2.sizeLeg;
//        arr[2] = popeluowka3.sizeLeg;

//        Princ princ = new Princ(34);
//        Princ princ2 = new Princ(35);
//        Princ princ3 = new Princ(36);
//
//        Princ mass2[] = new Princ[3];
//        mass2[0]=princ;
//        mass2[1]=princ2;
//        mass2[2]=princ3;
//
//        Popeluowka mass[] = new Popeluowka[3];
//
//        mass[0]=popeluowka;
//        mass[1]=popeluowka2;
//        mass[2]=popeluowka3;
//
//
//        for (int i = 0; i < mass.length; i++) {
//            for (int k = 0; k < mass2.length; k++) {
//                if (mass[i].sizeLeg == mass2[k].tufelka){
//                    System.out.println("\n"+ mass[i] + "\n" +mass2[k]);
//                    System.out.println();
//                }
//
//            }
//        }
//
//
//
//
//
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i].sizeLeg == princ.tufelka){
//                System.out.println(mass[i]);
//            }
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == princ.tufelka){
//                System.out.println(arr[i]);
//            }
//        }

//
//        ITevent iTevent = new ITevent("aaaa","RPY","Lviv",22);
//        ITevent iTevent2 = new ITevent("bbbb","JAVA","Kuiv",34);
//        ITevent iTevent3 = new ITevent("cccc","HTML","Warshava",53);
//
//        Developer developer = new Developer("taras","JAVA");
//        Developer developer2 = new Developer("Pasha","HTML");
//        Developer developer3 = new Developer("Dmytro","RPY");
//
//        ITevent mass[] = new ITevent[3];
//        mass[0] = iTevent;
//        mass[1] = iTevent2;
//        mass[2] = iTevent3;
//
//        Developer mass2[] = new Developer[3];
//        mass2[0] = developer;
//        mass2[1] = developer2;
//        mass2[2] = developer3;
//
//
//        for (int i = 0; i < mass.length; i++) {
//            for (int k = 0; k < mass2.length; k++) {
//                if (mass[i].technology == mass2[k].hobby){
//                    System.out.println("\n" + mass[i] + "\n" + mass2[k]);
//                    System.out.println();
//                }
//            }
//        }

//        Car car = new Car(3);
//        Car car2 = new Car(2);
//        Car car3 = new Car(1);
//        Car car4 = new Car(2);
//        Car car5 = new Car(4);
//        Car car6 = new Car(4);
//        Car car7 = new Car(6);
//        Car car8 = new Car(3);
//        Car car9 = new Car(5);
//        Car car10 = new Car(1);
//        Car car11 = new Car(3);
//        Car car12 = new Car(1);
//
//
//        Car mass[] = {car, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12};
//        int a = 0;
//        int b = 0;
//
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i].volumeEngine > 3){
//                a++;
//            }else {
//                b++;
//            }
//        }
//
//        Car arr[] = new Car[a];
//        Car arr2[] = new Car[b];
//        int x = 0;
//        int y = 0;
//
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i].volumeEngine > 3){
//                arr[x] = mass[i];
//                x++;
//            }else {
//                arr2[y] = mass[i];
//                y++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//
//int mass[] = {1,2,5,88,0,3};
//int arr[] =  minMax(mass);
//        System.out.println(Arrays.toString(arr));
        ITevent iTevent = new ITevent();
        ITevent iTevent2 = new ITevent();
        ITevent iTevent3 = new ITevent();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter how much you want to create ITevents and Developers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ITevent mass[] = new ITevent[a];

        for (int i = 0; i <mass.length ; i++) {
            System.out.println("write name of ITevents");
            String name = scanner.next();
            System.out.println("Pease write technologies");
            String technology = scanner.next();
            System.out.println("please write name of city");
            String city = scanner.next();
            System.out.println("please write price");
            int price = scanner.nextInt();
            mass[i] = new ITevent(name, technology, city, price);
            System.out.println(Arrays.toString(mass));
        }

    }

//    public static int[] minMax(int arr[]){
//        int min = arr[0];
//        int max = arr[0];
//        int newMass[] = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]){
//                min = arr[i];
//            }else if (max < arr[i]){
//                max = arr[i];
//            }
//        }
//        newMass[0] = min;
//        newMass[1] = max;
//        return newMass;
//    }

}
