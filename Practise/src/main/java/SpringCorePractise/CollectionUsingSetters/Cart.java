package SpringCorePractise.CollectionUsingSetters;

public class Cart {
    int cart_id;
    Items item_List;

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public Items getItem_List() {
        return item_List;
    }

    public void setItem_List(Items item_List) {
        this.item_List = item_List;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart_id=" + cart_id +
                ", item_List=" + item_List +
                '}';
    }
}
