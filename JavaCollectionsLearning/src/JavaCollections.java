import java.util.*;

public class JavaCollections {
    /*
    * Этот проект предназначен для изучения Java Collections
    * */
    public static void main (String[] args)
    {

        // TestHashSet();
        // TestLinkedHashSet();
        TestTreeSet();
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


    public static void TestLinkedHashSet ()
    {
        LinkedHashSet <String> linHashSet = new LinkedHashSet();
        System.out.println("Изучение LinkedHashSet коллекции");
        System.out.println("Создадим обьект такого класса и добавим несколько записей.");
        linHashSet.add("Клен");
        linHashSet.add("Дуб");
        linHashSet.add("Ива");
        linHashSet.add("Сирень");

        System.out.printf("Размера коллекции: %d\n", linHashSet.size());


        Iterator <String> linkIter = linHashSet.iterator();

        while (linkIter.hasNext())
        {
            System.out.println(linkIter.next());

        }

        System.out.println("1. В каком порядке мы добавляли обьекты в коллекцию, " +
                "в таком порядке они и извелекаются.");
        System.out.println("То есть обьекты упорядочены");

        System.out.println("Добавим обект Сирень еще раз.");
        linHashSet.add("Сирень");
        System.out.printf("Размера коллекции: %d\n", linHashSet.size());
        System.out.println("Также добавляет уникальные обьекты.");

        linHashSet.remove("Дуб");

        System.out.printf("Размера коллекции: %d\n", linHashSet.size());

        linkIter = linHashSet.iterator();

        while (linkIter.hasNext())
        {
            System.out.println(linkIter.next());

        }
    }

   public static void TestTreeSet()
   {
       System.out.println("TreeSet реализация");
       TreeSet<String> newTreeSet = new TreeSet<>();
       System.out.println("Добавим в коллекцию обьекты.");

       newTreeSet.add("Антон");
       newTreeSet.add("Катя");
       newTreeSet.add("Юра");
       newTreeSet.add("Сергей");
       newTreeSet.add("Иван");

       System.out.println("Размер массива:"+ newTreeSet.size());

       Iterator<String> iterTreeSet = newTreeSet.iterator();

       while(iterTreeSet.hasNext())
       {
           System.out.println(iterTreeSet.next());
       }

       System.out.println("TreeSet коллекции отсортированы по алфавиту");
       System.out.println("Добавим несколько повторяющихся обьектов в коллекцию.");
       newTreeSet.add("Юра");
       newTreeSet.add("Сергей");
       newTreeSet.add("Иван");
       System.out.println("Размер массива:"+ newTreeSet.size());
       System.out.println("Коллекция также хранит уникальные объекты");
       System.out.println("Самая медленная коллекция.");
   }


}
