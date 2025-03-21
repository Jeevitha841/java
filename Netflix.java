class Netflix {
    public static String register(String email, String password, String fullName, String phoneNumber, String creditCardNumber) {
        String registrationStatus = null;
        boolean isUserValid = validateUser(email, password, fullName, phoneNumber, creditCardNumber);
        if (isUserValid) {
            registrationStatus = "Registration successful. Welcome to Netflix!";
        } else {
            registrationStatus = "Registration unsuccessful, please try again.";
        }
        return registrationStatus;
    }

    public static boolean validateUser(String email, String password, String fullName, String phoneNumber, String creditCardNumber) {
        boolean isUserValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isFullNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isCreditCardValid = false;

        if (email != null && email.contains("@") && email.contains(".") && email.length() <= 50) {
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid. Please enter a valid email address.");
        }

        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password is invalid. Please enter a valid password.");
        }

        if (fullName != null && fullName.length() > 0 && fullName.length() <= 50) {
            isFullNameValid = true;
        } else {
            System.out.println("Full name is invalid. Please enter a valid full name.");
        }

        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone number is invalid. Please enter a valid phone number.");
        }

        if (creditCardNumber != null && creditCardNumber.length() == 16) {
            isCreditCardValid = true;
        } else {
            System.out.println("Credit card number is invalid. Please enter a valid credit card number.");
        }

        if (isEmailValid && isPasswordValid && isFullNameValid && isPhoneNumberValid && isCreditCardValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
