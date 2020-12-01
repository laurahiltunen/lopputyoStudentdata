
package my.kurssitietokanta;

import java.util.Random;

public class Opiskelija extends Henkilo{
    
    private String opiskelijanro;
    private int opintopisteet;
    private Luokka luokka;
    
    public Opiskelija(String etunimi, String sukunimi, int opintopisteet, Luokka luokka){
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.opiskelijanro = tuotaNumero();
        this.opintopisteet = opintopisteet;
        this.luokka = luokka;
        
    }
    
    public String tuotaNumero() {
        Random generaattori = new Random();
        int numero = generaattori.nextInt(100000);
        String valiNumerot = "";
        
        if(numero < 10) {
            valiNumerot = "00000";
        } else if(numero < 100 && numero >= 10 ){
            valiNumerot = "0000";
        } else if(numero < 1000 && numero >= 100) {
            valiNumerot = "000";
        } else if (numero < 10000 && numero >= 1000) {
            valiNumerot = "00";
        } else if (numero < 100000 && numero >= 10000) {
            valiNumerot = "0";
        }
        
        return "J" + valiNumerot + numero;
    }

    public Luokka getLuokka() {
        return luokka;
    }

    public void setLuokka(Luokka luokka) {
        this.luokka = luokka;
    }
    

    public String getOpiskelijanro() {
        return opiskelijanro;
    }

    public void setOpiskelijanro(String opiskelijanro) {
        this.opiskelijanro = opiskelijanro;
    }

    public int getOpintopisteet() {
        return opintopisteet;
    }

    public void setOpintopisteet(int opintopisteet) {
        this.opintopisteet = opintopisteet;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }
    
    
    
    @Override
    public String toString() {
        
        return getEtunimi() + " " + getSukunimi() + " (" + getLuokka() + ") " + getOpiskelijanro() ;
    }
    
}
