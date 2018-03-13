import java.util.UUID;

public class Lokata implements ProduktBankowy {

    private double odsetki;
    private int czas; //podawane w miesiacach
    private double procent;
    private UUID id;
    private double srodki;



    public Lokata(UUID id){
        this.id = id;
    }
    public UUID getLOKATA() {
        return id;
    }

    public String wyswietlNumerRachunku(){
        return id.toString();
    }



}
