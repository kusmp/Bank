public interface BankMediator {

    public void dodajBank(Bank bank);
    public void przelewMiedzybankowy(Bank bankNadawczy, Bank bankOdbiorczy, RachunekBankowy nadawca, RachunekBankowy odbiorca, double kwota);

}
