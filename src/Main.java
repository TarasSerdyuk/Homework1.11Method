import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");

        int year = 2000;
        checkYear(year);
    }

    public static void checkYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2018;

        getDeviceSoft(clientOS, clientDeviceYear);
    }

    public static void getDeviceSoft (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылк");
            }
        } else {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Androyd по ссылке");
            } else {
                System.out.println("Установите версию приложения для Androyd по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

    int deliveryDistance = 120;
    countDaysDelivery(deliveryDistance);

    }

    public static int countDaysDelivery(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100 || deliveryDistance < 0) {
            deliveryDays = 0;
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        return deliveryDays;
    }
   }
