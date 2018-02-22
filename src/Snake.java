public class Snake {
    public static void main(String[] args) {

//        int mass[] = {1,0,3,0,12,-4,8,2,0,-5};
//        int min[] = new int[2];
//        min[0] = mass[0];
//        min[1] = mass[1];
//        for (int i = 1; i < mass.length; i++) {
//            if (mass[i]<min[0]){
//                min[1] = min[0];
//                min[0] = mass[i];
//            }else if(mass[i]<min[1] && mass[i]!=min[0]){
//                min[0] = mass[i];
//            }
//        }
//        System.out.println("\n min1 = "+ min[0]+"\n min2 = "+min[1]);

//int mass[] = {1,0,1,8,0,2,1,4,7,9,0};
//int min[] = new int[3];
//min[0] = mass[0];
//min[1] = mass[1];
//min[2] = mass[2];
//
//        for (int i = 2; i < mass.length; i++) {
//            if (mass[i]< min[0]){
//                min[2] = min[1];
//                min[1] = min[0];
//                min[0] = mass[i];
//
//            }else if(mass[i]<min[1] && mass[i]!=min[0]){
//                min[2] = min[1];
//                min[1] = mass[i];
//
//            }else if (mass[i]<min[2] && mass[i]!= min[0] && mass[i]!=min[1]){
//                min[2] = mass[i];
//            }
//        }
//
//        System.out.println("\n min1 = " + min[0] + "\n min2 = " + min[1] + "\n min3 = " + min[2]);
//
//

        int mass[] = {0,0,1,0,2,0,-1,-1};
        int min = mass[0];
        int min2 = mass[1];

//int max = mass[1];

//        for (int i = 0; i < mass.length; i++) {
//            if(max<mass[i]){
//                max = mass[i];
//            }else if(min>mass[i]){
//                min = mass[i];
//            }
//        }
//        for (int i = 0; i < mass.length; i++) {
//            if (max>mass[i] && mass[i]!=min){
//                max=mass[i];
//            }
//        }
//        System.out.println("\n min1 = " + min + "\n min2 = " +max);


        for (int i = 0; i < mass.length; i++) {
            if(min>mass[i]){
                min = mass[i];
            }else if (min2>mass[i]){
                min2 = mass[i];
            }
        }

        System.out.println(min);
        System.out.println(min2);

















    }
}
