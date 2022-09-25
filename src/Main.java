public class Main {
    public static void main(String[] args) {

        //Задача 1.
        System.out.println("Задача 1");
        int apple = 2000;
        System.out.println("Значение переменой \"apple\" с типом \"int\" равно " + apple);
        byte pear = 50;
        System.out.println("Значение переменой \"pear\" с типом \"byte\" равно " + pear);
        short cherry = 300;
        System.out.println("Значение переменой \"cherry\" с типом \"short\" равно " + cherry);
        long raspberry = 400L;
        System.out.println("Значение переменой \"raspberry\" с типом \"long\" равно " + raspberry);
        float lemon = 7.5f;
        System.out.println("Значение переменой \"lemon\" с типом \"float\" равно " + lemon);
        double orange = 3.5;
        System.out.println("Значение переменой \"orange\" с типом \"double\" равно " + orange);

        //Задание 2
        System.out.println("Задание 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        boolean d = false;
        System.out.println(d);
        short e = 569;
        System.out.println(e);
        short f = -159;
        System.out.println(f);
        short g = 27897;
        System.out.println(g);
        byte h = 67;
        System.out.println(h);

        //Задание 3
        System.out.println("Задание 3");
        byte lydmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        int totalStudents = lydmila + anna + ekaterina;
        short paper = 480;
        int totalPaper = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + totalPaper + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");
        byte bottle = 16 / 2;
        byte min = 20;
        short day = 1440;
        short day3 = 4320;
        int month = 131400;
        System.out.println("За 20 мин работы машины произвела бутылок " + bottle * min + " штук");
        System.out.println("За сутки работы машины произвела бутылок " + bottle * day + " штук");
        System.out.println("За 3 дня работы машины произвела бутылок " + bottle * day3 + " штук");
        System.out.println("За месяц работы машины произвела бутылок " + bottle * month + " штук");

        //Задача 5
        System.out.println("Задача 5");
        byte totalBanks = 120;
        byte white = 2;
        byte brown = 4;
        int room = white + brown;
        int totalСlasses = totalBanks / room;
        System.out.println("В школе, где " + totalСlasses + " классов, нужно " + totalСlasses * white +
                " банок белой краски и " + totalСlasses * brown + " банок коричневой краски");

        //Задача 6
        System.out.println("Задача 6");
        short bananas = 5 * 80;
        short milk = 105 * 2;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        int gram = bananas + milk + iceCream + egg;
        double kg = 1000;
        System.out.println(gram + " грамм");
        System.out.println(gram / kg + " кг");

        //Задача 7
        System.out.println("Задача 7");
        int totalKg = 7000;
        int gramDay = 250;
        int gramDay1 = 500;
        float gramMidl = (gramDay1 + gramDay) / 2;
        int totalDay = totalKg / gramDay;
        int totalDay1 = totalKg / gramDay1;
        float totalDayMidl = totalKg / gramMidl;
        System.out.println(totalDay + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(totalDay1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(totalDayMidl + " дней в среднем уйдёт на похудение");

        //Задача 8
        System.out.println("Задача 8");
        float masha = 67760;
        float denis = 83690;
        float kristina = 76230;
        System.out.println("Заработная плата Маши составляет: " + masha);
        System.out.println("Заработная плата Дениса составляет: " + denis);
        System.out.println("Заработная плата Кристины составляет: " + kristina);
        int salaryIncrease = 10;
        float mashaAfterIncrease = (masha / 100) * salaryIncrease;
        float denisAfterIncrease = (denis / 100) * salaryIncrease;
        float kristinaAfterIncrease = (kristina / 100) * salaryIncrease;
        float mashaTotal = masha + mashaAfterIncrease;
        float denisTotal = denis + denisAfterIncrease;
        float kristinaTotal = kristina + kristinaAfterIncrease;
        System.out.println("Заработная плата Маши увеличиться на " + mashaAfterIncrease + " и составит " + mashaTotal);
        System.out.println("Заработная плата Дениса увеличиться на " + denisAfterIncrease + " и составит " + denisTotal);
        System.out.println("Заработная плата Кристины увеличиться на " + kristinaAfterIncrease + " и составит " + kristinaTotal);
        float mashaYear = masha * 12;
        float mashaYearAfter = mashaTotal * 12;
        float differenceYearMasha = mashaYearAfter - mashaYear;
        System.out.println("Годовой доход Маши до повышения состовляет " + mashaYear + " рублей, а после повышения " + mashaYearAfter);
        float denisYear = denis * 12;
        float denisYearAfter = denisTotal * 12;
        float differenceYearDenis = denisYearAfter - denisYear;
        System.out.println("Годовой доход Дениса до повышения состовляет " + denisYear + " рублей, а после повышения " + denisYearAfter);
        float kristinaYear = kristina * 12;
        float kristinaYearAfter = kristinaTotal * 12;
        float differenceYearKristina = kristinaYearAfter - kristinaYear;
        System.out.println("Годовой доход Кристины до повышения состовляет " + kristinaYear + " рублей, а после повышения " + kristinaYearAfter);
        System.out.println("Годовой доход Маши вырос на " + differenceYearMasha);
        System.out.println("Годовой доход Дениса вырос на " + differenceYearDenis);
        System.out.println("Годовой доход Кристины вырос на " + differenceYearKristina);


    }
}