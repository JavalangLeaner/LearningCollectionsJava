import java.util.*;

public class JavaCollections {
    /*
    * Этот проект предназначен для изучения Java Collections
    * */
    public static void main (String[] args)
    {

        TestHashSet();
    }


    public static void TestHashSet()
    {
        System.out.println("Program start");

        HashSet<String> firstHashSet =new HashSet<>();

        firstHashSet.add("Собака");
        firstHashSet.add("Кошка");
        firstHashSet.add("Жираф");
        firstHashSet.add("Человек");

        System.out.println(firstHashSet.size());

        Iterator<String> iter = firstHashSet.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        System.out.println("Добавляем строку Жираф еще раз");
        firstHashSet.add("Жираф");
        System.out.println(firstHashSet.size());
        System.out.println("Все равно 4 элемента. Добавляет только уникальные имена.");
        System.out.println("HashSet не упорядочивает элементы и не сортирует.");
        System.out.println("HashSet самый быстрый из реализаций Set и основан на HashMap.");
    }
}
