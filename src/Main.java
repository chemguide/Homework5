public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //Задача 2
        System.out.println("\nЗадача 2");
        int clientDeviceYear = 2013;
        int deviceBorderYear = 2015;
        boolean oldDevice = clientDeviceYear < deviceBorderYear;
        if (clientOS == 1) {
            if (oldDevice) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (oldDevice) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //Задача 3
        System.out.println("\nЗадача 3");
        int year = 2021;
        long yearRestDivFour = year % 4;
        long yearRestDivOneHundred = year % 100;
        long yearRestDivFourHundred = year % 400;
        boolean divFour = yearRestDivFour == 0;
        boolean divOneHundred = yearRestDivOneHundred == 0;
        boolean divFourHundred = yearRestDivFourHundred == 0;
        if (year >= 1584) {
            if (divFourHundred) {
                System.out.println("Год високосный");
            } else if (divFour && !divOneHundred) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");
            }
        } else {
            System.out.println("Введите год позднее 1584");
        }
        //Задача 4
        System.out.println("\nЗадача 4");
        int deliveryDistance = 95;
        boolean oneDay = deliveryDistance <= 20;
        boolean twoDays = (deliveryDistance > 20) && (deliveryDistance <= 60);
        boolean threeDays = (deliveryDistance > 60) && (deliveryDistance <= 100);
        boolean noLogistic = deliveryDistance > 100;
        if (oneDay) {
            System.out.println("Потребуется дней: 1");
        }
        if (twoDays) {
            System.out.println("Потребуется дней: 2");
        }
        if (threeDays) {
            System.out.println("Потребуется дней: 3");
        }
        if (noLogistic) {
            System.out.println("Доставки нет");
        }
        //Задача 5
        System.out.println("\nЗадача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер месяца не может быть больше 12!");

        }
    }
}