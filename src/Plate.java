public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (appetite > food) {
            System.out.println("Not enough food");
        } else {
            food = food - appetite;
        }
    }

    // If do with boolean method => ! - means not
    // if (!isEnough(appetite))
    public boolean isEnough(int appetite){return appetite <= food;}

    public void increaseFood(int foodCountInc){
        food = food + foodCountInc;
    }
    public void info(){
        System.out.println("Plate " + food);
    }
}
