import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        List<Integer> listOfElements = new ArrayList<Integer>();
        for (int i : elements) {
            listOfElements.add(i);
        }
        Iterator<Integer> it = listOfElements.iterator();
        for (int i = 0; i < listOfElements.size() - 1; i++) {
            int count = 0;
            for (int j = i; j < listOfElements.size(); j++) {

            }

        }
        return new int[9];
    }
}
