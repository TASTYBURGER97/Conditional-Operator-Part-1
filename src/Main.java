public class Main {
    public static void main(String[] args) {
        //HomeWork 1
        System.out.println("//Home Work 1");
        //Task1
        System.out.println("//Task1");
        int age = 19;
        if (age >= 18) {
            System.out.println("поздравление пользователя с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //Task2
        System.out.println("//Task2");
        if (age >= 7 && age < 18) {
            System.out.print("Ребёнок ходит в школу");
        }
        if (age >= 18 && age < 20) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        //Task3
        System.out.println("//Task3");
        int capacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = capacity - seatingPlaces; // стоячие места

        int seatsUsed = 59;
        int standsUsed = 41;
        if (seatsUsed < seatingPlaces) {
            System.out.println("Осталось " + (seatingPlaces - seatsUsed) + " сидячих мест");
        }
        if (seatsUsed < seatingPlaces) {
            System.out.println("Осталось " + (seatingPlaces - seatsUsed) + " стоячих мест");
        }
        //HomeWork2
        System.out.println("//Home Work 2");
        //Task1
        System.out.println("//Task1");
        int ageOld = 19;
        if (ageOld >= 18) {
            System.out.println("поздравление пользователя с совершеннолетием");
        } else {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        //Task2
        System.out.println("//Task2");
        if (age >= 7 && age < 18) {
            System.out.print("Ребёнок ходит в школу");
        } else if (age >= 18 && age < 20) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");

        }
        //Task3
        System.out.println("//Task3");
        System.out.println("//Task3");
        int capacitty = 102;
        int seatingPplaces = 60;
        int standingPplaces = capacity - seatingPplaces; // стоячие места

        int seatsUssed = 59;
        int standsUssed = 41;
        if (seatsUsed < seatingPplaces) {
            System.out.println("Осталось " + (seatingPplaces - seatsUssed) + " сидячих мест");
        } else {
            System.out.println("сидячих мест нет");
        }
        if (standsUssed < standingPplaces) {
            System.out.println("Осталось " + (standingPplaces - standsUssed) + " стоячих мест");
        } else {
            System.out.println("стоячих мест нет");
        }
        //HomeWork3
        System.out.println("//Home Work 3");
        //Task1
        System.out.println("//Task1");
        int period = 13;
        if (period >=2 && period <= 6) {
            System.out.println("Если возраст человека равен" + period + ", то ему нужно ходить дет.сад");
        }else if(period>=6 && period<=18){
            System.out.println("Если возраст человека равен" + period + ", то ему нужно ходить в школу");
        } else if(period>=18 && period <= 24) {
            System.out.println("Если возраст человека равен" + period + ", то его место в университете");
        }else if(period>=18 && period <= 24){
            System.out.println("Если возраст человека равен" + period + ", то ему пора ходить на работу");
        }

        //Task2
        System.out.println("//Task2");
        if (period < 5) {
            System.out.println("ребёнок не может кататься на аттракционе");
        }else if(period >=5 &&period<14 ){
            System.out.println("Ребёнок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Ребёнок может кататься без сопровождения взрослого");
        }
        //Task3
        System.out.println("//Task3");
        int one = 125;
        int two = 5;
        int three = 125;
        if (one > two) {
            if (one >= three) {
                System.out.println("максимальное число - " + one);
            } else {
                System.out.println("максимальное число - " + three);
            }
            } else if (two >one) {
            if (two >= three ) {
                System.out.println("максимальное число - " + two);
            } else {
                if (one > three) {

                    System.out.println("Vfrcbvfkmyjt xbckj - " + three);
                }else {
                    System.out.println("все 3 числа равны");
                }
            }
            }
        }




    }

