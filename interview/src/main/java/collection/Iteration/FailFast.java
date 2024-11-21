package collection.Iteration;

import java.util.*;
import java.util.List;

public class FailFast {
    public static void main(String[] args) {
        List<String> listOfEmployee=new ArrayList<>();
        listOfEmployee.add("ashish");
        listOfEmployee.add("rohith");
        listOfEmployee.add("manish");
        listOfEmployee.add("abhay");

        java.util.Iterator<String> iterator=listOfEmployee.iterator();


        while (iterator.hasNext()) {
            String ele=iterator.next();
            if(ele=="manish") {
                listOfEmployee.add("john");
            }
        }



        }

    }

