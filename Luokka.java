
package my.kurssitietokanta;

import java.awt.List;
import java.util.ArrayList;


public class Luokka {
    
    private String luokka_aste;
    private String luokkatunnus;
    
    public Luokka(String luokka_aste, String luokkatunnus) {
        this.luokka_aste = luokka_aste;
        this.luokkatunnus = luokkatunnus;
    }
    
    
    public String getLuokka_aste() {
        return luokka_aste;
    }

    public void setLuokka_aste(String luokka_aste) {
        this.luokka_aste = luokka_aste;
    }

    public String getLuokkatunnus() {
        return luokkatunnus;
    }

    public void setLuokkatunnus(String luokkatunnus) {
        this.luokkatunnus = luokkatunnus;
    }

    public String toString() {
        return getLuokka_aste() + getLuokkatunnus();
    }
    
 
    
}
