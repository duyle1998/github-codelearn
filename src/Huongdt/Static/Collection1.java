package Huongdt.Static;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("samsung",2000.0);
        map.put("Nokia",1000.0);
        map.put("ssss",3000.0);
        map.put("iphone",2000.0);
        map.put("samsung",1000.0);

      Set set = map.keySet();
      for(Object key : set){
          System.out.println(key + " "+map.get(key));
      }

    }

}
