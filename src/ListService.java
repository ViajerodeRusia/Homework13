import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListService {
    //TODO: Метод к задаче 1
    public static void oddNumber(List<Integer> list) {
        IntStream.range(0, list.size()).
                filter(i -> !(list.get(i) % 2 == 0))
                .mapToObj(i -> list.get(i) + " ")
                .forEach(System.out::print);
    }
    //TODO: Метод к задаче 2
    public static void oddAscending(List<Integer> list) {
        Collections.sort(list);
        HashSet formattedList = IntStream.range(0, list.size()).
                filter(i -> list.get(i) % 2 == 0)
                .mapToObj(list::get)
                .collect(Collectors.toCollection(HashSet::new));//уникалньные объекты без порядка
        System.out.println(formattedList);
    }
    //TODO: Метод к задаче 3
    public static void uniqueWords(List<String> list) {
        Collections.sort(list);
        TreeSet formattedList = new TreeSet<>(); //TreeSet хранит элементы в виде упорядоченного дерева
        formattedList.addAll(list);
        System.out.println(formattedList);
    }
    //TODO: Метод к задаче 4 - это надо додумать еще.
    public static void dublicateCount(List<String> list) {

        Set formattedHashList = new HashSet<>();
        formattedHashList.addAll(list);

        List<String> formattedList = new ArrayList<>();
        formattedList.addAll(formattedHashList); //LeetCode - сборник задач

        for (int i = 0; i < formattedList.size(); i++) {
            System.out.println("Слово " + formattedList.get(i) + " встречается " + Collections.frequency(list, formattedList.get(i)) + " раз");
        }
    }
}
