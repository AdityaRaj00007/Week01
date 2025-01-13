class OTPGenerator{

    //method to generate a 6-digit OTP
    public static int generateOTP() {
    int otp = (int) (Math.random() * 900000) + 100000;
	
		return otp;
    }

    //method to ensure otp's are unique
    public static boolean validateUniqueOTPs(int[] otps){
		
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
				//check if any two OTPs are the same and return result
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
		
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs ");
        for (int otp : otps) {
            System.out.println(otp);
        }

        boolean isUnique = validateUniqueOTPs(otps);
        System.out.println("Are all OTPs unique? " + (isUnique ? "Yes" : "No"));
    }
}
