
import java.io.InputStreamReader;
import java.io.*;
public class inputdiverso {


    public static void main (String[] arg){

        InputStreamReader mioInput= new InputStreamReader(System.in);
        BufferedReader miaTastiera= new BufferedReader(mioInput);
        String s;
        int n;
        try {
            s = miaTastiera.readLine();

        }
    catch (Exception e){
            System.out.println("problema nella lettura da tastiera");
        }


    }




}
