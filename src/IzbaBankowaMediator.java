public interface IzbaBankowaMediator {
    public void przelewMiedzybankowy(Bank bank, RachunekBankowy rachunek, double kwota);
    public void addBank(BankColleague bank);
}
