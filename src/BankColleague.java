public abstract class BankColleague {
    protected String nazwa;
    protected IzbaBankowaMediator mediator;

    public BankColleague(IzbaBankowaMediator mediator, String nazwa) {
        this.mediator = mediator;
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
}
