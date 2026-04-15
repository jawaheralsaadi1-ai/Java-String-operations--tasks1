public class Task2StringCompareDemo {
    public static void main(String[] args) {


        //create a String variable with a sample word
        String firstWord= "Programming "; //  Create First variable "Programming Java"
        //Display the original string on the screen
        System.out.println("Original word: " + firstWord);

        //  Display a character at a specific position(by index)
        char thirdLetter = firstWord.charAt(2); //Java start count from 0!
        System.out.println(" The character at position 2 is : " + thirdLetter);

        //Use the substring()
        String middleOfWord = firstWord.substring(0,4);
        System.out.println(" First 4 letters is : " + middleOfWord);

        //Compare Strings
        String theFirstcompareWord = "Coding "; //  Create Second variable "Coding"
        String theSameCompareWord = "Programming "; //  Create Third variable  with same value "Programming"

        // Set case 1  When Compare it with 'Coding'
        boolean equals1 = firstWord.equals(theFirstcompareWord);
        // Display the comparison result on screen
        System.out.println("Compare the original word with: " + theFirstcompareWord);
        //Display Cause 1  the comparison result on the screen
        System.out.println(" Are they Same?: " + false); //(Always false)

        // Set case 2 When Compare it with same String 'Programming'
        boolean equals2 = firstWord.equals(theSameCompareWord);
        // Display the comparison result on screen
        System.out.println("Compare the original word with: " + theSameCompareWord);
        //Display Cause 1  the comparison result on the screen
        System.out.println(" Are they Same?: " + true); //Always True

    }
}