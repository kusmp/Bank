import java.util.List;

public class StworzenieRaportu implements OperacjaBankowa {
    private Bank bank;
    private Raport raport;
    private double balance;
    private List<RachunekBankowy> rachunki;
    private List<Kredyt> kredyty;
    public List<RachunekBankowy> produktyDoRaportu;
    /*  private List<Lokata> lokaty;*/

    public StworzenieRaportu(Bank bank, double balance) {
        this.rachunki = bank.getRachunki();
        this.kredyty = bank.getKredyty();
      //  this.lokaty = bank.getLokaty();
        this.balance = balance;
    }

    public List<RachunekBankowy> getProduktyDoRaportu() {
        return produktyDoRaportu;
    }

    public void setProduktyDoRaportu(List<RachunekBankowy> produktyDoRaportu) {
        this.produktyDoRaportu = produktyDoRaportu;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setRachunki(List<RachunekBankowy> rachunki) {
        this.rachunki = rachunki;
    }

    public void setKredyty(List<Kredyt> kredyty) {
        this.kredyty = kredyty;
    }

    @Override
    public void wykonaj() {
        this.raport = new Raport(balance);
        for(Kredyt kredyt: this.kredyty)
        {
            kredyt.accept(this.raport);
        }
        for(RachunekBankowy rachunekBankowy: this.rachunki)
        {
            rachunekBankowy.accept(this.raport);
        }
/*        for(Lokata lokata: lokaty)
        {
            lokata.accept(raport);
        }*/
        produktyDoRaportu = raport.getProduktyDoRaportu();
    }
}
