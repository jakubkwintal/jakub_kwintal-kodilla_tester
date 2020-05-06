package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleSteps implements En {
    private int number;
    private String answer;

    public IsItDivisibleSteps() {


        Given("Let's check three", () -> { // dlaczego gdy w pliku feature użyjemy int, tutaj ta liczba się nie wyświetli tylko będzie {int}?
            this.number = 3;
        });

        Given("Let's check five", () -> {
            this.number = 5;
        });

        Given("Let's check fifteen", () -> {
            this.number = 15;
        });

        Given("Let's check twenty", () -> {
            this.number = 20;
        });

        Given("Let's check twenty one", () -> {
            this.number = 21;
        });

        Given("Let's check sixteen", () -> {
            this.number = 16;
        });

        Given("Let's check seventy three", () -> {
            this.number = 73;
        });

        Given("Let's check two hundred fifty five", () -> {
            this.number = 255;
        });


        When("I ask number is divisible", () -> {
            IsItDivisible isItDivisible = new IsItDivisible();
            this.answer = isItDivisible.checkIfDivisible(this.number);
        });


        Then("I should hear {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}