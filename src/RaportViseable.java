import java.util.ArrayList;
import java.util.List;

public class RaportViseable implements RaportVisitor{

    private List<RachunekBankowy> produktyDoRaportu;
    private List<RachunekBankowyDekorator> debetDoRaportu;
    private double criteriaBalance;

    RachunekBankowyInterfejs ri = new RachunekBankowy();
    RachunekBankowyInterfejs ri2 = new RachunekBankowyDekorator((RachunekBankowy)ri);
    public RaportViseable(double balance)
    {
        produktyDoRaportu = new ArrayList<>();
        criteriaBalance = balance;
    }

    @Override
    public void visit(RachunekBankowy rachunek) {
        if(rachunek.getSrodki() > criteriaBalance){
            produktyDoRaportu.add(rachunek);
        }
    }

    @Override
    public void visit(Kredyt kredyt) {
        if(kredyt.getSrodki()>criteriaBalance){
            produktyDoRaportu.add(kredyt);
        }

    }

    @Override
    public void visit(RachunekBankowyDekorator debet) {
        if(debet.getDebet() > criteriaBalance){
            debetDoRaportu.add(debet);
        }

    }

    @Override
    public void visit(Lokata lokata) {
        if(lokata.getSrodki()>criteriaBalance){
            produktyDoRaportu.add(lokata);
        }
    }

    @Override
   public List<RachunekBankowy> getProduktyDoRaportu() {
        return produktyDoRaportu; }

    @Override
    public List<RachunekBankowyDekorator> getDebetDoRaportu() {
        return debetDoRaportu; }
}
