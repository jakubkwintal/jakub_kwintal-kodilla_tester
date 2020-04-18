import java.util.Random;

public class Loops {

    public static void main(String[] args) {



        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int n = 0; n < names.length; n++) {
            System.out.println(names[n]);

            int i = 0;
            while (i <= 10) {
                System.out.println(i);
                i++;
            }

        }

        int sum = 0;
        int[] cyferki = new int[]{1, 3, 5, 7, 9};
        for (int n = 0; n < cyferki.length; n++) {
            sum = sum + cyferki[n];

        }
        System.out.println(sum);


    }

//    public int getCountOfRandomNumber(int max) {
//        Random random = new Random();
//        int result = 0;
//        int sum = 0;
//        while (sum < max) {
//            int temp = random.nextInt(10);
//            sum = sum + temp;
//            result++;
//            System.out.println(sum);
//        }
//        return result;
//
//
//    }


}