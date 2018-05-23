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

    public boolean isDebetExist() {
        return debetExist;
    }

    public void setDebetExist(boolean debetExist) {
        this.debetExist = debetExist;
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
        } else if (!hasEnoughMoney(srodki) && maxDebet > debet  && srodki < maxDebet - debet + this.rachunekBankowy.getSrodki()){
            this.debetExist = true;
            Double dostepneSrodki = this.rachunekBankowy.getSrodki();
            this.rachunekBankowy.zmniejszSrodki(this.rachunekBankowy.getSrodki());
            srodki = srodki - dostepneSrodki;
           // this.rachunekBankowy.zmniejszSrodki();
           // srodki -= this.rachunekBankowy.getSrodki();
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
