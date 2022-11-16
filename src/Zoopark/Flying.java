package Zoopark;

public final class Flying extends Birds {
    public Flying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }

    @Override
    public void hunting() {
        System.out.println("Охотится на мелких животных");
    }

    @Override
    public void eat() {
        System.out.println("Кушает мелких животных");
    }

    @Override
    public void sleep() {
        System.out.println("Спит в гнезде");
    }

    @Override
    public void moveAround() {
        System.out.println("Перемещается по воздуху");
    }

    public void toFly() {
        System.out.println("Летающая птица");
    }

    @Override
    public String toString() {
        return "Летающие: " + name +
                ", возраст " + age +
                " года, среда проживания " + livingEnvironment +
                ", тип передвижения " + typeMovement;
    }
}
