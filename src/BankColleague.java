public abstract class BankColleague {

    protected BankMediator mediator;
    protected String nazwa;

    public BankColleague(BankMediator mediator, String nazwa) {
        this.mediator = mediator;
        this.nazwa = nazwa;
    }
    public abstract void wyslane(String msg);
    public abstract void odebrane(String msg);

}
