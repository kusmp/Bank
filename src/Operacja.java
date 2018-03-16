import java.util.Date;

    public class Operacja {
    private Date data;
    private String nazwaOperacji;

    public Operacja(String nazwaOperacji) {
        this.data = new Date();
        this.nazwaOperacji = nazwaOperacji;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNazwaOperacji() {
        return nazwaOperacji;
    }

    public void setNazwaOperacji(String nazwaOperacji) {
        this.nazwaOperacji = nazwaOperacji;
    }
}
