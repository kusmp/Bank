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
        RaportViseable raportViseable = new RaportViseable(balance);
        for(Kredyt kredyt: kredyty)
        {
            kredyt.accept(raportViseable);
        }
        for(Lokata lokata: lokaty)
        {
            lokata.accept(raportViseable);
        }
        for(RachunekBankowy rachunekBankowy: rachunki)
        {
            rachunekBankowy.accept(raportViseable);
        }
        return raportViseable.getProduktyDoRaportu();
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
    public Kredyt zaciagniecieKredytu(UUID id, double srodki) {
        Kredyt kredyt = new Kredyt(UUID.randomUUID(), srodki);
        System.out.println(kredyt.pokazSrodki());
      //  kredyt.naliczanieKredytu(6.0, 2, kredyt.pokazSrodki());
        kredyty.add(kredyt);
        return kredyt;
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
