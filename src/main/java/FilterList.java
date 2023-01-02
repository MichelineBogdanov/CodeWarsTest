
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FilterList {

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add("1");
        objects.add('w');
        objects.add(LocalTime.now());
        objects.add(12L);
        objects.add(12);
        objects.add(new Object());

        for (Object o : filterList(objects)) {
            System.out.println(o);
        }
    }

    public static List<?> filterList(List<?> list) {
        // Return the List with the Strings filtered out
        list.removeIf(o -> !(o instanceof Integer));
        return list;
    }
}
