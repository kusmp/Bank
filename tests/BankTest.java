import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank("Bank Zachodni WBK");

    @org.junit.jupiter.api.Test
    void getNazwa() {
        assertEquals(bank.getNazwa(), "Bank Zachodni WBK");
    }
}