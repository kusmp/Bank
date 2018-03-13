import java.util.UUID;

public class Kredyt extends RachunekBankowy implements ProduktBankowy {


    private int czas; //podawane w miesiacach
    private double procent; //procent w skali roku
    // private String rachunek;
    // private double kwota;
    private int liczbaRat; //podawana w miesiącach
    private double kwotaRaty; //kwota raty do spłacenia w każdym miesiącu
    private double wspolczynnikProcentowy;

    public Kredyt(UUID id, double srodki, int liczbaRat, double procent){
        super(id, srodki);
        this.procent = procent;
        this.liczbaRat = liczbaRat;
    }

    public Kredyt(UUID id, double srodki){
        super(id, srodki);
    };


    public int getLiczbaRat(){
        return liczbaRat;
    }

    public void setLiczbaRat(int czas){
        this.czas = liczbaRat;
    }

    public double getProcent(){
        return procent;
        }

        public void setProcent(double procent){
        this.procent = procent;
        }


      /////////////////////////////////////////////////////

        public void ZasilKontoKredytem(double kwotaKredtu){
        super.zwiekszSrodki(kwotaKredtu);
        }

        public void naliczanieKredytu(double procent, int liczbaRat, double kwotaKredytu){
        //http://matematycznie.blox.pl/2011/04/Kredyty-raty-stale.html
        wspolczynnikProcentowy = 1+((1/12)*(procent/100));
        double licznik = (kwotaKredytu*Math.pow(wspolczynnikProcentowy, liczbaRat)*(wspolczynnikProcentowy-1));
        double mianownik = Math.pow(wspolczynnikProcentowy, liczbaRat)-1;
        kwotaRaty = licznik/mianownik;
        super.zmniejszSrodki(kwotaRaty);
        }




  //  public String wyswietlNumerRachunku(){
      //  return rachunek;
  //  }

}
