package Java8Features.lambda;

import java.util.Map;
import java.util.TreeMap;

public class SortingTreemapDescendingOrder {

    public static void main(String[] args) {
        Map<Integer,String> mapEntries=new TreeMap<>((a,b)->b.intValue()-a.intValue());
        mapEntries.put(1,"ashish");
        mapEntries.put(2,"rahul");
        mapEntries.put(7,"rohith");
        mapEntries.put(5,"ganesh");
        mapEntries.put(6,"abhay");

      for(Map.Entry<Integer,String > map:mapEntries.entrySet()){
          System.out.println(map);
      }
    }
}
