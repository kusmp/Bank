import java.util.List;

public class HistoriaBanku {
    private static List<Historia> historiaBanku;

    public static List<Historia> getHistoriaBanku() {
        return historiaBanku;
    }

    public static void addHistoriaBanku(Historia histora) {
        HistoriaBanku.historiaBanku.add(histora);
    }
}
