import java.util.ArrayList;

public class Garage {

    static ArrayList<Bil> biler = new ArrayList<Bil>();
    public static void addBil(Bil bil){
        biler.add(bil);

    }
    public double beregnGrønAfgiftForBilpark(){
        double SumAfAfgift = 0;

        for(Bil bil:biler){
            SumAfAfgift += bil.beregnGrønEjerafgift();
        }
        return SumAfAfgift;
    }

    public String toString() {
        String result = "";

        for (Bil i : biler) {

            result += "\n" + i;

        }

        return result;

    }

}
