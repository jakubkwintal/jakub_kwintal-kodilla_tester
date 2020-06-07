import java.util.Random;

public class RandomNumbers {

    int minNum;
    int maxNum;
    int temp;


    public RandomNumbers() {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.temp = temp;
    }

    public int getCountOfRandomNumber() {
        Random random = new Random();

        int max = 5001;
        int sum = 0;
        while (sum < max) {
            temp = random.nextInt(31);
            System.out.println(temp); // wyświetla każdy kolejny losowany numer aż suma dojdzie do 5001
            sum = sum + temp;
        }
        return sum;
    }

    public int getMinNum() {

        if (temp < minNum) {      //warunek by wyciągnac najmniejsza wylosowana liczbe
            minNum = temp;
        }
        return minNum;
    }

    public int getMaxNum() {
        if (temp > maxNum) {  //max wartosc
            maxNum = temp;
        }
        return maxNum;
    }


    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();

        int resultSum = randomNumbers.getCountOfRandomNumber();
        System.out.println(resultSum);
        int minNumber = randomNumbers.getMinNum();
        System.out.println(minNumber);
        int maxNumber = randomNumbers.getMaxNum();
        System.out.println(maxNumber);
    }
}