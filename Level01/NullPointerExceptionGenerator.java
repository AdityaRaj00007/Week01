public class NullPointerExceptionGenerator {

    public static char generateNullPointerException(String one) {
        return one.charAt(0);
    }

    public static void handleNullPointerException(String one) {
        try {
            generateNullPointerException(one);
        } catch (NullPointerException e) {
            System.out.println(e + "\nUsing Try-Catch we have handled the RuntimeException ");
        }
    }

    public static void main(String[] args) {
        String one = null;

        // Directly generating the exception
        try {
            generateNullPointerException(one);
        } catch (NullPointerException e) {
            System.out.println(e + "\nException occurred while calling generateNullPointerException function ");
        }
        System.out.println();
        // Refactored to handle the exception
        handleNullPointerException(one);
    }
}
