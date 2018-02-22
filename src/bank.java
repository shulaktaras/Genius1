import java.util.Random;

public class bank {
    public static void main(String[] args) {
//        revers(1234);

//        System.out.println(1234 % 10);

//
//
        assMass(5,50);
    }
//
//    public static void revers(int number){  //number = 1234
//        System.out.print(number % 10 + " ");
//        number = number / 10;
//        if (number>0) revers(number);
//    }
//
    public static void assMass(int size, int diapazon){
        Random random = new Random();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(diapazon);
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }



}
