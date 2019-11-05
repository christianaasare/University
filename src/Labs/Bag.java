package Labs;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    List<T> bags = new ArrayList<>();

    public void add(T bag){
        this.bags.add(bag);
    }

    public void remove(T bag){
        this.bags.add(bag);
    }

    public void clear(T bag){
        this.bags.add(bag);
    }
}
