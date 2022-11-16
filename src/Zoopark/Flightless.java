package Zoopark;

public final class Flightless extends Birds {
    public Flightless(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }
    public void walk() {
        System.out.println("Любит гулять не спеша");
    }

    @Override
    public void eat() {
        System.out.println("Кушает пшено, насекомых");
    }

    @Override
    public void sleep() {
        System.out.println("Спит в гнезде");
    }

    @Override
    public void moveAround() {
        System.out.println("Перемещается по земле");
    }

    @Override
    public void hunting() {
        System.out.println("Охотится на насекомых");
    }

    @Override
    public String toString() {
        return "Нелетающие: " +name+
                " возраст " + age +
                " лет, среда проживания " + livingEnvironment +
                ", тип передвижения " + typeMovement;
    }
}
