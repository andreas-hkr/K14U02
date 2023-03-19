public class Main {
    public static void main(String[] args) {
        // Lägg till två till metoder i Punkt klassen:
        //   moveHorisontal = positiv parameter --> flytt till höger
        //   moveVertical   = positiv parameter --> flytt uppåt


    }
}

class Punkt {
    double x;
    double y;

    double distance() {
        return Math.sqrt(x*x + y*y);
    }
}