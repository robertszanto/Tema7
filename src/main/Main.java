package main;

import activitati.*;
import adnotari.Owner;
import adnotari.TODO;
import basic.Explorer;
import basic.Persoana;
import basic.Trainer;
import exceptions.NotEnoughInformationException;

import java.io.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.*;

@TODO(durataH = 1, prioritate = 2, status = "in pregress")
@Owner(email = "robertszasnto64@gmail.com", id = "a")

public class Main {
    public static void main(String[] args) throws IOException {
        //TODO 1: Creati o noua clasa Explorer in pachetul basic

        //TODO 2: Creati o noua clasa Trainer in pachetul basic

        //TODO 3: Ambele clase trebuie sa extinda clasa Persoana

        //TODO 4: Rezolvati erorile din cele doua noi subclase generand constructorii ce apeleaza constructorul din Persoana si implementand metodele necesare
        //Pentru responsabilitatile Trainerului se va returna un mesaj de tipul: "Pregatirea materialelor, evaluarea temelor, crearea contextului de lucru, raspunderea la intrebari"
        //Pentru responsabilitatile Explorerului se va returna un mesaj de tipul: "Parcurgerea materialelor, rezolvarea temelor, participarea la activitati";

        //TODO 5: In metoda main din clasa Main, definiti si initializati doua variabile de tip Persoana - e1 folosind constructorul clasei Explorer si t1 folosind constructorul clasei Trainer.
        //Afisati cele doua variabile si responsabilitatile fiecaruia
       Persoana e1 = new Explorer("Andrei", "Dudunescu", "Brasov", 20, false);
       Persoana t1 = new Trainer("Vasile", "Ciocanel", "Vaslui", 15, true);

        System.out.println(e1.getResponsabilitati());
        System.out.println(t1.getResponsabilitati());

        //TODO 6: Suprascrieti in cele doua clase noi metoda obtineIdentificator astfel incat aceasta sa afiseze inainte de identificatorul utilizatorului calitatea acestuia:
        //ex: explorer_alexandru_ANDREI vs trainer_ana_POPESCU

        //TODO 7: Afisati cele rezultatul obtinut prin rularea metodei obtineIdentificator pe fiecare dintre variabile
        System.out.println(e1.obtineIdentificator());
        System.out.println(t1.obtineIdentificator());

        //TODO 8: Creati un pachet nou numit "activitati"

        //TODO 9: Creati o noua interfata numita "Activitate"

        //TODO 10: Pentru aceasta interfata definiti metodele publice:
        //getDescriere ce returneaza String
        //getDurata ce returneaza String

        //TODO 11: Creati in pachetul activitati clasele numite Rush, Tema, Material, Curs care implementeaza interfata Activitate

        //TODO 12: Implementati metodele necesare in fiecare clasa astfel incat sa returneze o descriere si un timp estimat de parcurgere (in afara de clasa Curs ce va fi tratata separat)
        //ex: pentru rush Rush se vor returna - descriere: "Activitate de lucru colaborativ & Q&A"; durata - "2h"

        //TODO 13: Pentru clasa Curs definiti proprietatile privat: "nume" (tip String), "dificultate" (tip String), "trainer" (tip Persoana), "exploreri" (tip ArrayList<Persoana>), int cost

        //TODO 14: Definiti getters/setters pentru proprietatile clasei Curs

        //TODO 15: Generati un constructor pentru clasa Curs cu toti parametrii clasei

        //TODO 16: Modificati metoda suprascrisa din clasa Curs astfel incat sa returneze o descriere ce contine numele si dificultatea cursului

        //TODO 17: Modificati metoda suprascrisa din clasa Curs astfel incat sa returneze o durata in functie de dificultate
        //"usor"->"1 luna"; "mediu"->"3 luni"; "dificil"->"5 luni"; altfel -> "necunoscut";

        //TODO 18: In clasa curs vom adauga o proprietate privata de tip LinkedHashMap<String, Activitate> ce reprezinta materialele acelui curs (numele si o Activitate)
        //Folosim LinkedHashMap pentru capacitatea acestuia de a pastra ordinea elementelor adaugate

        //TODO 19: Instantiati HashMap-ul atunci cand este definit si creati getter/setter pentru acesta

        //TODO 20: In metoda main din clasa Main vom realiza tot ce avem nevoie pentru a crea o instanta de curs:
        //Pentru trainer vom folosi instanta t1;
        //Pentru lista de exploreri vom crea 2 noi instante de exploreri e2, e3, dar si un nou trainer t2 si un nou ArrayList in care vom adauga aceste instante (e1, e2, e3 si t2)
        //Pentru nume vom folosi "JAVA"
        //Pentru dificultate vom folosi "mediu"
        //Pentru cost vom estima "1000"
        //Se va crea o instainta de Curs folosind variabilele de mai sus

        Persoana e2 = new Explorer("Pop", "Adrian", "Arad", 34, true);
        Persoana e3 = new Explorer("Vasilica", "Precupeata", "Bihor", 40, true);
        Persoana t2 = new Trainer("Herdelea", "Zaharia", "Pripas", 40, true);

        List<Persoana> exploreri = new ArrayList<>();
        exploreri.add(e1);
        exploreri.add(e2);
        exploreri.add(e3);
        exploreri.add(t2);

        Curs curs = new Curs("JAVA", "mediu", t2, exploreri, 1000);

        //TODO 21: Consideram ca trainerii pot participa la alte cursuri gratuiit si pentru aceasta definim metoda getCost(Persoana p) ce overload-uieste getterul getCost() fara niciun parametru
        //In metoda getCost cu parametru persoana se verifica daca persoana are instanta de trainer si atunci se returneaza 0, altfel se returneaza costul cursului

        //TODO 22: In metoda main din clasa Main parcurgeti lista de exploreri ai cursului definit si afisati pentru fiecare costul
        //folositi obtineIdentificator() pentru a vedea mai clar tipul persoanei
        //ex: explorer_matei_SANDU pays 1000 vs:	trainer_sorina_ION pays 0
        System.out.println("Start");
        for (Persoana persoanaList : exploreri) {
            System.out.println(persoanaList.obtineIdentificator() + " pays " + curs.getCost());
        }

        //TODO 23: Definiti cate doua activitati de fiecare tip Rush, Tema, Material si adaugati-le in linkedhashmap-ul cursului apoi afisati calendarul cursului
        //pentru afisare puteti folosi codul de mai jos:
        Rush rush = new Rush();
        Rush rush1 = new Rush();
        Tema tema = new Tema();
        Tema tema1 = new Tema();
        Material material = new Material();
        Material material1 = new Material();

        Map<String,Activitate> c = new LinkedHashMap<>();
        c.put("curs1", rush);
        c.put("curs2", rush1);
        c.put("curs3", tema);
        c.put("curs4", tema1);
        c.put("curs5", material);
        c.put("curs6", material1);

        curs.setActivitati(c);

        for(String key : curs.getActivitati().keySet()) {
         System.out.println("Activitatea " + key + " este de tip " + curs.getActivitati().get(key).getClass() + " cu descrierea \"" +
                 curs.getActivitati().get(key).getDescriere() + "\" si durata estimata de " + curs.getActivitati().get(key).getDurata());
        }

//       annotationsExampple();

        List<Explorer> explorers = new ArrayList<>();
        List<Trainer> trainers   = new ArrayList<>();
        List<List<String>> listFromFile = null;
        try {
            listFromFile = parseText("/Users/robertszanto/Desktop/untitled.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (listFromFile != null){
            listFromFile.forEach(i -> {
                try {
                    if (i.size() < 6){
                        throw new NotEnoughInformationException("Parsed information from file is incomplete. This line will be ignored!!");
                    }
                    if (i.get(0).trim().equals("Explorer")){
                        Explorer explorer = new Explorer();
                        explorer.setNume(i.get(1).trim());
                        explorer.setPrenume(i.get(2).trim());
                        explorer.setOras(i.get(3).trim());
                        try {
                            explorer.setVarsta(Integer.parseInt(i.get(4).trim()));
                        } catch (NumberFormatException e) {
                            System.out.println("Wrong number format found. " + e.getMessage());
                        }
                        explorer.setCasatorita(!i.get(5).trim().equals("false"));
                    } else if (i.get(0).trim().equals("Trainer")) {
                        Trainer trainer = new Trainer();
                        trainer.setNume(i.get(1).trim());
                        trainer.setPrenume(i.get(2).trim());
                        trainer.setOras(i.get(3).trim());
                        try {
                            trainer.setVarsta(Integer.parseInt(i.get(4).trim()));
                        } catch (NumberFormatException e) {
                            System.out.println("Wrong number format found. " + e.getMessage());
                        }
                        trainer.setCasatorita(!i.get(5).trim().equals("false"));
                    }
                } catch(NotEnoughInformationException e) {
                    System.out.println(e.getMessage());
                }


            });
        }

        explorers.forEach(System.out::println);

    }

   private static void annotationsExampple() {
       Main main = new Main();
       System.out.println(main.getClass());
       Method[] methods = Main.class.getDeclaredMethods();
       for (Method m : methods) {
        System.out.println(m);
       }

       Annotation[] annotations = main.getClass().getAnnotations();
       Owner owner = main.getClass().getAnnotation(Owner.class);
       System.out.println();
       for (Annotation a : annotations) {
        System.out.println(a);
       }
  }

  private static List<List<String>> parseText(String path) throws IOException {
       File file = new File(path);
       BufferedReader reader = new BufferedReader(new FileReader(file));

       String line = "";
       List<List<String>> list = new ArrayList<>();
       String[] fstSplit;

       while ((line = reader.readLine()) != null){
           fstSplit = line.split(":");
           if (fstSplit.length == 2) list.add(Arrays.asList(fstSplit[1].split(",")));
       }
       return list;
  }
}
