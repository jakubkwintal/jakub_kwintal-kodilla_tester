package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });


        When("I request $30", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });


        When("I request $200", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 200);
        });
        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });


        When("I request $1", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 1);
        });
        Then("$1 should be dispensed", () -> {
            Assert.assertEquals(1, cashSlot.getContents());
        });


        When("I request $201", () -> { // ????????????
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 201); // ???????????????? ta kwota jest większa od depozytu
        });
        Then("The teller informs me there is not enough money in my account", () -> {
            // ???????????
        });


        When("I request $1000", () -> { // ????????????
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 1000); // ???????????????? ta kwota jest większa od depozytu
        });
        When("I request 0$", () -> { // ????????????
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 0); // ???????????
        });
        Then("The teller informs me that even no coin has such value", () -> {
            // ??????????
        });

    }
}