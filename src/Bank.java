import java.util.HashMap;

public class Bank implements OperacjeBankowe {

    private String nazwa;

    public Bank(String nazwa){
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

//    Bank nie powinien zmieniać nazwy
//    public void setNazwa(String nazwa) {
//        this.nazwa = nazwa;
//    }

    //    -------------------------------------------
//    Metody Banku

    public void dodawanieRachunek(){

    }

    public void usuwanieRachunek(){

    }

    public void zarzadzanie(){

    }

    public HashMap<String, String> wyswietlInfo(){

        HashMap<String, String> informacje = new HashMap<>();

        return informacje;
    }

//    -------------------------------------------
//    Implementacja interface

    @Override
    public void wplata(double kwota) {

    }

    @Override
    public void wyplata(double kwota) {

    }

    @Override
    public void przelew(String rachunek, double kwota) {

    }

    @Override
    public void naliczenieOdsetek() {

    }

    @Override
    public void zmianaMechanizmuOdsetkowego() {

    }

    @Override
    public Lokata zalozenieLokaty() {
        return null;
    }

    @Override
    public Lokata zerwanieLokaty() {
        return null;
    }

    @Override
    public Kredyt zaciagniecieKredytu() {
        return null;
    }

    @Override
    public Kredyt splataRatyKredytu() {
        return null;
    }

    @Override
    public double stworzenieDebetu(double kwota) {
        return 0;
    }

    @Override
    public void wykonanieRaport() {

    };
}
