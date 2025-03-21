class Construction {
    public static void main(String[] args) {
        Foundation.layFoundation();
    }
}

class Foundation {
    public static void layFoundation() {
        Walls.buildWalls();
    }
}

class Walls {
    public static void buildWalls() {
        Roofing.installRoof();
    }
}

class Roofing {
    public static void installRoof() {
        Painting.paintHouse();
    }
}

class Painting {
    public static void paintHouse() {
        System.out.println("Your house is ready! ");
    }
}