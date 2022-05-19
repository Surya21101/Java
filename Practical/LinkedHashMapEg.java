import java.util.LinkedHashMap;
import java.util.Map;
class LinkedHashMapEg {
public static void main(String[] args) {
LinkedHashMap<Integer,String> map1 = new LinkedHashMap<Integer,String>();	
map1.put(101, "Mango");
map1.put(108, "Orange");
map1.put(105, "Banana");
map1.put(103, "Grapes");
map1.put(105, "Banana");
map1.put(null, null);
map1.put(102, null);
map1.put(null, "Apple");
map1.putIfAbsent(102,"CustardApple");
map1.putIfAbsent(101, "Watermelon");
for (Map.Entry m : map1.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());	
}
map1.remove(103);
System.out.println("After Removal");
for (Map.Entry m : map1.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());
}
}
}