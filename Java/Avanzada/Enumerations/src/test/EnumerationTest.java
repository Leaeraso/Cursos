package test;

import enumerations.Continents;
import enumerations.Days;

public class EnumerationTest {
    public static void main(String[] args) {
        //System.out.println("Fisrt day of the week: " + Days.MONDAY);
        //printDayOfTheWeek(Days.WEDNESDAY);
        
        System.out.println("Continent number 4th: " + Continents.AMERICA);
        System.out.println("Countries of the 4th Continent: " + Continents.AMERICA.getCountries());
    }
    
    private static void printDayOfTheWeek(Days days){
        switch(days){
            case MONDAY:
                System.out.println("Fisrt day of the week: " + Days.MONDAY);
                break;
            case TUESDAY:
                System.out.println("Second day of the week: " + Days.TUESDAY);
                break;
            case WEDNESDAY:
                System.out.println("Third day of the week: " + Days.WEDNESDAY);
                break;
            case THURSDAY:
                System.out.println("Fourth day of the week: " + Days.THURSDAY);
                break;
            case FRIDAY:
                System.out.println("Fifth day of the week: " + Days.FRIDAY);
                break;
            case SATURDAY:
                System.out.println("Sixth day of the week: " + Days.SATURDAY);
                break;
            case SUNDAY:
                System.out.println("Last day of the week: " + Days.SUNDAY);
                break;
        }
    }
}
