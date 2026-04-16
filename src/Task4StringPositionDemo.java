public class Task4StringPositionDemo {
    public static void main(String[] args) {


        //create a String variable with a sample word
        String logEntry = "java_String_operation.pdf"; //  Create First variable "It had a nice Experience!! "
        //Display the original string
        System.out.println("Original String  : ["+ logEntry+"]");

         //Use the indexOf() method
          int fileType = logEntry.indexOf("pdf") ;//  Create Second variable
        //Display the position result
        System.out.println("The position of 'pdf' :["+fileType+ "]");

        //Use the startsWith()
        String startWithThe = "java";//Always True
        boolean theWord = logEntry.startsWith(startWithThe);
        //Display the result of the search on the screen
        System.out.println(" Dose the File Name contain "  + startWithThe +"?\t"+ theWord);
        //Use the startsWith()
        String endtWithPdf = ".pdf";//Always True
        boolean pdfWord = logEntry.endsWith(endtWithPdf);
        //Display the result of the search on the screen
        System.out.println(" Dose the File End with "  + endtWithPdf+"?\t"+ pdfWord);
        //Use the replace() method



}
}
