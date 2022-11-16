package Zoopark;

import Avtotransport.Tasks;

public abstract class Mammals extends Animals {   //млекопитающие
    public final int movementSpeed;   //скорость передвижения
    public String food;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment);
        this.movementSpeed = Tasks.check(movementSpeed,1);
        setFood(food);
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = Tasks.validOrDefault(food, "неизвестно");
    }

    public abstract void walk();  //метод гулять
    
}
