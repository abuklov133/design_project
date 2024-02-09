package factory_method;

import java.util.*;

/*на примере класса java.util.Calendar. Сам класс Calendar абстрактный,
 а чтобы его создавать используется метод getInstance:*/

public class FactoryMethod {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getClass().getCanonicalName());
    }
}
