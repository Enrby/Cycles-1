public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int number = 1; number <= 10; number++)
            System.out.println(number);
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int number = 10; number >= 1; number--)
            System.out.println(number);
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int number = 0; number <= 17; number = number + 2)
            System.out.println(number);
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int year = 2020; year < 2070; year = year + 4) {
            System.out.println("Високосный год " + year);
        }
    }

    public static void task5() {
        System.out.println("Задаа 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println("Год " + year + " является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задча 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + salary;
            System.out.println("Месяц " + (i + 1) + " Сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int salary  = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + salary/100;
            total = total + salary;
            System.out.println("Месяц " + (i + 1) + " Сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 1; i <= 20; i = i * 2){
            System.out.println(i);
    }
}
}


