import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        bankomat();
    }
    public static int ballance = 100000;
    public static int counter = 0;
    public static int att = 3;


    public static void bankomat(){
        System.out.println("Welcome");
        if(checkPassword()){
            menuList();
        }else {
            if(counter<2){
            System.out.println("try again\n");
            ++counter;
            att--;
            bankomat();
            }
        }
    }
    public static boolean checkPassword(){
        System.out.println("please, write your password. You have " +att + " attempts");
        int pass = 1111;
        if(pass == new Scanner(System.in).nextInt()){
                return true;
        }else if(counter == 2){
            System.out.println("you have a ban");
            System.exit(0);
        }
        return false;
    }

    public static void menuList(){
        System.out.println("ballance - 1\n setBallance - 2\n getBallance - 3\n logout - 4");
        switch (new Scanner(System.in).nextInt()){
            case 1:
                showBallance();
                menuList();
                break;
            case 2:
                setBallance();
                menuList();
                break;
            case 3:
                getBallance();
                menuList();
                break;
            case 4:
                logout();
                break;
                default:
                    System.out.println("go to menu");
                    menuList();
        }
    }

    public static void showBallance(){
        System.out.println("your balance = " + ballance + "\n");
    }

    public static void setBallance(){
        System.out.println("how many money would you like to put on your balance?");
        int cash = new Scanner(System.in).nextInt();
        ballance = ballance + cash;
        System.out.println("now your balance is " +ballance +"\n");
//        showBallance();
    }

    public static void getBallance(){
        showBallance();
        System.out.println("how much money do you want to remove?");
        int getCash = new Scanner(System.in).nextInt();
        if(ballance>=getCash){
            ballance = ballance - getCash;
            showBallance();
        }else {
            System.out.println("you don`t have so much money, please try again");
            getBallance();
        }
    }

    public static void logout(){
        System.out.println("log out");
        System.exit(0);
    }
}





















