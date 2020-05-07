package wallet;

public class CashSlot {
    private int contents;

    Wallet wallet = new Wallet();

    public int getContents() {
        if (contents <= wallet.getBalance()) { // dodałem warunek, który uniemożliwia włożenie do kasetki nie więcej niż jest na rachunku
            return contents;
        }
        return 0;
    }
        public void dispense (int amount){
            this.contents = amount;
        }
    }
