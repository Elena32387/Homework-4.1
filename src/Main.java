public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int i = 0;
        int month = 0;
        int total = 2_459_000;
        int amount = 15000;
        double percent = 1D / 100;
        while (i < total) {
            i += amount;
            i = (int) (i * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + i + " рублей.");
        }


        System.out.println("Задание 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Задание 3");
        int population = 12_000_000;
        int fertilityForThousant = 17;
        int mortalityForThousant = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityForThousant / 1000 - population * mortalityForThousant / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }

        System.out.println("Задание 4");
        percent = 7D / 100;
        amount = 15000;
        total = 12_000_000;
        month = 0;
        while (amount < total) {
            amount = (int) (amount * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + amount + " рублей.");
        }
        System.out.println("Задание 5");
        amount = 15000;
        month = 0;
        while (amount < total) {
            amount = (int) (amount * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + amount + " рублей.");
            }
        }
        System.out.println("Задание 6");
        amount = 15000;
        month = 0;
        int months = 9 * 12;
        while (month < months) {
            amount = (int) (amount * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + amount + " рублей.");
            }
        }
        System.out.println("Задание 7");
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day+=7){
            System.out.println("Сегодня пятница, "+day+" -е число. Необходимо подготовить отчет");}

        System.out.println("Задание 8");
        int period = 79;
        int startComet = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startComet; year<end; year +=period){
            if (year >start){
                System.out.println(year);}
            }
        }


        }











