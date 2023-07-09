package MostImportant.HashMap;
import java.util.*;
public class Introduction {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Ankit",9);
        map.put("Anurag",10);
        map.put("manvi",11);
        map.put("vidisha",12);
        map.put("anushka",13);
        map.put("Anikate",14);
        map.put("yuvraj",15);
        System.out.println(map);

        //remove key in the hashmap
        map.remove("Anikate");
        System.out.println(map);

        //print size of the map
        System.out.println(map.size());

        //map get or default method
        map.put("Ankit",map.getOrDefault("Ankit",1)+1);
        System.out.println(map);

        //searching in hashmap
        if(map.containsKey("Ankit")){
            System.out.println("YEs");
        }else{
            System.out.println("No");
        }
        if(map.containsValue(100)){
            System.out.println("YEs");
        }else{
            System.out.println("No");
        }
        //sort the hashmap
        Map<String,Integer> m=new TreeMap<String, Integer>(map);

        //traversal in map
        for(Map.Entry<String,Integer> e: m.entrySet()){
            System.out.println(e.getKey()+"--->"+e.getValue());
        }
    }
}

// use treemap in place of hashmap for sorting key data 