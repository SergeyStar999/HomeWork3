public class Main {
    public static void main(String[] args) {

        // Задание 1

        int clientOS1 = 0;
        int clientOS2 = 1;
        if(clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if(clientOS2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // Задание 2

        int iOS = 0;
        int android = 1;
        int clientDeviceYear1 = 2014;
        int clientDeviceYear2= 2015;
        if(iOS == 0 && clientDeviceYear1 < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if(iOS == 0 && clientDeviceYear2 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if(android == 1 && clientDeviceYear1 < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (android == 1 && clientDeviceYear2 >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // Задание 3

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным.");
        } else {
            System.out.println("Год " + year + " является не високосным.");
        }

        // Задание 4

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день. " + "Срок доставки 24 часа.");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60 || deliveryDistance <=61 && deliveryDistance <= 100) {
            System.out.println("Потребуется 2 дня. " + "Срок доставки 48 часов.");
        } else {
            System.out.println("Потребуется 3 дня. " + "Срок доставки 72 часа.");
        }

        // Задание 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - Зима");
                break;
            case 2:
                System.out.println("Февраль - Зима");
                break;
            case 3:
                System.out.println("Март - Весна");
                break;
            case 4:
                System.out.println("Апрель - Весна");
                break;
            case 5:
                System.out.println("Май - Весна");
                break;
            case 6:
                System.out.println("Июнь - Лето");
                break;
            case 7:
                System.out.println("Июль - Лето");
                break;
            case 8:
                System.out.println("Август -Лето");
                break;
            case 9:
                System.out.println("Сентябрь - Осень");
                break;
            case 10:
                System.out.println("Октябрь - Осень");
                break;
            case 11:
                System.out.println("Ноябрь - Осень");
                break;
            case 12:
                System.out.println("Декабрь - Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        }
    }