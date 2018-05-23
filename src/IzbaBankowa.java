import java.util.ArrayList;
import java.util.List;

public class IzbaBankowa implements IzbaBankowaMediator {
    List<BankColleague> listaBankow;

    public IzbaBankowa() {
        this.listaBankow = new ArrayList<>();
    }

    public void addBank(BankColleague bank) {
        this.listaBankow.add(bank);
    }

    @Override
    public void przelewMiedzybankowy(Bank bank, RachunekBankowy rachunek, double kwota) {

        for (BankColleague b: this.listaBankow) {
            if(b.equals(bank)){

            }
        }

    }
}
