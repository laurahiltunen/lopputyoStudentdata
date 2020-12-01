
package my.kurssitietokanta;

import java.util.Random;

public class Opettaja extends Henkilo {
    
    private String tyontekijanumero;
    
    
    public Opettaja(String etunimi, String sukunimi){
        
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.tyontekijanumero = tuotaNumero();
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
        
        return "OPE-" + valiNumerot + numero;
    }

    public String getTyontekijanumero() {
        return tyontekijanumero;
    }

    public void setTyontekijanumero(String tyontekijanumero) {
        this.tyontekijanumero = tyontekijanumero;
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
        return getEtunimi() + " " + getSukunimi() + " " + getTyontekijanumero();    
    }
    
}
