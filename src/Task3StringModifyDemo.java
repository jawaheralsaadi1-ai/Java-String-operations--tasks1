public class Task3StringModifyDemo {
    public static void main(String[] args) {


        //create a String variable with a sample word
        String customerCom= "It had a amazing Experience!! "; //  Create First variable "It had a nice Experience!! "
        //Display the original string
        System.out.println("Original String  : ["+ customerCom +"]");

        // remove leading and trailing spaces using trim() method
        String cleanComment = customerCom.trim();//  Create Second variable
        System.out.println("Trimming String  : ["+ cleanComment + "]");

        //Use the ontains()
        String specificWord = "Oman"; //Always false
        boolean hadWord = cleanComment.contains(specificWord);
        //Display the result of the search on the screen
        System.out.println(" Dose the customer comment contain "  + specificWord +"?"   + hadWord);
         //Use the replace() method
        String replaceWord = customerCom.replace("amazing", "spectacular");
          //Display the updated string on the screen
        System.out.println(" String after the update! :[ " + replaceWord +"]");

    }

}
