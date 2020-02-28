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
    }
}