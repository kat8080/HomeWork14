package Zoopark;

public final class Herbivores extends Mammals {  //класс млекопитающие

    public Herbivores(String name, int age, String livingEnvironment,
                      int movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed, food);
    }

    @Override
    public void eat() {
        System.out.println("Кушает: " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Спит под навесом.");
    }

    @Override
    public void moveAround() {
        System.out.println("Перемещается шагом, рысью, галопом");
    }

    @Override
    public void walk() {
        System.out.println("Гуляет постоянно");
    }

    public void pastiche() {
        System.out.println("Пасется на лугу");
    }

    @Override
    public String toString() {
        return "Травоядное: " + name + ", возраст " + age +
                " лет, среда проживания " + livingEnvironment +
                ", скорость перемещения " + movementSpeed + " км/ч, тип пищи " + food + ".";
    }
}
