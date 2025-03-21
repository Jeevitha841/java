class CoffeeMachine {
    public static void main(String[] args) {
        Grinding.grindBeans();
    }
}

class Grinding {
    public static void grindBeans() {
        Brewing.brewCoffee();
    }
}

class Brewing {
    public static void brewCoffee() {
        AddingMilk.addMilk();
    }
}

class AddingMilk {
    public static void addMilk() {
        Serving.serveCoffee();
    }
}

class Serving {
    public static void serveCoffee() {
        System.out.println("Your fresh cup of coffee is ready!");
    }
}