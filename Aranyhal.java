package com.mycompany.aranyhal;
import java.util.ArrayList;

public class Aranyhal {
    private int kor;
    private ArrayList<String> kivansagok;
    private String kifogta;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(){
        return 0;
    }
    
    public void kikkelTalalkozott(){
        
    }
    
    public boolean kivansagotTeljesit(){
        return false;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
    
    
}
