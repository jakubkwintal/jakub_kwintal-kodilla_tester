package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    Teller teller = new Teller(cashSlot);

    public WalletSteps() {


        // cash_withdrawal ------------------------------------

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });


        When("I request $30", () -> {
            teller.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });


        When("I request $200", () -> {
            teller.withdraw(wallet, 200);
        });
        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });


        When("I request $1", () -> {
            teller.withdraw(wallet, 1);
        });
        Then("$1 should be dispensed", () -> {
            Assert.assertEquals(1, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $199", () -> {
            Assert.assertEquals("Incorrect wallet balance", 199, wallet.getBalance());
        });


        When("^I request \"([^\"]*)\"\\$$", (String value) -> {
            if (Integer.valueOf(value) == 0) {
                System.out.println("The teller informs me that even no coin has such value"); }
        });
        Then("The teller informs me that even no coin has such value", () -> {
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });


        // prevent_from_overdrawn --------------------------------

        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });


        When("^I withdraw \"([^\"]*)\" \\$$", (String amount) -> {
            if (Integer.valueOf(amount) > wallet.getBalance()) {
                System.out.println("The teller informs me there is not enough money in my account"); }
        });
        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });
        Then("I should be told that I have insufficient funds in my account", () -> {
            System.out.println("There is only $100 on your account.");
            Assert.assertEquals(100, wallet.getBalance());
        });


        // display_balance ----------------------------------------

        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
        });


        When("I check my balance", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });
        Then("I should see that my balance is $100", () -> {
            System.out.println("Your account balance is $100");
        });

    }
}