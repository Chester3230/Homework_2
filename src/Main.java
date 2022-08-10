public class Main {
    public static void main(String[] args) {

        // Задание 1
        int limits = 1;
        while (limits <= 10) {
            System.out.print(limits + " ");
            limits = limits + 1;
        }
        System.out.println(" ");
        for (int i = 10; i != 0; --i){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //Задание 2
        int firstFriday = 6;
        int lastDay = 31;

        for (int i = firstFriday; i <= lastDay; i = i + 7 ){
            System.out.println("Сегодня пятница, "+ i +"-е число. Необходимо подготовить отчет");
        }

        //Задание 3
        int yearBefore = 1800;
        int yearLast = 2100;

        for (int i = 1800; i <= yearLast; i = i + 79){
            System.out.println(i);
        }
    }
}