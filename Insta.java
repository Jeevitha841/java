class Insta{
    public static String register(String email, String password, String fullName, String username, String phoneNumber) {
        String registrationStatus = null;
        boolean isUserValid = validateUser(email, password, fullName, username, phoneNumber);
        if (isUserValid) {
            registrationStatus = "Registration successful. Welcome to Instagram!";
        } else {
            registrationStatus = "Registration unsuccessful, please try again.";
        }
        return registrationStatus;
    }

    public static boolean validateUser(String email, String password, String fullName, String username, String phoneNumber) {
        boolean valid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isFullNameValid = false;
        boolean isUsernameValid = false;
        boolean isPhoneNumberValid = false;

        if (email != null && email.contains("@") && email.contains(".") && email.length() <= 50 && !email.isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid. Please enter a valid email address.");
        }

        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password is invalid. Please enter a valid password.");
        }

        if (fullName != null && !fullName.isEmpty() && fullName.length() <= 50) {
            isFullNameValid = true;
        } else {
            System.out.println("Full name is invalid. Please enter a valid full name.");
        }

        if (username != null && !username.isEmpty() && username.length() <= 30) {
            isUsernameValid = true;
        } else {
            System.out.println("Username is invalid. Please enter a valid username.");
        }

        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone number is invalid. Please enter a valid phone number.");
        }

        if (isEmailValid && isPasswordValid && isFullNameValid && isUsernameValid && isPhoneNumberValid) {
            valid = true;
        }

        return valid;
    }
}
