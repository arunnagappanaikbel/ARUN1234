public class primeNumber {
    public static void main(String[] args) {



        int num = 100, count;



        for (int i = 1; i < num; i++) {

            count = 0;

            int j;

            for (j= 2; j <= i / 2; j++) {

                if (i % j == 0) {

                    count++;

                    break;

                }

            }



            if (count == 0) {

                for (int f = 1; f <= 10; f++) {

                    System.out.print(i*f+"\t");

                }

                System.out.println();

            }

        }

    }
}
