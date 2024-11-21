package collection.comparator;

import java.util.Comparator;

public class Example implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Employees emp1=(Employees) obj1;
        Employees emp2=(Employees) obj2;

        return emp1.getAge()-emp2.getAge();
    }
}
