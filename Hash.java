import java.util.*;
public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 10);
        map.put("china", 50);
        map.put("japan", 80);
        System.out.println(map);
//        System.out.println(map.get("china"));
//        if(map.containsKey("india")){
//            System.out.println("key is present");
//        }else {
//            System.out.println("key is not presnt");
//        }
        for (Map.Entry<String, Integer> E : map.entrySet()) {
            System.out.println(E.getKey());
            System.out.println(E.getValue());
        }
        Set<String>keys=map.keySet();
        for (String key:keys){
            System.out.println(key+" "+ map.get(key));
        }

   }


}
