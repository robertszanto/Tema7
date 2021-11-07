package activitati;

import adnotari.Owner;
import adnotari.TODO;

@TODO(durataH = 21, prioritate = 4)
@Owner(email = "cereale@gmail.com", id = "abcdefgh")


public interface Activitate {
    public String getDescriere();
    public String getDurata();
}
