package Zoopark;

import Avtotransport.Tasks;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {
    public final String name;
    public int age;
    public String livingEnvironment;  //среда проживания

    public Animals(String name, int age, String livingEnvironment) {
        this.name = Tasks.validOrDefault(name,"не указано");
        setAge(age);
        setLivingEnvironment(livingEnvironment);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else this.age = Math.abs(age);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Tasks.validOrDefault(livingEnvironment,"не указано");
    }

    public String getName() {
        return name;
    }

    public abstract void eat();    //метод кушать
    public abstract void sleep(); //метод спать
    public abstract void moveAround();  //метод перемещаться

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

