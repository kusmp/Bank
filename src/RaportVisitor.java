import java.util.List;

public interface RaportVisitor {
    public void visit(RachunekBankowy rachunek);
    public void visit(Kredyt kredyt);
    public void visit(Lokata lokata);
    public List<RachunekBankowy> getProduktyDoRaportu();
}
