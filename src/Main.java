//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно еще немного подождать");
        }
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то, приедтся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ездить спокойно.");
        }
        System.out.println("Задача 4");
        int ageOfThePerson = 19;
        if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в детский сад.");
        }
        if (ageOfThePerson >= 7 && ageOfThePerson <= 17) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу.");
        }
        if (ageOfThePerson >= 18 && ageOfThePerson <= 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то его место в университете.");
        }
        if (ageOfThePerson > 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему пора ходить на работу.");
        }
        System.out.println("Задача 5");
        int ageOfTheChild = 15;
        if (ageOfTheChild < 5) {
            System.out.println("Если возраст ребенка " + ageOfTheChild + ", то он не может кататься на аттракционе.");
        }
        if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
            System.out.println("Если возраст ребенка " + ageOfTheChild + ", то он может кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageOfTheChild >= 14) {
            System.out.println("Если возраст ребенка " + ageOfTheChild + ", то он может кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("Задача 6");
        int carriageCapacity = 102;
        int numberOfSeatsInTheCarriage = 60;
        int occupiedPlaces = 10;
        if (occupiedPlaces < numberOfSeatsInTheCarriage) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (occupiedPlaces >= numberOfSeatsInTheCarriage && occupiedPlaces != carriageCapacity) {
            System.out.println("В вагоне есть только стоячие места.");
        } else {
            System.out.println("В вагоне нет мест.");
        }
        System.out.println("Задача 7");
        int one = 30;
        int two = 32;
        int three = 33;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных.");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных.");
        } else {
            System.out.println("Число three больше остальных.");
        }
    }
}