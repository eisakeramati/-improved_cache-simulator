package AUT.CEIT.CA;

/**
 * Created by eisak on 2018-04-12.
 */
public class victimCache {

    private int size = 256;
    private adress[] vicCahce;
    private int counter = 0;

    public victimCache() {
        vicCahce = new adress[size];
    }

    public int refrenceHandler(int refrence) {
        int output = refrenceChecker(refrence);
        adress a = vicCahce[output];
        if (output != -1) {
            shifter(output);
            vicCahce[0] = a;
            vicCahce[0] = a;
            return vicCahce[output].getNumber();
        }

        return -1;
    }

    private int refrenceChecker(int check) {
        int checked = -1;
        for (int i = 0; i < counter + 1; i++) {
            if (vicCahce[i].getNumber() == check)
                checked = i;
        }

        return checked;
    }

    public void adderToCache(int givenAdd) {

        shifter(vicCahce.length);
        vicCahce[0] = new adress(givenAdd);
    }

    private void shifter(int index) {
        for (int i = index; i > 0; i--) {
            vicCahce[i] = vicCahce[i - 1];
        }
    }


}
