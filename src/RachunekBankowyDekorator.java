public class RachunekBankowyDekorator implements RachunekBankowyInterfejs {

    protected RachunekBankowy rachunekBankowy;

    public RachunekBankowyDekorator(RachunekBankowy rachunekBankowy) {
        this.rachunekBankowy = rachunekBankowy;
    }

    @Override
    public void zwiekszSrodki(double srodki) {
        this.rachunekBankowy.zwiekszSrodki(srodki);
    }

    @Override
    public void zmniejszSrodki(double srodki) {
        if(hasEnoughMoney(srodki)) {
            this.rachunekBankowy.zmniejszSrodki(srodki);
        }

    }

    @Override
    public boolean hasEnoughMoney(double srodki) {
       return this.rachunekBankowy.hasEnoughMoney(srodki);
    }
}
