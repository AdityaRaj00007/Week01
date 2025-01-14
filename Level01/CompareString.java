import java.util.Scanner;
class CompareString {
    
    public static boolean usingCharAt(String one , String two){
    if(one.length()!=two.length()){
        return false;
    }    
    for(int i = 0; i<one.length();i++){
        if(one.charAt(i)!=two.charAt(i)){
            return false;
        }
    }
    return true;
    }
    public static boolean usingequalsmethod(String one , String two){
        return one.equals(two);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String one");
        String one = input.next();
        System.out.println("Enter String two");
        String two = input.next();
        System.out.println("using CharAt");
        System.out.println(usingCharAt(one, two));
        System.out.println("using Equals Method");
        System.out.println(usingequalsmethod(one, two));
        boolean resultOfCharAt = usingCharAt(one, two);
        boolean resultOfEquals = usingequalsmethod(one, two);
        if(resultOfCharAt==resultOfEquals){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
        input.close();
    }
}