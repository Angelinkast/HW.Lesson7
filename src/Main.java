public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Masya", 20);
        Cat cat2 = new Cat("Lusya", 15);
        Plate plate = new Plate(20);

        Cat[] cats = {cat1, cat2};
        for (Cat iterCat : cats){
            iterCat.eat(plate);
        }

        plate.increaseFood(20);

        for (Cat iterCat : cats){
            iterCat.eat(plate);
        }
    }
}


//how to integrate cat and plate
//        cat1.eat(plate);



