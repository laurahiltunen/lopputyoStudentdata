
package my.kurssitietokanta;


public class Kurssi {
    
    private String nimi;
    private int laajuus;
    private Henkilo opettaja;
    
    public Kurssi(String nimi, int laajuus, Henkilo opettaja) {
        
        this.nimi = nimi;
        this.laajuus = laajuus;
        this.opettaja = opettaja;
    }
    
    // public Kurssi(String nimi, int laajuus) {
    //    
    //    this.nimi = nimi;
    //    this.laajuus = laajuus;
    //    this.opettaja = new Opettaja("Annika", "Turunen");
    //}

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getLaajuus() {
        return laajuus;
    }

    public void setLaajuus(int laajuus) {
        this.laajuus = laajuus;
    }

    public Henkilo getOpettaja() {
        return opettaja;
    }

    public void setOpettaja(Henkilo opettaja) {
        this.opettaja = opettaja;
    }
    
    public String toString() {
        return getNimi() + " (" + getLaajuus() + " op), Opettaja: " + getOpettaja();
    }
    
}
