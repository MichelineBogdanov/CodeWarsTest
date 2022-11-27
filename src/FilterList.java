import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FilterList {

    public static List filterList(final List list) {
        // Return the List with the Strings filtered out
        List<?> checkList = new ArrayList<>(list);
        Iterator<?> iterator = checkList.iterator();
        while (iterator.hasNext()) {
            if (!(iterator.next() instanceof Integer)) {
                iterator.remove();
            }
        }
        return checkList;
    }
}
