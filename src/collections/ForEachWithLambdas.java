package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithLambdas {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("lemon");
    fruits.add("banana");
    fruits.add("orange");

    // fruits.forEach(f -> System.out.println(f));
    fruits.forEach(System.out::println);

    fruits.forEach(f -> {
      f = "fruits: " + f;
      System.out.println(f);
    });

    Map<String, Integer> fruitCalories = new HashMap<>();
    fruitCalories.put("apple", 95);
    fruitCalories.put("lemon", 20);
    fruitCalories.put("banana", 105);
    fruitCalories.put("orange", 45);

    fruitCalories.forEach((key, value) -> System.out.println(key + ": " + value));
  }
}
