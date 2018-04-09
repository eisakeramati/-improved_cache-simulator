package AUT.CEIT.CA;

import java.util.Random;

/**
 * Created by eisak on 2018-04-09.
 */
public class inputCreator {

    private int first_arr[];
    private int fianl_arr[];

    public int[] getFianl_arr() {
        return fianl_arr;
    }

    public void setFianl_arr(int[] fianl_arr) {
        this.fianl_arr = fianl_arr;
    }

    public inputCreator() {
        first_arr = new int[100];
        fianl_arr = new int[500];

    }

    public int[] getFirst_arr() {
        return first_arr;
    }

    public void setFirst_arr(int[] first_arr) {
        this.first_arr = first_arr;
    }

    private void randomSetter() {
        Random random = new Random(2000);

        for (int i = 0; i < 100; i++) {
            first_arr[i] = random.nextInt();
        }
    }
   
    private void finSetter()
    {
        for (int i = 0; i < ; i++) {
            if ()
        }
    }

    

}
