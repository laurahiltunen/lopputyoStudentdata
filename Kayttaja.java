
package my.kurssitietokanta;

public class Kayttaja {
    
    private String kayttajanimi;
    private char[] salasana;
    
    public Kayttaja(String kayttajanimi, char[] salasana) {
        
        this.kayttajanimi = kayttajanimi;
        this.salasana = salasana;
    }
    
    public boolean tarkasta(String kt, char[] ss) {
        //Tarkistetaan onko käyttäjän syöttämä käyttäjä ja salasana oikeat
        boolean tarkistus = false;
        
        if(kt.equals(kayttajanimi) && ss.equals(ss)) {
            tarkistus = true;
        }
        
        return tarkistus;
    }

    public String getKayttajanimi() {
        return kayttajanimi;
    }

    public void setKayttajanimi(String kayttajanimi) {
        this.kayttajanimi = kayttajanimi;
    }

    public char[] getSalasana() {
        return salasana;
    }

    public void setSalasana(char[] salasana) {
        this.salasana = salasana;
    }
    
    
    
    
    
}
