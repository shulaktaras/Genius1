import java.util.Scanner;

public class Bankomat2 {
    public static void main(String[] args) {
        bankomat();

    }
    public static int balance = 10;
    public static int counter = 0;
    public static int att = 3;


    public static void bankomat(){
        System.out.println("Welcome");
        if(checkPassword()){
            menuList();
        }else{
            if (counter<2){
                System.out.println("\nTry again");
                ++counter;
                --att;
                bankomat();
            }
        }
    }
    public static boolean checkPassword(){
        int password = 1111;
        System.out.println("Please, input your password here, you have "+ att+" attempts");
        if(password == new Scanner(System.in).nextInt()){
            menuList();
            return true;
        }else if (counter == 2){
            System.out.println("\n You have a ban");
        }
        return false;
    }

    public static void menuList(){
        System.out.println("\n Show balance - 1 \n Set cash - 2 \n Get cash - 3 \n log out - 4");
        switch (new Scanner(System.in).nextInt()){
            case 1:
                showBalance();
                menuList();
                break;

            case 2:
                setCash();
                menuList();
                break;

            case 3:
                getCash();
                menuList();
                break;
            case 4:
                logOut();
                break;
                default:
                    menuList();

        }
    }

    public static void showBalance(){
        System.out.println("Your balance = " + balance);
        menuList();
    }

    public static void setCash(){
        System.out.println("How many money do you want to set?");
        int set = new Scanner(System.in).nextInt();
        balance = balance + set;
        System.out.println("you balance now = " + balance);
        menuList();
    }

    public static void getCash(){
        System.out.println("how many money do you want tp get?");
        int get = new Scanner(System.in).nextInt();
        if(balance >= get){
            balance = balance - get;
            System.out.println("your balance now = " + balance);
            menuList();
        }else {
            System.out.println("you don`t have so mush money on your balance");
            menuList();
        }
    }

    public static void logOut(){
        System.out.println(" Log out");
        System.exit(0);
    }
}
