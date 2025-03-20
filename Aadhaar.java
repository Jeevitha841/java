class Aadhaar{
    public static String register(String aadhaarNumber, String fullName, String dateOfBirth, String address, String phoneNumber) {
        String registrationStatus = null;
        boolean isUserValid = validateUser(aadhaarNumber, fullName, dateOfBirth, address, phoneNumber);
        if (isUserValid) {
            registrationStatus = "Registration successful. Welcome to Aadhaar!";
        } else {
            registrationStatus = "Registration unsuccessful, please try again.";
        }
        return registrationStatus;
    }

    public static boolean validateUser(String aadhaarNumber, String fullName, String dateOfBirth, String address, String phoneNumber) {
        boolean isUserValid = false;
        boolean isAadhaarNumberValid = false;
        boolean isFullNameValid = false;
        boolean isDateOfBirthValid = false;
        boolean isAddressValid = false;
        boolean isPhoneNumberValid = false;

        if (aadhaarNumber != null && aadhaarNumber.length() == 12) {
            isAadhaarNumberValid = true;
        } else {
            System.out.println("Aadhaar number is invalid. Please enter a valid Aadhaar number.");
        }

        if (fullName != null && fullName.length() > 0 && fullName.length() <= 50) {
            isFullNameValid = true;
        } else {
            System.out.println("Full name is invalid. Please enter a valid full name.");
        }

        if (dateOfBirth != null && !dateOfBirth.isEmpty() ) {
            isDateOfBirthValid = true;
        } else {
            System.out.println("Date of birth is invalid. Please enter a valid date .");
        }

        if (address != null && address.length() > 0) {
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid. Please enter a valid address.");
        }

        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone number is invalid. Please enter a valid phone number.");
        }

        if (isAadhaarNumberValid && isFullNameValid && isDateOfBirthValid && isAddressValid && isPhoneNumberValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
