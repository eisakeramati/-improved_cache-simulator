package AUT.CEIT.CA;

import java.util.Random;

/**
 * Created by eisak on 2018-04-09.
 */
public class inputCreator {

    private int first_arr[];
    private int final_arr[];

    public int[] getFianl_arr() {
        return final_arr;
    }

    public void setFianl_arr(int[] fianl_arr) {
        this.final_arr = fianl_arr;
    }

    public inputCreator() {
        first_arr = new int[100];
        final_arr = new int[500];
        randomSetter();
        finSetter();
    }

    public int[] getFirst_arr() {
        return first_arr;
    }

    public void setFirst_arr(int[] first_arr) {
        this.first_arr = first_arr;
    }

    private void randomSetter() {


        for (int i = 0; i < 100; i++) {
            first_arr[i] = randomNumberInRange(0, 2000);
        }
    }

    private void finSetter() {
        for (int i = 0; i < 100; i++) {
            final_arr[i] = first_arr[i];
        }

        int[] arr = new int[4];
        int temp = 0;
        int last = 0;
        int counter = 0;
        for (int i = 100; i < 500; i++) {
            if (counter % 4 == 0 || counter % 4 == 2) {
                int rand = randomNumberInRange(0, 99);
                final_arr[i] = first_arr[rand];
                i++;
                final_arr[i] = first_arr[rand] + 1;
                i++;
                final_arr[i] = first_arr[rand] + 2;
                i++;
                final_arr[i] = first_arr[rand] + 3;
                arr[indexArray(arr, last)] = rand;
                last++;
                counter++;
            } else if (counter % 4 == 3) {
                final_arr[i] = first_arr[arr[temp % 4]];
                i++;
                final_arr[i] = first_arr[arr[temp % 4]] + 1;
                i++;
                final_arr[i] = first_arr[arr[temp % 4]] + 2;
                i++;
                final_arr[i] = first_arr[arr[temp % 4]] + 3;
                counter++;
                temp++;
            } else {
                final_arr[i] = first_arr[randomNumberInRange(0, 99)];
                i++;
                final_arr[i] = first_arr[randomNumberInRange(0, 99)];
                i++;
                final_arr[i] = first_arr[randomNumberInRange(0, 99)];
                i++;
                final_arr[i] = first_arr[randomNumberInRange(0, 99)];
                counter++;
            }
        }
    }


    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    private int indexArray(int[] given, int last) {
        return last % 4;
    }


}
