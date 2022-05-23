import java.util.ArrayList;
import java.util.List;
class ForEachEg {

public static void main(String[] args) {
List<String> flower = new ArrayList<String>();
flower.add("Rose");
flower.add("Jasmine");
flower.add("Sunflower");
flower.add("MariGold");
flower.add("Lilly");
flower.forEach(display->System.out.println(display));//iterating using lambda expression
flower.forEach(System.out::println);  //iterating with method reference
}
}