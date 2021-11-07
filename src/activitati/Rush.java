package activitati;

import adnotari.Owner;
import adnotari.TODO;

@TODO(durataH = 1, prioritate = 2, status = "in pregress")
@Owner(email = "fiverr5@gmail.com", id = "abcdefg")


public class Rush implements Activitate{

    @Override
    public String getDescriere() {
        return "Activitate de lucru colaborativ & Q&A";
    }

    @Override
    public String getDurata() {
        return "2h";
    }


}
