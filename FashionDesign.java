class FashionDesign {
    public static void main(String[] args) {
        Sketching.createSketches();
    }
}

class Sketching {
    public static void createSketches() {
        MaterialSelection.chooseMaterials();

    }
}

class MaterialSelection {
    public static void chooseMaterials() {
        Tailoring.sewOutfits();
    }
}

class Tailoring {
    public static void sewOutfits() {
        RunwayShow.presentCollection();
    }
}

class RunwayShow {
    public static void presentCollection() {
        System.out.println("The fashion show is a success!");
    }
}