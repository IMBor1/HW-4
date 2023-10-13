public class Main {
    public static void main(String[] args) {
        // Задание № 1
        int ageFree = 18;
        int age = 23;
        if (age >= ageFree) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задание № 2
        int temperatureInCelsius1 = 2;
        int temperatureInCelsius = 5;
        if (temperatureInCelsius1 < temperatureInCelsius) {
            System.out.println("На улице " + temperatureInCelsius1 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureInCelsius1 + " градусов, можно идти без шапки");
        }

        // Задание № 3
        int normalSpeed = 60;
        int a = 80;
        if (a > normalSpeed) {
            System.out.println("Если скорость " + a + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + a + " , то можно ездить спокойно");
        }

        // Задание № 4
        age = 3;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age +
                    " , то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age +
                    " , то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age +
                    " , то ему нужно ходить в университет");
        } else {
            System.out.println("А если человеку больше 24, то ему пора ходить на работу");
        }

        // Задание № 5
        age = 4;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age +
                    " , то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age +
                    " , то ему можно кататься на аттракционе в сопровождении");

        } else {
            System.out.println("Если возраст ребенка равен " + age +
                    " , то ему можно кататься на аттракционе без сопровождения");
        }

        // Задание № 6
        int capacity = 102;
        int sittingPlace = 60;
        int standingPlace = capacity - sittingPlace;
        int peopleInTrainCar = 80;
        if (peopleInTrainCar > capacity) {
            System.out.println("В вагоне больше нет мест");
        } else if (peopleInTrainCar <= capacity && peopleInTrainCar <= sittingPlace) {
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