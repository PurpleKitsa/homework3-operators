public class Main {
    public static void main(String[] args) {

        //Задача 1

        int age = 25;
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }

        //Задача 2

        if (age >= 7 && age < 17) {
            System.out.println("Пора идти в школу");
        }
        if (age >= 18 && age < 23) {
            System.out.println("Прощай школа, здравствуй университет");
        }
        if (age > 24) {
            System.out.println("Прощай университет, пора искать первую работу");
        }

        //Задача 3

        int capacity = 102;
        int site = 60;
        int standingPlace = capacity - site;
        int siteUsed = 52;
        int standingPlaceUsed = 12;
        if  (site > siteUsed){
            System.out.println("Есть ещё "+ (site - siteUsed) +" мест");
        }
        if  (siteUsed >= site ) {
            System.out.println("Нет свободных мест");
        }
        if  (standingPlace > standingPlaceUsed){
            System.out.println("Есть ещё "+ (standingPlace - standingPlaceUsed) +" стоячих мест");
        }
        if  (standingPlaceUsed >= standingPlace ) {
            System.out.println("Нет свободных стоячих мест");
        }



    }
}