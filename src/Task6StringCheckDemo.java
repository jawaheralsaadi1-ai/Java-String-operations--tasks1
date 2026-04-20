//Task 6: Extract, Replace,
// and Check Text in Java Strings
public class Task6StringCheckDemo {
    public static void main(String[] args){
        // Create A String variable for testing
        String message = "Java programming is Fun";
        // Display Original String
        System.out.println("  Original messages : [" + message + "]");

        // Using substring() Method to cut Strings
        String subMessage = message.substring(4); // Store from index 4 to end
        // Display String from index 4 to end
        System.out.println("  The message after remove 'Java'  : [" + subMessage + "]");

        //Using replace() method to change one word int the String
        // change word 'Fun' with 'Boring'
        String repWordFun = message.replace("Fun", "Boring");
        // Display The updated String
        System.out.println("  The message after replace words  : [" + repWordFun + "]");

        // Using contians() method to check whether message have a specific word
        // check if  message  has 'java' word
        boolean hasJava = message.contains("Java");
        //Display the Result of the check
        System.out.println(" \n Dose message contians 'Java' word ? " + hasJava );

        // Using charAt() method to display character at a specific position
        //
        char firstLetter = message.charAt(0); // Specific position of first Letter
       char lastLetter = message.charAt(message.length() - 1); // Specific position  of last Letter
        // Display the characters
        System.out.println("\nThe character at first index is :\t" + firstLetter );
        System.out.println("The character at last  index is :\t" + lastLetter );

        // Create New Sting Variable
        String newMessage = "   Welcome to java word  ";
        //Using trim() and length() methods
         String cleanMessage = newMessage.trim();
         int  messageLength = newMessage.length();
        // Display the Updates in one line
        System.out.println("\nThe Clean message is:[" + cleanMessage +"]" + "\tWITH Length : ["+ messageLength + "]");

    }
}
