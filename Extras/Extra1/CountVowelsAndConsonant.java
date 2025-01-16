import java.util.Scanner;

public class CountVowelsAndConsonant {
    //Method to find the number of Vowels and Consonant
    public static int[] numberOfVowelsAndConsonant(String one){
        one = one.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i = 0 ;i<one.length();i++){
            //Check if Character id Vowels or not
            if(one.charAt(i) == 'a' || one.charAt(i) == 'e' || one.charAt(i) == 'i' || one.charAt(i) == 'o'|| one.charAt(i) == 'u' ){
              vowels++;
            }
            else{
                consonants++;
            }
        }
        return new int []{vowels , consonants};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String one = input.nextLine();
        int [] result = numberOfVowelsAndConsonant(one);
        System.out.println("Number of Vowels are " + result[0]);
        System.out.println("Number of Consonants are " + result[1]);
        input.close();
    }
}
