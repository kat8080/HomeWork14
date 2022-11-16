package Zoopark;

import Avtotransport.Tasks;

public abstract class Birds extends Animals {
    public final String typeMovement;  //тип передвижения


    public Birds(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        this.typeMovement = Tasks.validOrDefault(typeMovement, "неизвестно");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    abstract public void hunting(); //метод охотиться
}
