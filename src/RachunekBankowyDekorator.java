public class RachunekBankowyDekorator implements RachunekBankowyInterfejs {
    private double debet;
    private double maxDebet;
    private boolean debetExist;
    protected RachunekBankowy rachunekBankowy;

    public RachunekBankowyDekorator(RachunekBankowy rachunekBankowy) {
        this.rachunekBankowy = rachunekBankowy;
    }

    public RachunekBankowyDekorator(RachunekBankowy rachunekBankowy, double maxDebet) {
        this.rachunekBankowy = rachunekBankowy;
        this.debet = 0;
        this.maxDebet = maxDebet;
        this.debetExist = false;
    }

    public double getDebet() {
        return debet;
    }

    public void setDebet(double debet) {
        this.debet = debet;
    }

    @Override
    public void zwiekszSrodki(double srodki) {
        if (this.debetExist == true) {
            this.debet -= srodki;
            if (this.debet <= 0) {
                this.debetExist = false;
            }
            if (this.debet < 0) {
                this.rachunekBankowy.zwiekszSrodki(Math.abs(debet));
            }
        } else {
            this.rachunekBankowy.zwiekszSrodki(srodki);
        }

    }

    @Override
    public void zmniejszSrodki(double srodki) {
        if(hasEnoughMoney(srodki)) {
            this.rachunekBankowy.zmniejszSrodki(srodki);
        } else if (maxDebet > debet  && srodki < maxDebet - debet){
            this.debetExist = true;
            this.debet += srodki;
        }
    }

    @Override
    public boolean hasEnoughMoney(double srodki) {
       return this.rachunekBankowy.hasEnoughMoney(srodki);
    }

    @Override
    public void accept(RaportVisitor raport)
    {
        raport.visit(this);
    }
}
