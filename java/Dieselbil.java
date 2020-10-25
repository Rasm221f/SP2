public class Dieselbil extends Bil {

    private String typeBil;
    private Boolean harpartikelFilter;
    private int kmPrL;

    public Dieselbil(String typeBil, boolean harpartikelFilter, int kmPrL, String regNr, String mærke, String model, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.typeBil = typeBil;
        this.harpartikelFilter = harpartikelFilter;
        this.kmPrL = kmPrL;
    }

    public void setTypeBil(String typeBil) {
        this.typeBil = typeBil;
    }


    public Boolean getPartikelFilter() {
        return harpartikelFilter;
    }

    public void setPartikelFilter(Boolean partikelFilter) {
        this.harpartikelFilter = partikelFilter;
    }

    public String getTypeBil() {
        return typeBil;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "typeBil='" + typeBil + '\'' +
                ", partikelFilter=" + harpartikelFilter +
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
            if(harpartikelFilter){
                return 130 + 1000;
            }
            return 130;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            if(harpartikelFilter){
                return 1390 + 1000;
            }
            return 1390;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            if(harpartikelFilter){
                return 1850 + 1000;
            }
            return 1850;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            if (harpartikelFilter){
                return 2770 + 1000;
            }
            return 2770;
        } else if (kmPrL < 5) ;{
            if (harpartikelFilter){
                return 15250 + 1000;
            }
            return 15250;
        }

    }
}




