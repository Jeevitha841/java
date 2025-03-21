class Microsoft {
    public static String register(String email, String password, String fullName, String phoneNumber, String address) {
        String registrationStatus = null;
        boolean isUserValid = validateUser(email, password, fullName, phoneNumber, address);
        if (isUserValid) {
            registrationStatus = "Registration successful. Welcome to Microsoft!";
        } else {
            registrationStatus = "Registration unsuccessful, please try again.";
        }
        return registrationStatus;
    }

    public static boolean validateUser(String email, String password, String fullName, String phoneNumber, String address) {
        boolean isUserValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isFullNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isAddressValid = false;

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

        if (address != null && address.length() > 0) {
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid. Please enter a valid address.");
        }

        if (isEmailValid && isPasswordValid && isFullNameValid && isPhoneNumberValid && isAddressValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
