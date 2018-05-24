public class ZalozenieDebetu implements OperacjaBankowa {
    private RachunekBankowy rachunekBankowy;
    private double maxDebet;
    private Debet debet;

    public ZalozenieDebetu(RachunekBankowy rachunekBankowy, double maxDebet) {
        this.rachunekBankowy = rachunekBankowy;
        this.maxDebet = maxDebet;
    }

    public RachunekBankowy getRachunekBankowy() {
        return rachunekBankowy;
    }

    public double getMaxDebet() {
        return maxDebet;
    }

    public Debet getDebet() {
        return debet;
    }

    @Override
    public void wykonaj() {
        this.debet = new Debet(this.rachunekBankowy, this.maxDebet);
    }
}
