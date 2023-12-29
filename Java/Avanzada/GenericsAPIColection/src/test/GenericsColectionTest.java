package test;

import java.util.*;

public class GenericsColectionTest {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Friday");
        
//        String element = myList.get(0);
//        System.out.println("element = " + element);

        //print(myList);

        Set<String> mySet = new HashSet<>();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Friday");

        //print(mySet);
        
        Map<String, String> myMap = new HashMap<>();
        myMap.put("value1", "Jhon");
        myMap.put("value2", "Leandro");
        myMap.put("value3", "Robert");
        myMap.put("value3", "Charles");
        
//        String mapElement = myMap.get("value3");
//        System.out.println("mapElement = " + mapElement);
        
        print(myMap.keySet());
        print(myMap.values());
    }

    public static void print(Collection<String> colection) {
        //ForEach
        for(String element: colection){
            System.out.println("element = " + element);
        }

        //Funcion lambda
//        colection.forEach(element -> {
//            System.out.println("element = " + element);
//        });
    }
}
