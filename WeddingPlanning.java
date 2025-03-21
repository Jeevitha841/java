class WeddingPlanning {
    public static void main(String[] args) {
        VenueSelection.chooseVenue();
    }
}

class VenueSelection {
    public static void chooseVenue() {
        Invitations.sendInvites();
    }
}

class Invitations {
    public static void sendInvites() {
        Decorations.setupDecorations();
    }
}

class Decorations {
    public static void setupDecorations() {
        Ceremony.startCeremony();
    }
}

class Ceremony {
    public static void startCeremony() {
        System.out.println("The wedding ceremony has begun! ");
    }
}