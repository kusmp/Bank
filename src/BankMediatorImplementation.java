import java.util.ArrayList;
import java.util.List;

public class BankMediatorImplementation implements BankMediator {
    List<BankColleague> listaBankow;

    public BankMediatorImplementation() {
        this.listaBankow = new ArrayList<>();
    }


    @Override
    public void dodajBank(Bank bank) {
       // listaBankow.add(bank);
    }

    @Override
    public void przelewMiedzybankowy(Bank bankNadawczy, Bank bankOdbiorczy, RachunekBankowy nadawca, RachunekBankowy odbiorca, double kwota) {

        for (BankColleague b: this.listaBankow) {
            if(b.equals(bankOdbiorczy)){
                b.odebrane("Odebrano przelew");
            }
        }

    }
}
