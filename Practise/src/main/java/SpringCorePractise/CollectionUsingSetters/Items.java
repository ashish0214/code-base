package SpringCorePractise.CollectionUsingSetters;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Items {
    int id;
    List<String> items;
    Set<String> names;
    Map<Integer,String> element;

    public void setId(int id) {
        this.id = id;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public void setElement(Map<Integer, String> element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", items=" + items +
                ", names=" + names +
                ", element=" + element +
                '}';
    }
}
