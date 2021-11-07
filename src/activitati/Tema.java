package activitati;

import adnotari.Owner;
import adnotari.TODO;

@TODO(durataH = 49, prioritate = 5, status = "in pregress")
@Owner(email = "trei3@gmail.com", id = "abcdef")



public class Tema implements Activitate{
    @Override
    public String getDescriere() {
        return "Activitate individuala pentru a utiliza conceptele invatate";
    }

    @Override
    public String getDurata() {
        return "4";
    }
}
