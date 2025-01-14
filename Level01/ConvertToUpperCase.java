
import java.util.Scanner;

public class ConvertToUpperCase {
    public static String toUpperCaseUser(String one){
    String upperCase = "";
    for(int i = 0;i<one.length();i++){
    if(one.charAt(i)>= 97 &&  one.charAt(i)<=122){
     int ch = one.charAt(i) - 32;
     upperCase += (char)ch;
      }
    else if(one.charAt(i) == ' '){
      upperCase += " ";
      }
    else{
        upperCase += one.charAt(i);
    }
     }
    return upperCase;
    }
    public static String toUpperCaseUsingMethod(String one){
        return one.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String in Lower Case");
        String one = input.nextLine();
        String resultUserDefind = toUpperCaseUser(one);
        String resultUsingMethod = toUpperCaseUsingMethod(one);
        System.out.println(toUpperCaseUser(one));
        System.out.println(toUpperCaseUsingMethod(one));
        if(resultUserDefind.equals(resultUsingMethod)){
            System.out.println("Both are Equal");
        }else{
            System.out.println("Both are Not Equal");
        }
    }
}
