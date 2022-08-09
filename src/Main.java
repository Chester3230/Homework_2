import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        int ClientOS = 1;

        if (ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (ClientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        ClientOS = 0;
        int clientDeviceYear = 2017;

        if (ClientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (ClientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (ClientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        if (ClientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 3
        int year = 1758;
        int del = year % 100;
        if( (del > 1 && del % 4 == 0) || (del == 0 && year % 400 == 0) ) {
            System.out.println(year + " год является високосным");
        }
        else{
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        int deliveryDistance = 20;
        int days = 0;
        if (deliveryDistance > 0 ) {
            days = days + 1;
        }
        if (deliveryDistance >= 20 ) {
            days = days + 1;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100 ) {
            days = days + 1;
        }
        int ost = days % 10;
        if (ost >= 2 && ost <= 4 ) {
            System.out.println("Потребуется " + days + " дня");
        } else if( ost == 1 ) {
            System.out.println("Потребуется " + days + " день");
        } else if( ost >= 5 )  {
            System.out.println("Потребуется " + days + " дней");
        }

        //Задача 5
        int monthNumber = 13;

        switch (monthNumber) {
            case (1):
                System.out.println("зима");
                break;
            case (2):
                System.out.println("зима");
                break;
            case (3):
                System.out.println("весна");
                break;
            case (4):
                System.out.println("весна");
                break;
            case (5):
                System.out.println("весна");
                break;
            case (6):
                System.out.println("лето");
                break;
            case (7):
                System.out.println("лето");
                break;
            case (8):
                System.out.println("лето");
                break;
            case (9):
                System.out.println("осень");
                break;
            case (10):
                System.out.println("осень");
                break;
            case (11):
                System.out.println("осень");
                break;
            case (12):
                System.out.println("зима");
                break;
            default:
                break;
        };
    }
}