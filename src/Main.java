public class Main {
    public static void main(String[] args) {
        double[] counts = {2.1, 5.15, -3.10, 8.2, -12.3, 15.4, -20.6, 10.7, -13.5, 25.2, -56.4, 6.13, 4.85, 4.12, 6.1};
        double sum = 0;
        boolean negative = false;
        int length = 0;

        for (double valli : counts) {
            if (valli < 0) {
                negative = true;
            }
            if (negative == true) {
                if (valli > 0) {
                   sum = sum + valli;
                    length++;
                }
            }
            }
        double result = sum / length;
        System.out.println(result);
        }


    }