
package my.kurssitietokanta;

import java.util.ArrayList;
import java.util.Random;

public class Kasittelija {
    
    private ArrayList<Henkilo> opeLista;
    private ArrayList<Henkilo> opiskelijaLista;
    private ArrayList <Kurssi> kurssiLista;
    private ArrayList<Luokka> luokat;
    
    public Kasittelija() {
        this.opeLista = new ArrayList<Henkilo>();
        this.opiskelijaLista = new ArrayList<Henkilo>();
        this.kurssiLista = new ArrayList<Kurssi>();
        this.luokat = new ArrayList<Luokka>();
        luoHenkilot();
         
    }
    
    public void luoHenkilot() {
        //Luodaan luokat
        Luokka luokka1 = new Luokka("20", "A");
        Luokka luokka2 = new Luokka("20", "B");
        Luokka luokka3 = new Luokka("20", "C");
        
        luokat.add(luokka1);
        luokat.add(luokka2);
        luokat.add(luokka3);
        
        
        //Luodaan opettajia valmiiksi
        opeLista.add(new Opettaja("Anne", "Saastamoinen"));
        opeLista.add(new Opettaja("Jurkko", "Onnela"));
        opeLista.add(new Opettaja("Severi", "Suihkonen"));
        opeLista.add(new Opettaja("Leena", "Pouta"));
        opeLista.add(new Opettaja("Nuuti", "Poussu"));
        opeLista.add(new Opettaja("Virpi", "Vuojela"));
        
     
        //Luodaan opiskelijoita valmiiksi
        Random valitsija = new Random();
        opiskelijaLista.add(new Opiskelija("Anni", "Putkonen", valitsija.nextInt(300), luokka1));
        opiskelijaLista.add(new Opiskelija("Jenni", "Kuusankoski", valitsija.nextInt(300), luokka2));
        opiskelijaLista.add(new Opiskelija("Senni", "Mustonen", valitsija.nextInt(300), luokka3));
        opiskelijaLista.add(new Opiskelija("Mimmi", "Kaartinen", valitsija.nextInt(300), luokka2));
        opiskelijaLista.add(new Opiskelija("Tuukka", "Salo", valitsija.nextInt(300), luokka3));
        opiskelijaLista.add(new Opiskelija("Jaakko", "Peltoniemi", valitsija.nextInt(300), luokka2));
        opiskelijaLista.add(new Opiskelija("Riku", "Juusela", valitsija.nextInt(300), luokka1));
        
        Opettaja ope = new Opettaja("Minni", "Kaskinen");
        //Luodaan kursseja valmiiksi
        kurssiLista.add(new Kurssi("Tietokantojen perusteet", 5, ope));
        kurssiLista.add(new Kurssi("Kasvatustieteen jatkokurssi", 7, ope));
        kurssiLista.add(new Kurssi("Toinen kotimainen kieli (suul.)", 3, ope));
        kurssiLista.add(new Kurssi("Kirjoitusviestintä", 2, ope));
        kurssiLista.add(new Kurssi("Visuaaliset tutkimusmenetelmät", 5, ope));
        kurssiLista.add(new Kurssi("Johdatus psykologiaan", 4, ope));
    }
    
    public void lisaaKurssi(Kurssi kurssi) {
        kurssiLista.add(kurssi);
    }
    
    public void lisaaOpe(Henkilo ope) {
        opeLista.add(ope);
    }
    
    public void lisaaOpiskelija(Opiskelija oppilas) {
        opiskelijaLista.add(oppilas);
       
    }
    
    public ArrayList etsiHenkilot(String hakusana) {
        
        ArrayList henkiloLista = new ArrayList<Henkilo>();
        
        for(int i = 0; i < opeLista.size(); i++) {
            
            if(opeLista.get(i).toString().contains(hakusana)) {
                henkiloLista.add(opeLista.get(i));
            }
            
        };
        for(int i = 0; i < opiskelijaLista.size(); i++) {
            
            if(opiskelijaLista.get(i).toString().contains(hakusana)) {
                henkiloLista.add(opiskelijaLista.get(i));
            }
            
        };
        
        
        return henkiloLista;
    }
    
    public Henkilo palautaHenkilo(String hakusana) {
        
        
        for(int i = 0; i < opeLista.size(); i++) {
            
            if(opeLista.get(i).toString().contentEquals(hakusana)) {
                return opeLista.get(i);
            }
        };
        
        for(int i = 0; i < opiskelijaLista.size(); i++) {
            
            if(opiskelijaLista.get(i).toString().contentEquals(hakusana)) {
                return opiskelijaLista.get(i);
            }
        };
        
        return new Henkilo();
    }
    
    public Kurssi palautaKurssi(String hakusana) {
        
        
        for(int i = 0; i < kurssiLista.size(); i++) {
            
            if(kurssiLista.get(i).toString().contentEquals(hakusana)) {
                
                return kurssiLista.get(i);
            }
            
        };
        Opettaja opettaja = new Opettaja("Testi", "Ope");
        return new Kurssi("Kurssia ei löytynyt", 0, opettaja);
    }
    
    
    public Kurssi etsiKurssi(String hakusana) {
        
        Opettaja opettaja = new Opettaja("Testi", "Ope");
        Kurssi kurssi = new Kurssi("Uusi", 0, opettaja);
        
        for(int i = 0; i < kurssiLista.size(); i++) {
            
            if(kurssiLista.get(i).toString().contains(hakusana)) {
                kurssi = kurssiLista.get(i);
                
                
                
            }
            
        };
        
        return kurssi;
    }
    
     
    public Luokka palautaLuokka(int hakunumero) {
        
        if(hakunumero == 0) {
            return luokat.get(0);
        } else if(hakunumero == 1) {
            return luokat.get(1);
        } else {
            return luokat.get(2);
        }
        
    }

    public ArrayList<Henkilo> getOpeLista() {
        return opeLista;
    }

    public void setOpeLista(ArrayList<Henkilo> opeLista) {
        this.opeLista = opeLista;
    }

    public ArrayList<Henkilo> getOpiskelijaLista() {
        return opiskelijaLista;
    }

    public void setOpiskelijaLista(ArrayList<Henkilo> opiskelijaLista) {
        this.opiskelijaLista = opiskelijaLista;
    }

    public ArrayList<Kurssi> getKurssiLista() {
        return kurssiLista;
    }

    public void setKurssiLista(ArrayList<Kurssi> kurssiLista) {
        this.kurssiLista = kurssiLista;
    }
    
    
}
