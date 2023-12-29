package test;

import java.util.*;

public class ColectionTest {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");

        //print(myList);

        Set mySet = new HashSet();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");

        //print(mySet);
        
        Map myMap = new HashMap();
        myMap.put("value1", "Jhon");
        myMap.put("value2", "Leandro");
        myMap.put("value3", "Robert");
        
        print(myMap.keySet());
        print(myMap.values());
    }

    public static void print(Collection colection) {
        //ForEach
//        for(Object element: colection){
//            System.out.println("element = " + element);
//        }

        //Funcion lambda
        colection.forEach(element -> {
            System.out.println("element = " + element);
        });
    }
}
