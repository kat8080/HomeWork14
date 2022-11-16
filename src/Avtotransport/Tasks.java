package Avtotransport;

public class Tasks {
    public static String validOrDefault(String value, String defoltValue) {
        if (value == null || value.isBlank()) {
            return defoltValue;
        } else return value;
    }

    public static int check(int meaning, int defoltMeaning) {   //проверка (зачение, заначение по умолчанию)
        if (meaning <= 0) {              //если значение <= 0
            return defoltMeaning;                  //то ставится значение по умолчанию
        } else return meaning;         //иначе заданное значение
    }
}
