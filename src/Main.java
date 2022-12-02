public class Main {
    public static void main(String[] args) {

        //Задача 4

        int age = 13;
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }else{
            System.out.println("Поздравляем с совершеннолетием");
        }

        //Задача 5

        if (age >= 7 && age < 17) {
            System.out.println("Пора идти в школу");
        } else if (age >= 18 && age < 23) {
            System.out.println("Прощай школа, здравствуй университет");
        } else if (age > 24) {
            System.out.println("Прощай университет, пора искать первую работу");
        }

        //Задача 6

        int capacity = 102;
        int site = 60;
        int standingPlace = capacity - site;
        int siteUsed = 51;
        int standingPlaceUsed = 13;
        if  (site > siteUsed){
            System.out.println("Есть ещё "+ (site - siteUsed) +" мест");
        }else{
            System.out.println("Нет свободных мест");
        }
        if  (standingPlace > standingPlaceUsed){
            System.out.println("Есть ещё "+ (standingPlace - standingPlaceUsed) +" стоячих мест");
        } else{
            System.out.println("Нет свободных стоячих мест");
        }

        //Задание 3, задача 1

        if (age >=2 && age <=6) {
            System.out.println("Если возраст человека равен " +age+  ", то ему нужно ходить в детский сад");
        }else if(age >=7 && age <18) {
            System.out.println("Если возраст человека равен " +age+ ", то ему нужно ходить в школу");
        }else if(age >=18 && age <24) {
            System.out.println("Если возраст человека равен " +age+ " , то ему нужно ходить в университет");
        }else if(age >=24) {
            System.out.println("Если возраст человека равен " +age+ " , то ему нужно ходить на работу");
        }
        //Задача 2

        if (age <5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        }else if(age >= 5 && age <14) {
            System.out.println("Ребёнок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }else if(age >=14) {
            System.out.println("Он может кататься без сопровождения взрослого.");
        }
    }
}