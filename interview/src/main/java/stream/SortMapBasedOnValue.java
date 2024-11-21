package stream;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapBasedOnValue {
    public static void main(String[] args) {
        Map<String,Integer> element=new HashMap<>();
        element.put("snake",3);
        element.put("monkey",7);
        element.put("rat",8);
        element.put("ant",1);
        element.put("tiger",3);
        element.put("snake",9);

        //other way by using comparator for sorting
        Map<String,Integer> sortedMap=element.entrySet().stream().sorted((ele1,ele2)-> ele1.getValue()-ele2.getValue())
                .collect(Collectors.toMap(x->x.getKey(),x->x.getValue(),(x,y)->y, LinkedHashMap::new));

        for(Map.Entry ele: sortedMap.entrySet()){
            System.out.println(ele);
        }

        //sort using inbuilt method in the Map.Entry.comapering comparingByValue(it can take Comparator alsoand its method.reverseorder)
        //
//        Map<String,Integer> sortedMap1=element.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .collect(Collectors.toMap(x->x.getKey(),x->x.getValue(),(x,y)->y, LinkedHashMap::new));



        //Sort by using Normal way

        List<Map.Entry<String,Integer>> sortedMapByNormal=new ArrayList<>(element.entrySet());
        sortedMapByNormal.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String,Integer> sortedElements=new LinkedHashMap<>();
        for(Map.Entry ele:sortedMapByNormal){
            sortedElements.put((String)ele.getKey(),(Integer) ele.getValue());


        }
    }
}
