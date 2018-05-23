public interface IzbaBankowaMediator {
    public void sendMoney(Bank bank, double srodki, RachunekBankowy nadawca, RachunekBankowy odbiorca);
    public void addBank(Bank bank);
}
