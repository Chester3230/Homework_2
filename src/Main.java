import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        int [] weight = new int[]{1,2,3};

        double [] drob = {1.57, 7.654, 9.986};

        Object [] objects = {'g', 344, 545.676};


        //Задача 2


        for (int i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println(weight[weight.length - 1]);


        for (int i = 0; i < drob.length - 1; i++) {
            System.out.print(drob[i] + ", ");
        }
        System.out.println(drob[drob.length - 1]);


        for (int i = 0; i < objects.length - 1; i++) {
            System.out.print(objects[i] + ", ");
        }
        System.out.println(objects[objects.length - 1]);


        //Задание 3


        for (int i = objects.length - 1; i != 0; i--) {
            System.out.print(objects[i] + ", ");
        }
        System.out.println(objects[0]);


        for (int i = drob.length - 1; i != 0; i--) {
            System.out.print(drob[i] + ", ");
        }
        System.out.println(drob[0]);



        for (int i = weight.length - 1; i != 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println(weight[0]);


        //Задача 4


        for (int j = 0; j < weight.length; j++) {
            if (weight[j]%2 != 0) {
                weight[j] = weight[j] + 1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}