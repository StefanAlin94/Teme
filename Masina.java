public class Masina {

    private String culoare;
    private String roti;
    private long dimensiune;

    public Masina() {

    }

    public String getCuloare() {
        return culoare;
    }

    public Masina(String culoare, String roti, long dimensiune) {
        this.culoare = culoare;
        this.roti = roti;
        this.dimensiune = dimensiune;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "culoare='" + culoare + '\'' +
                ", roti='" + roti + '\'' +
                ", dimensiune=" + dimensiune +
                '}';
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public long getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(long dimensiune) {
        this.dimensiune = dimensiune;
    }
}
