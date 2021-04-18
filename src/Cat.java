public class Cat {
    private boolean fullCat;
    private String name;
    private int appetite;


    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        fullCat = false;

    }

    public void eat(Plate plate){
        if (plate.isEnough(appetite) && !fullCat){
            System.out.println(name + " is eating");
        plate.decreaseFood(appetite);
        fullCat = true;
    }
        else if (!plate.isEnough(appetite) && !fullCat){
            System.out.println(name + " isn't eating");
        }
        else if (fullCat){
            System.out.println(name + " is full");
        }
}


}
