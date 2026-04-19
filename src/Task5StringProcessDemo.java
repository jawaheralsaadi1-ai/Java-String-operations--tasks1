

/*
   Task 5: Compare, Split, and Clean Text Using Java String Methods
   * */
public class Task5StringProcessDemo {

        public static void main(String[] args) {


            //create  employee record | Format : ID, Name, Department
            String empRecord = "    A1001, Omar Al-Offii, IT "; //  Create First variable with extra space
            //Display the original string on the screen
            System.out.println("Original Record: [" +empRecord+"]");
            //  Display a character at a specific position(by index)
            String cleanRecord  = empRecord.trim(); //Java start count from 0!
            System.out.println(" Clean Record : [" + cleanRecord + "]");

            //Use the split() | Split the record into array using comma
            String[] recordParts = cleanRecord.split(",");
            System.out.println("\n\t _____spliting record Parts ___");
            System.out.println(" Employee ID  : " + recordParts[0].trim());
            System.out.println(" Employee Name : " + recordParts[1].trim());
            System.out.println(" Department : " + recordParts[2].trim());
              //

            String word1 = "JAVA";
            String word2 = "java";
            System.out.println("\n\t _____Compare two words ___");
            System.out.println(" Word 1 : " + word2);
            System.out.println(" Word 2 : " + word1);
            boolean areSame = word1.equalsIgnoreCase(word2);
            System.out.println(" Are they the same(ignoring case)? : " +areSame);
          // using Empty() | Check if a String is empty

            String emptyText = "";
            System.out.println("\n\t _____Check Text Empty or not ___");
            System.out.println(" The text is :  " + emptyText);
            System.out.println(" Is the text empty? : " +emptyText.isEmpty());


        }
}
