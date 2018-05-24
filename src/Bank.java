import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

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

    public List<RachunekBankowy> getRachunki() {
        return rachunki;
    }

    public List<Lokata> getLokaty() {
        return Collections.unmodifiableList(lokaty);
    }

    public List<Kredyt> getKredyty() {
        return kredyty;
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
}
