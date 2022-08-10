public class Main {
    public static void main(String[] args) {

        //Задание 1
        int [] weight = new int[]{1,2,3};

        double [] drob = {1.57, 7.654, 9.986};

        Object [] objects = {'g', 344, 545.676};

        //Задача 2
        int i = 0;
        while (i <= 2){
            System.out.print(weight[i]);
            if (i != 2) {
                System.out.print(",");
            }
            ++i;
        }
        System.out.println(" ");
        i = 0;
        while (i <= 2){
            System.out.print(drob[i]);
            if (i != 2) {
                System.out.print(",");
            }
            ++i;
        }
        System.out.println(" ");
        i = 0;
        while (i <= 2){
            System.out.print(objects[i]);
            if (i != 2) {
                System.out.print(",");
            }
            ++i;
        }
        System.out.println(" ");

        //Задание 3
        i = 2;
        while (true){
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                break;
            }
            --i;
        }
        System.out.println(" ");
        i = 2;
        while (true){
            System.out.print(drob[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                break;
            }
            --i;
        }
        System.out.println(" ");
        i = 2;
        while (true){
            System.out.print(objects[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                break;
            }
            --i;
        }
        System.out.println(" ");

        //Задача 4

        for (int ii = 0; ii <= 2; ++ii) {
            if (weight[ii]%2 == 0) {
                System.out.print(weight[ii]);
            } else {
                System.out.print(weight[ii] + 1);
            }
            if (ii != 2) {
                System.out.print(",");
            }
        }
    }
}