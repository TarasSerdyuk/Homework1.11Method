import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int year = 2023;
        checkYear();

        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2018;
        getDeviceSoft();

        System.out.println("Задача 3");

        int deliveryDistance = 95;
        countDaysDelivery();
    }


    public static void checkYear (int year) {
            if ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
          System.out.println(year + "год не является високосным");
        }
    }

       public static void getDeviceSoft (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылк");
            }
        } else {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для Androyd по ссылке");
            } else {
                System.out.println("Установите версию приложения для Androyd по ссылке");
            }
        }
    }
    public static void countDaysDelivery(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
   }
