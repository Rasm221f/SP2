public class Elbil extends Bil {

    private String typeBil;
    private Double batterikapacitetKWh;
    private Double maxKm;
    private Double whrPrKm;

    public Elbil(String typeBil, Double batterikapacitetKWh, Double maxKm, Double whrPrKm, String regNr,String mærke, String model, int årgang, int antalDøre){
        super(regNr, mærke, model, årgang, antalDøre);
        this.typeBil = typeBil;
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whrPrKm = whrPrKm;
    }

    public void setTypeBil(String typeBil) {
        this.typeBil = typeBil;
    }

    public String getTypeBil() {
        return typeBil;
    }

    public Double getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(Double batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public Double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(Double maxKm) {
        this.maxKm = maxKm;
    }

    public Double getWhrPrKm() {
        return whrPrKm;
    }

    public void setWhrPrKm(Double whrPrKm) {
        this.whrPrKm = whrPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "typeBil='" + typeBil + '\'' +
                ", batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whrPrKm=" + whrPrKm +
                ", regNr='" + regNr + '\'' +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                '}';
    }

    @Override
    protected double beregnGrønEjerafgift() {
        double kmPrL = (whrPrKm/91.25)/100;
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

