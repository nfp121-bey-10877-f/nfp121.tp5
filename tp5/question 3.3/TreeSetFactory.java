package question3;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFactory <T> implements Factory <TreeSet>{
    
    public TreeSet create()
    {
        return new TreeSet<T>();
    }

}
