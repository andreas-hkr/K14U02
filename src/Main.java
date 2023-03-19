public class Main {
    public static void main(String[] args) {
        // Lägg till två till metoder i Punkt klassen:
        //   moveHorisontal = positiv parameter --> flytt till höger
        //   moveVertical   = positiv parameter --> flytt uppåt

        Punkt p = new Punkt();
        p.x = 5;
        p.y = 3;

        System.out.format("x=%.2f  y=%.2f%n", p.x, p.y);

        p.moveHorisontal(3);
        p.moveVertical(2);

        System.out.format("x=%.2f  y=%.2f%n", p.x, p.y);
    }
}

class Punkt {
    double x;
    double y;

    double distance() {
        return Math.sqrt(x*x + y*y);
    }

    void moveHorisontal(double d) {
        x += d;
    }

    void moveVertical(double d) {
        y += d;
    }
}