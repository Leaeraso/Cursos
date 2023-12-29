package test;

import domain.Person;

public class MatrixTest {
    public static void main(String[] args) {
//        int ages[][] = new int [3][2];
//        System.out.println("ages = " + ages);
//        
//        ages[0][0] = 5;
//        ages[0][1] = 7;
//        ages[1][0] = 10;
//        ages[1][1] = 16;
//        
//        for (int ren = 0; ren < ages.length; ren++){
//            for (int col = 0; col < ages[ren].length; col++){
//                System.out.println("Age [" + ren + "] [" + col + "] = " + ages[ren][col]);
//            }
//        }
        
        String Fruits[][] = {{"Orange","Lemon"},{"Redberry","Banana"}};
        
        print(Fruits);
        
        Person people[][] = new Person[2][3];
        
        people[0][0] = new Person("Manuel");
        people[0][1] = new Person("Julian");
        people[1][0] = new Person("Leandro");
        people[1][2] = new Person("Facundo");
        
        print(people);
       
    }
    
    public static void print(Object matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("[" + i + "] [" + j + "] = " + matrix[i][j]);
            }
        }
    }
}
