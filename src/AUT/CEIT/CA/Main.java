package AUT.CEIT.CA;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        long a = Long.parseLong("10000000000000000000000000000000",2);
//        System.out.println(a);
//
//        for (int i = 0; i < 5; i++) {
//            i++;
//            System.out.println(i);
//        }

        inputCreator inputCreator = new inputCreator();
        for (int i = 0; i <inputCreator.getFianl_arr().length ; i++) {
            if (i==100)
                System.out.println("donedonedonedonedonedonedonedonedonedonedonedone");
            System.out.println(inputCreator.getFianl_arr()[i]);
        }
    }
}
