import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Bank implements OperacjeBankowe {

    private String nazwa;
    private static ArrayList<RachunekBankowy> rachunki = new ArrayList<>();
    private static ArrayList<Lokata> lokaty = new ArrayList<>();
    private static ArrayList<Kredyt> kredyty = new ArrayList<>();

    public Bank(String nazwa) {
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

    public void dodawanieRachunek() {
        UUID id = UUID.randomUUID();
        RachunekBankowy rachunek = new RachunekBankowy(id);
        rachunki.add(rachunek);
    }

    public void usuwanieRachunek(UUID id) {
        getRachunki().remove(znajdzRachunek(id));
    }

    public void zarzadzanie() {

    }

    public HashMap<String, String> wyswietlInfo() {

        HashMap<String, String> informacje = new HashMap<>();

        return informacje;
    }

    public static ArrayList<RachunekBankowy> getRachunki() {
        return rachunki;
    }

    public static ArrayList<Lokata> getLokaty() {
        return lokaty;
    }

    public static ArrayList<Kredyt> getKredyty() {
        return kredyty;
    }

    private RachunekBankowy znajdzRachunek(UUID id){
        for ( RachunekBankowy rachunek : Bank.getRachunki())
            if(rachunek.getNrRachunku().equals(id))
                return rachunek;
        return null;
    }
    private Lokata znajdzLokate(UUID id){
        for ( Lokata lokata : Bank.getLokaty())
            if(lokata.getNrRachunku().equals(id))
                return lokata;
        return null;
    }
    private Kredyt znajdzKredyt(UUID id){
        for ( Kredyt kredyt : Bank.getKredyty())
            if(kredyt.getNrRachunku().equals(id))
                return kredyt;
        return null;
    }

//    -------------------------------------------
//    Implementacja interface

    @Override
    public void wplata(double kwota, UUID id) {
        znajdzRachunek(id).zwiekszSrodki(kwota);
    }

    @Override
    public void wyplata(double kwota, UUID id) {
        znajdzRachunek(id).zmniejszSrodki(kwota);
    }

    @Override
    public void przelew(UUID idOdbiorcy, UUID idNadawcy, double kwota) {
        znajdzRachunek(idNadawcy).zmniejszSrodki(kwota);
        znajdzRachunek(idOdbiorcy).zwiekszSrodki(kwota);
    }

    // nie wiemy jak zaimplementowac różne opcje zmiany odsetek
    @Override
    public void zmianaMechanizmuOdsetkowego() {

    }

    @Override
    public void zalozenieLokaty(double srodki, int czas, double procent) {
        Lokata lokata = new Lokata(UUID.randomUUID(), srodki, czas, procent);
        lokaty.add(lokata);
    }

    @Override
    public void zerwanieLokaty(UUID id) {
        getLokaty().remove(znajdzLokate(id));
    }

    @Override
    public void zaciagniecieKredytu(UUID id, double srodki) {
        Kredyt kredyt = new Kredyt(UUID.randomUUID(), srodki);
        kredyty.add(kredyt);
    }

    @Override
    public void splataRatyKredytu() {

    }

    @Override
    public double stworzenieDebetu(double kwota) {
        return 0;
    }

    @Override
    public void wykonanieRaport() {

    }
}
