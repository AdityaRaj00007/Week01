import java.util.Scanner;
class LengthCount {
    //Method to count length of String 
    public static int findLength(String one){
        int count = 0;
        try{
            // Infinite Loop to count the length
            while (true) { 
                one.charAt(count);
                count++;
            }           
        } catch(IndexOutOfBoundsException e){ // Handles runtime exception and return count
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String one = input.nextLine();
        System.out.println("The Length of String is " + findLength(one));
    }
}