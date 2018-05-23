import java.util.*;

public class Bank extends BankColleague {
    private List<RachunekBankowy> rachunki = new ArrayList<>();
    private List<Lokata> lokaty = new ArrayList<>();
    private List<Kredyt> kredyty = new ArrayList<>();

    public Bank(IzbaBankowaMediator mediator, String nazwa) {
        super(mediator, nazwa);
    }

//    -------------------------------------------
//    Metody Banku

    public RachunekBankowy dodawanieRachunek() {
        UUID id = UUID.randomUUID();
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunki.add(rachunek);
        return rachunek;
    }

//    public void usuwanieRachunek(UUID id) {
//        getRachunki().remove(znajdzRachunek(id));
//    }

    public void zarzadzanie() {}

    public Map<String, String> wyswietlInfo() {

        Map<String, String> informacje = new HashMap<>();

        return informacje;
    }

    public List<RachunekBankowy> getRachunki() {
        return rachunki;
    }

    public List<Lokata> getLokaty() {
        return Collections.unmodifiableList(lokaty);
    }

    public List<Kredyt> getKredyty() {
        return kredyty;
    }

    public RachunekBankowy znajdzRachunek(UUID id, Bank bank){
        for ( RachunekBankowy rachunek : bank.getRachunki())
            if(rachunek.getRACHUNEK().equals(id))
                return rachunek;
        return null;
    }

    private Lokata znajdzLokate(UUID id, Bank bank){
        for ( Lokata lokata : bank.getLokaty())
            if(lokata.getRACHUNEK().equals(id))
                return lokata;
        return null;
    }

    private Kredyt znajdzKredyt(UUID id, Bank bank) {
        for (Kredyt kredyt : bank.getKredyty())
            if (kredyt.getRACHUNEK().equals(id))
                return kredyt;
        return null;
    }

//    -------------------------------------------
//    Implementacja operacji bankowych

    public void wykonajOperacje(OperacjaBankowa operacja) {
        operacja.wykonaj();
//        historia.add(operacja);
    }

//    -------------------------------------------
//    Implementacja interface

/*    @Override
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
    public Lokata zalozenieLokaty(double srodki, int czas, double procent) {
        Lokata lokata = new Lokata(UUID.randomUUID(), srodki, czas, procent);
        lokaty.add(lokata);
        return lokata;
    }

    @Override
    public void zerwanieLokaty(UUID id) {
        getLokaty().remove(znajdzLokate(id));
    }

    @Override
    public Kredyt zaciagniecieKredytu(UUID id, double srodki) {
        Kredyt kredyt = new Kredyt(UUID.randomUUID(), srodki);
        System.out.println(kredyt.pokazSrodki());
      //  kredyt.naliczanieKredytu(6.0, 2, kredyt.pokazSrodki());
        kredyty.add(kredyt);
        return kredyt;
    }

    @Override
    public void splataRatyKredytu(UUID id, double kwotaKredtu) {
*//*        if(znajdzKredyt(id).getRaty == getLiczbaRat){

        }*//*
    }

    @Override
    public void stworzenieDebetu(UUID id, double srodki, boolean debet, double wielkoscDebetu) {
        RachunekBankowy DEBET = new RachunekBankowy(id, srodki, debet, wielkoscDebetu);
    }

    @Override
    public void wykonanieRaport() {

    }*/
}
