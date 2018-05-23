public interface RachunekBankowyInterfejs {
    public void zwiekszSrodki(double srodki);
    public void zmniejszSrodki(double srodki);
    public boolean hasEnoughMoney(double srodki);
    public void accept(RaportVisitor raport);
}
