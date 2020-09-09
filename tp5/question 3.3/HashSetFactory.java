package question3;

import java.util.Set;
import java.util.HashSet;

public class HashSetFactory <T> implements Factory<HashSet>{
    
    public HashSet <T> create()
    {
        return new HashSet<T>();
    }

}