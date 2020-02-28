import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
            Random random = new Random();

            int max = 5001;
            int sum = 0;
            while (sum < max) {
                int temp = random.nextInt(31);
                sum = sum + temp;
            }
            System.out.println(sum);

              }
        }
    }
            }

