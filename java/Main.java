public class Main {

    private static Garage garage1 = new Garage();

    public static void main(String[] args) {
    Bil b1 = new Benzin("Benzin", 95, 20, "AT324234HS", "Audi", "A6", 1978, 5);
    Bil b2 = new Dieselbil("Diesel", false, 21, "AT435345JD", "BMW", "520D", 2020, 5);
    Bil b3 = new Elbil("Elbil", 80.5, 567.5, 0.078125,"AT3242342HS", "BMW", "760LI", 2017, 5);

     Garage.addBil(b1);
     Garage.addBil(b2);
     Garage.addBil(b3);

        System.out.println(garage1);
        System.out.println("Sum af afgift;" + garage1.beregnGrønAfgiftForBilpark());

    }

    }

