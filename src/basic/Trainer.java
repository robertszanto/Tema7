package basic;

import adnotari.Owner;
import adnotari.TODO;

@TODO(durataH = 5, prioritate = 3)
@Owner(email = "eduardo@gmail.com", id = "abc")

public class Trainer extends Persoana {

    public Trainer(String nume, String prenume, String oras, Integer varsta, boolean casatorita) {
        super(nume, prenume, oras, varsta, casatorita);
    }

    public Trainer() {
    }

    @Override
    public String getResponsabilitati() {
        return "Pregatirea materialelor, evaluarea temelor, crearea contextului de lucru, raspunderea la intrebari";
    }

    @Override
    public String obtineIdentificator() {
        return "trainer_" + super.obtineIdentificator();
    }

}
