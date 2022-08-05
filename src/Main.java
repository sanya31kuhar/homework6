public class Main {

    public static void main(String[] args) {
        // task 1
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false};

        //task 2
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i != ints.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i != doubles.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i != booleans.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        //task 3
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i =booleans.length-1; i >=0; i--) {
            System.out.print(booleans[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        //task 4
        for (int i =0; i< ints.length; i++) {
            if (ints[i]% 2==1) {
                ints[i]++;
            }
             System.out.print(ints[i]);
            if (i != ints.length-1) {
                System.out.print(",");
            }
    }
    }
}
