package automationtest;

/**
 *Question:4 - Marks:4
 4.1 Create the class with the name "ForLoop_Q4"
 4.2 Create a method with the name "printMyName" with no return type and two parameters with the type string and name "name" and int type name 'howManyTime'.
 4.3 Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
 4.4 Create the main method
 4.5 Create the Object and call the 'printMyName' method into the main method.
 OutPut
 howManyTime = 10 it will print your name 10 times
 howManyTime = 15 it will print your name 15 times
 */
public class ForLoop_Q4 {

    public void printMyName(String name, int howManytime) {
        System.out.println("howManyTime = " + howManytime + " it will print " + name + " "+ howManytime + " times");
        for (int i=1; i<=howManytime;i++) {
            System.out.println((i+0) + "." + name);
            }
        }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("Bindi", 10);
        obj.printMyName("Bindi", 15);
    }
}
