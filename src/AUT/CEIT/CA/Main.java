package AUT.CEIT.CA;

import AUT.CEIT.CA.DirectMapCache;
import AUT.CEIT.CA.inputCreator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    static String fileaddress = "inputs//file1.txt";
    public static void main(String[] args) {
        //int[] a = {1,2,5,10,20,11,1,2,30,5,1,8,7,1,2,40,50,11,20,20,10,5,8,7};
        inputCreator inputCreator = new inputCreator();
        DirectMapCache dmc = new DirectMapCache(4096, 16);
        dmc.setData(Readfile(fileaddress));
        System.out.println(dmc.getHitRatioWithoutVictimCache()+"%");
        System.out.println(dmc.getHitRatioWithVictimCache()+"%");
    }




    public static int[] Readfile(String address) {
        String fileName = address;
        int[] addresses = new int[500];
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int i = 0;
            while((line = bufferedReader.readLine()) != null) {
                addresses[i] = Integer.parseInt(line, 2);
                i++;
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
        return addresses;
    }
}