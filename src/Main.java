public class Main {
    public static void main(String[] args) {
        // Задание № 1
        int age = 18;
        int ageOne = 23;
        int ageTwo = 16;
        if (ageOne >= age) {
            System.out.println("Если возраст человека равен " + ageOne + " он совершеннолетний");
        }
        if (ageTwo <= age) {
            System.out.println("Если возраст человека равен " + ageTwo +
                    " он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задание № 2
        int temperatureInCelsius1 = 2;
        int temperatureInCelsius2 = 10;
        int temperatureInCelsius = 5;
        if (temperatureInCelsius1 < temperatureInCelsius) {
            System.out.println("На улице " + temperatureInCelsius1 + " градусов, нужно надеть шапку");
        }
        if (temperatureInCelsius2 > temperatureInCelsius) {
            System.out.println("На улице " + temperatureInCelsius2 + " градусов, можно идти без шапки");
        }

        // Задание № 3
        int normalSpeed = 60;
        int a = 80;
        int b = 50;
        if (a >= normalSpeed) {
            System.out.println("Если скорость " + a + " , то придется заплатить штраф");
        }
        if (b <= normalSpeed) {
            System.out.println("Если скорость " + b + " , то можно ездить спокойно");
        }

        // Задание № 4
        int age1 = 3;
        int age2 = 9;
        int age3 = 20;
        int age4 = 30;

        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 +
                    " , то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 +
                    " , то ему нужно ходить в школу");
        }
        if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 +
                    " , то ему нужно ходить в университет");
        } else {
            System.out.println("А если человеку больше 24, то ему пора ходить на работу");
        }

        // Задание № 5
        age1 = 4;
        age2 = 6;
        age3 = 16;
        if (age1 < 5) {
            System.out.println("Если возраст ребенка равен " + age1 +
                    " , то ему нельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 <= 14) {
            System.out.println("Если возраст ребенка равен " + age2 +
                    " , то ему можно кататься на аттракционе в сопровождении");

        } else {
            System.out.println("Если возраст ребенка равен " + age3 +
                    " , то ему можно кататься на аттракционе без сопровождения");
        }

        // Задание № 6
        int capacity = 102;
        int sittingPlace = 60;
        int standingPlace = capacity - sittingPlace;
        int peopleInTrainCar = 80;
        if (peopleInTrainCar > capacity) {
            System.out.println("В вагоне больше нет мест");
        }
        if (peopleInTrainCar <= sittingPlace) {
            System.out.println("Есть сидячее место");
        } else {
            System.out.println("Есть стоячее место");
        }
        // Задание № 7
        int one = 1;
        int two = 12;
        int three = 15;
        if (one > two && two > three) {
            System.out.println("Самое большое " + one);
        } else if (two > one && one > three) {
            System.out.println("Самое большое " + two);
        } else {
            System.out.println("Самое большое " + three);
        }


    }
}