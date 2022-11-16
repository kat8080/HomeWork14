package Zoopark;

public class MainZ {
    public static void main(String[] args){
        Herbivores gazel = new Herbivores("газель", 5, "вольер", 97, "трава");
        Herbivores zhiraf = new Herbivores("жираф", 2, "вольер", 55, "трава");
        Herbivores loshad = new Herbivores("лошадь", 1, "вольер", 88, "трава");
        System.out.println(gazel);
        gazel.eat();
        gazel.sleep();
        gazel.moveAround();
        gazel.walk();
        gazel.pastiche();

        Predators giena = new Predators("гиена", 4, "вольер", 64, "мясо");
        Predators tigr = new Predators("тигр", 6, "вольер", 65, "мясо");
        Predators medved = new Predators("медведь", 9, "вольер", 56, "мясо");
        System.out.println(giena);
        giena.eat();
        giena.sleep();
        giena.moveAround();
        giena.walk();
        giena.hunting();

        Amphibians layguchka = new Amphibians("лягушка", 3, "пруд");
        Amphibians uzn = new Amphibians("уж пресноводный", 7, "пруд");
        System.out.println(layguchka);
        layguchka.hunting();
        layguchka.eat();
        layguchka.moveAround();
        layguchka.sleep();

        Flightless pavlin = new Flightless("павлин", 2, "вольер", "лапами");
        Flightless pingvin = new Flightless("пингвин", 4, "вольер", "лапами");
        Flightless pticaDodo = new Flightless("птица додо", 6, "вольер", "лапами");
        System.out.println(pavlin);
        pavlin.eat();
        pavlin.sleep();
        pavlin.moveAround();
        pavlin.walk();
        pavlin.hunting();

        Flying chaika = new Flying("чайка", 1, "в клетке", "крыльями");
        Flying albatros = new Flying("альбатрос", 8, "в клетке", "крыльями");
        Flying sokol = new Flying("сокол", 4, "в клетке", "крыльями");
        System.out.println(chaika);
        chaika.eat();
        chaika.sleep();
        chaika.moveAround();
        chaika.toFly();
        chaika.hunting();
    }
}
