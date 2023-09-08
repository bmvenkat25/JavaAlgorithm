import java.util.List;
import java.util.TreeMap;

public class DataHandling {
    public static TreeMap<Integer,Integer> getUniqueCount(List<Integer> input) {
        TreeMap<Integer,Integer> lmap = new TreeMap<>();
        for(Integer x : input) {
            int temp = lmap.getOrDefault(x,1);
            if(lmap.put(x,temp) != null)
                lmap.replace(x, ++temp);
        }
        return lmap;
    }
}
