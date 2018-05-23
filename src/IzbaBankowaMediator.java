public interface IzbaBankowaMediator {
//    public void przelewMiedzybankowy(Bank bank, RachunekBankowy rachunek, double kwota);
    public void sendMoney(Bank bank, Bank bankDocelowy, double srodki, RachunekBankowy nadawca, RachunekBankowy odbiorca);
    public void addBank(Bank bank);
}
