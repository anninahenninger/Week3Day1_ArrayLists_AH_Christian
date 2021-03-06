package Advanced_A3;

import java.util.Collections;
import java.util.Comparator;

public class City implements Comparable<City>{

    String name;
    int citizensNum;

    public City(String name, int citizensNum){
        this.name = name;
        this.citizensNum = citizensNum;
    }

    public String getName() {
        return this.name;
    }

    public int getCitizensNum() {
        return this.citizensNum;
    }

    
    @Override
    public int compareTo(City o){
        return this.name.compareTo(o.name);
    }

}
