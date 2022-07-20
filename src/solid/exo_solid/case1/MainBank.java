package solid.exo_solid.case1;

public class MainBank {
    public static void main(String[] args) {
        BankService bankService1 = new BankService();
        Email contact = new Email("content", "rtabouguia@yahoo.com");


        bankService1.deposit(100,"123587942336");

    }
}
