package activitati;

import adnotari.Owner;
import adnotari.TODO;
import basic.Persoana;
import basic.Trainer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@TODO(durataH = 10, prioritate = 5, status = "in pregress")
@Owner(email = "flavius_s@gmail.com", id = "abcd")


public class Curs implements Activitate{

    private String nume;
    private String dificulate;
    private Persoana trainer;
    private List<Persoana> exploreri = new ArrayList<>();
    private int cost;

    private Map<String,Activitate> activitati = new LinkedHashMap<>();



    public Curs(String nume, String dificulate, Persoana trainer, List<Persoana> exploreri, int cost) {
        this.nume = nume;
        this.dificulate = dificulate;
        this.trainer = trainer;
        this.exploreri = exploreri;
        this.cost = cost;
    }

    @Override
    public String getDescriere() {
        return "Nume curs: " + this.nume + ", Dificultate curs: " + this.dificulate;
    }
    //"usor"->"1 luna"; "mediu"->"3 luni"; "dificil"->"5 luni"; altfel -> "necunoscut";
    @Override
    public String getDurata() {
        String durata = "";
        switch (this.dificulate){
            case "usor":
                durata = "1 luna";
                break;
            case "mediu":
                durata = "3 luni";
                break;
            case "greu":
                durata = "5 luni";
                break;
            default:
                durata = "necunoscut";
        }
        return durata;
    }

    public Map<String, Activitate> getActivitati() {
        return activitati;
    }

    public void setActivitati(Map<String, Activitate> materialeCurs) {
        this.activitati = materialeCurs;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDificulate() {
        return dificulate;
    }

    public void setDificulate(String dificulate) {
        this.dificulate = dificulate;
    }

    public Persoana getTrainer() {
        return trainer;
    }

    public void setTrainer(Persoana trainer) {
        this.trainer = trainer;
    }

    public List<Persoana> getExploreri() {
        return exploreri;
    }

    public void setExploreri(List<Persoana> exploreri) {
        this.exploreri = exploreri;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost(Persoana p) {
        if (p instanceof Trainer) {
            return 0;
        } else {
            return cost;
        }
    }



}
