package AUT.CEIT.CA;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        inputCreator inputCreator = new inputCreator();
//        for (int i = 0; i <inputCreator.getFianl_arr().length ; i++) {
//            System.out.println(inputCreator.getFianl_arr()[i]);
//        }


        adress[] vicChace = new adress[4];
        vicChace[0]= new adress(5);
        vicChace[0].setScore(9);
        vicChace[1] = new adress(8);
        vicChace[1].setScore(7);
        vicChace[2] = new adress(3);
        vicChace[2].setScore(13);
        vicChace[3] = new adress(1);
        vicChace[3].setScore(1);

        adress[] m = shifter(3,vicChace);
//
//
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].getNumber());
        }



    }

    public static adress[] shifter(int index, adress[] vicCahce)
    {
        for (int i = index; i >0; i--) {
            vicCahce[i] = vicCahce[i-1];
        }

        return vicCahce;
    }

}
