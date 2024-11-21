package collection.Iteration;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {
        List<String> ele = new CopyOnWriteArrayList<>();
        ele.add("ashish");
        ele.add("rohith");
        ele.add("manish");
        ele.add("abhay");

        Iterator<String> iterator = ele.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element == "manish") {
                ele.add("ravi");
            }
        }
    }
}
