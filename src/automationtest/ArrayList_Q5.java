package automationtest;

import java.util.ArrayList;

/**
 * /*Question:5 - Marks:4
 * 5.1 Create the class with the name "ArrayList_Q5"
 * 5.2	Create the main method
 * 5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
 * 5.4 Print the list using a forEach loop.
 * OutPut
 * Scrum
 * Java
 * Jira
 * Selenium
 * Cucumber
 * Postman
 * Rest Assured
 * */
public class ArrayList_Q5 {
    public static void main(String[] args) {
        // Declaring an array list with given names
        ArrayList<String> names = new ArrayList<>();
        names.add("Scrum");
        names.add("Java");
        names.add("Jira");
        names.add("Selenium");
        names.add("Cucumber");
        names.add("Postman");
        names.add("Rest Assured");

        //Declaring for each loop
        for (String p:names) {
            System.out.println(p);
        }
    }
}