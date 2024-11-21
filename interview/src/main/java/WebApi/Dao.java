package WebApi;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Dao {
    List<String> names=new ArrayList<>();
//   names.add("John");
//    names.add("Doe");
//    names.add("Jane");

    public List<String> getNames(){
        return names;
    }

}
