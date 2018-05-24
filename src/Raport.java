import java.util.ArrayList;
import java.util.List;

public class Raport implements RaportVisitor{

    private List<RachunekBankowy> produktyDoRaportu;
    private double criteriaBalance;

    public Raport(double balance)
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
    public void visit(Lokata lokata) {
        if(lokata.getSrodki()>criteriaBalance){
            produktyDoRaportu.add(lokata);
        }
    }
    @Override
    public List<RachunekBankowy> getProduktyDoRaportu() {
        return produktyDoRaportu; }

}
