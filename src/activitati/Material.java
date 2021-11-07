package activitati;

import adnotari.Owner;
import adnotari.TODO;

@TODO(durataH = 12, prioritate = 5, status = "in test")
@Owner(email = "trenul123@gmail.com", id = "abcde")


public class Material implements Activitate{
    @Override
    public String getDescriere() {
        return "Materiale utile pentru intelegerea conceptelor Java";
    }

    @Override
    public String getDurata() {
        return "3";
    }
}
