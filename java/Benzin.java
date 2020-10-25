public class Benzin extends Bil {

    private String typeBil;
    private int oktanTal;
    private int kmPrL;




    public Benzin(String typeBil, int oktanTal, int kmPrL, String regNr,String mærke, String model, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);

        this.typeBil = typeBil;
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;

    }

    public void setTypeBil(String typeBil) {
        this.typeBil = typeBil;
    }


    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public String getTypeBil() {
        return typeBil;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }


    @Override
    public String toString() {
        return "Benzin{" +
                "typeBil='" + typeBil + '\'' +
                ", oktanTal=" + oktanTal +
                ", kmPrL=" + kmPrL +
                ", regNr='" + regNr + '\'' +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                '}';
    }

    @Override
    protected double beregnGrønEjerafgift() {
        if (kmPrL >= 20 && kmPrL < 50) {
            return 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            return 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            return 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return 5500;
        } else if (kmPrL < 5) ;
        {
            return 10470;
        }

    }
}



