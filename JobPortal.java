class JobPortal {
    public static String register(String email, String password, String fullName, String phoneNumber, String resume, String experience) {
        String registrationStatus = null;
        boolean isUserValid = validateUser(email, password, fullName, phoneNumber, resume, experience);
        if (isUserValid) {
            registrationStatus = "Registration successful. Welcome to JobPortal!";
        } else {
            registrationStatus = "Registration unsuccessful, please try again.";
        }
        return registrationStatus;
    }

    public static boolean validateUser(String email, String password, String fullName, String phoneNumber, String resume, String experience) {
        boolean isUserValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isFullNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isResumeValid = false;
        boolean isExperienceValid = false;

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

        if (phoneNumber != null && phoneNumber.length() == 10 && !phoneNumber.isEmpty()) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone number is invalid. Please enter a valid phone number.");
        }

        if (resume != null && resume.length() > 0) {
            isResumeValid = true;
        } else {
            System.out.println("Resume is invalid. Please upload a valid resume.");
        }

        if (experience != null && experience.length() > 0) {
            isExperienceValid = true;
        } else {
            System.out.println("Experience details are invalid. Please provide valid experience details.");
        }

        if (isEmailValid && isPasswordValid && isFullNameValid && isPhoneNumberValid && isResumeValid && isExperienceValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
