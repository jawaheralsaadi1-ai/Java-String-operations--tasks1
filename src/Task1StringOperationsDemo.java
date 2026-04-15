

public class Task1StringOperationsDemo {
    public static void main (String[] args){
        String customerName = "Jawaher.java";//  Create First variable "Jawaher java"
        //Display the original string on the screen
        System.out.println("Original Name: " + customerName);
       int nameLength = customerName.length(); // Use the length() method
        System.out.println("Character Count: " + nameLength);//Display the number of characters in the string
        System.out.println("UpperCase: " + customerName.toUpperCase());//Display the string in uppercase
        System.out.println("LowerCase: " + customerName.toLowerCase());//Display the string in lowercase
        String companyName = " Codeline";//  Create Second variable "Codeline"
        System.out.println("Final combined string: " + customerName.concat(companyName));// Use the concat() method to join both strings




    }
}
