import java.util.*;

public class Bank implements BankColleague {
    private UUID id;
    private String name;
    private IzbaBankowa mediator;
    private List<RachunekBankowy> rachunki = new ArrayList<>();
    private List<Lokata> lokaty = new ArrayList<>();
    private List<Kredyt> kredyty = new ArrayList<>();

    public Bank(IzbaBankowa mediator, String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.mediator = mediator;
    }

//    -------------------------------------------
//    Metody Banku

    public RachunekBankowy newRachunek() {
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunki.add(rachunek);
        return rachunek;
    }

    public Kredyt newKredyt(double srodki){
        Kredyt kredyt = new Kredyt(srodki);
        kredyty.add(kredyt);
        return kredyt;
    }

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

    public List<RachunekBankowy> getProduktyDoRaportu(double balance){
        Raport raport = new Raport(balance);
        for(Kredyt kredyt: kredyty)
        {
            kredyt.accept(raport);
        }
        for(Lokata lokata: lokaty)
        {
            lokata.accept(raport);
        }
        for(RachunekBankowy rachunekBankowy: rachunki)
        {
            rachunekBankowy.accept(raport);
        }
        return raport.getProduktyDoRaportu();
    }

//    -------------------------------------------
//    Implementacja interface

    @Override
    public void przelewMiedzybankowy(double srodki, RachunekBankowy nadawca, RachunekBankowy odbiorca) {
        mediator.sendMoney(this, srodki, nadawca, odbiorca);
    }

/*
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
    public void splataRatyKredytu(UUID id, double kwotaKredtu) {
        if(znajdzKredyt(id).getRaty == getLiczbaRat){

        }
    }

    @Override
    public void stworzenieDebetu(UUID id, double srodki, boolean debet, double wielkoscDebetu) {
        RachunekBankowy DEBET = new RachunekBankowy(id, srodki, debet, wielkoscDebetu);
    }
*/
}
