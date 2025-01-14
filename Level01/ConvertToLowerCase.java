
import java.util.Scanner;

class ConvertToLowerCase {
    public static String toLowerCaseUser(String one){
        String lowerCase = "";
        for(int i =0;i<one.length();i++){
            if(one.charAt(i)>=65 && one.charAt(i)<=90){
            int ch = one.charAt(i) + 32;
            lowerCase += (char)ch;
            }
            else if(one.charAt(i) == ' '){
            lowerCase += " ";    
            }
            else{
                lowerCase += one.charAt(i);
            }
        }
        return lowerCase;
    }
    public static String toLowerCaseUsingMethod(String one){
        return one.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String in Upper Case");
        String one = input.nextLine();
        String resultUser = toLowerCaseUser(one);
        String resultUsingMethod = toLowerCaseUsingMethod(one);
        System.out.println(resultUser);
        System.out.println(resultUsingMethod);
        if(resultUser.equals(resultUsingMethod)){
            System.out.println("Both are Equal");
        }else{
            System.out.println("Both are not Equal");
        }

    }
}
