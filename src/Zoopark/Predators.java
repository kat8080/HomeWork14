package Zoopark;

public final class Predators extends Mammals {
    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed, food);
    }

    @Override
    public void walk() {
        System.out.println("Гулять любит средне");
    }

    @Override
    public void eat() {
        System.out.println("Кушает: "+food);
    }

    @Override
    public void sleep() {
        System.out.println("Спит в пещере");
    }

    @Override
    public void moveAround() {
        System.out.println("Перемещается шагом и бегом");
    }
    public void hunting() {
        System.out.println("Охотится на парнокопытных, грызунов");
    }

    @Override
    public String toString() {
        return "Хищники: " + name +
                " , возраст " + age +
                " лет, среда проживания " + livingEnvironment +
                ", скорость перемещения " + movementSpeed +
                " км/ч, тип пищи " + food;
    }
}
