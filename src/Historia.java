import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Historia {
    //Każda operacja bankowa tworzay nowy obiekt typu Historia i w banku przechowujemy te obiekty w Kolekcji.
    private List historia;
    private String productName;

    public Historia(String productName) {
        this.historia = new ArrayList<>();
        this.productName = productName;
    }

    public List getHistoria() {
        return historia;
    }

    public void setHistoria(List historia) {
        this.historia = historia;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

//    -------------------------------------------
//    Metody Historii
    public void dodaj(String nazwaOperacji) {
        Operacja operacja = new Operacja(nazwaOperacji);
        this.historia.add(operacja);
    }

//    public static void main(String[] args) {
//        Historia historiaBanku = new Historia("Historia banku");
//        historiaBanku.dodaj("Przelwew 1");
//        historiaBanku.dodaj("Przelwew 24");
//        historiaBanku.getHistoria();
//    }
}
