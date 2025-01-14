import java.util.Scanner;

public class SubString {
    public static String  usingCharAt(String one , int startIndex , int endIndex){
        String subString = "";
        for(int i = startIndex ; i<endIndex; i++)
        {
            subString += one.charAt(i);
        }
        return subString;
    }
    public static String  usingSubStringMethod(String one , int startIndex , int endIndex){
     String  subString = one.substring(startIndex , endIndex);
     return subString;
    }
    public static boolean Compare(String subString1 , String subString2){

        return subString1.equals(subString2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String one = input.next();
        System.out.println("Enter Start Index");
        int start = input.nextInt();
        System.out.println("Enter End Index");
        int end = input.nextInt();
        String subString1 =  usingCharAt(one, start, end);
        String subString2 = usingSubStringMethod(one, start, end);
        if(Compare(subString1, subString2)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
        input.close();
        

        
    }
}
