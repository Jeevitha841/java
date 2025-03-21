class Gardening {
    public static void main(String[] args) {
        SoilPreparation.prepareSoil();
    }
}

class SoilPreparation {
    public static void prepareSoil() {
        Planting.plantSeeds();
    }
}

class Planting {
    public static void plantSeeds() {
        Watering.waterPlants();
    }
}

class Watering {
    public static void waterPlants() {
        Harvesting.harvestCrops();
    }
}

class Harvesting {
    public static void harvestCrops() {
        System.out.println("The garden is full of fresh produce! ");
    }
}