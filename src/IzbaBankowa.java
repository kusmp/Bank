import java.util.ArrayList;
import java.util.List;

public class IzbaBankowa implements IzbaBankowaMediator {
    List<Bank> listaBankow;

    public IzbaBankowa() {
        this.listaBankow = new ArrayList<>();
    }

    @Override
    public void sendMoney(Bank bank, Bank bankDocelowy, double srodki, RachunekBankowy nadawca, RachunekBankowy odbiorca) {
        for (Bank b:this.listaBankow) {
            if (b == bankDocelowy) {
                Przelew przelew = new Przelew(nadawca, odbiorca, srodki);
                b.wykonajOperacje(przelew);
            }
        }
    }

    @Override
    public void addBank(Bank bank) {
        this.listaBankow.add(bank);
    }
}
