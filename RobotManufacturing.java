class RobotManufacturing {
    public static void main(String[] args) {
        Designing.designRobot();
    }
}

class Designing {
    public static void designRobot() {
        Assembly.assembleParts();
    }
}

class Assembly {
    public static void assembleParts() {
        Programming.codeRobot();
    }
}

class Programming {
    public static void codeRobot() {
        Testing.testRobot();
    }
}

class Testing {
    public static void testRobot() {
        System.out.println("The robot is fully operational!");
    }
}