package Polymorphism.Lab.P03Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    protected String getName() {
        return name;
    }

    protected String getFavouriteFood() {
        return favouriteFood;
    }

    public String explainSelf(){
        return String.format("I am %s and my favourite food is %s", this.getName(), this.getFavouriteFood());
    }
}
