package Zoopark;

public final class Amphibians extends Animals{   //класс земноводные

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Питается насекомыми.");
    }

    @Override
    public void sleep() {
        System.out.println("Спит в воде.");
    }

    @Override
    public void moveAround() {
        System.out.println("Перемещается по воде и по суше.");
    }

    public void hunting() {   //охотится
        System.out.println("Охотится на насекомых.");
    }


    @Override
    public String toString() {
        return "Земноводное: " + name + ", возраст " + age +
                " года, среда обитания " + livingEnvironment + ".";
    }
}
