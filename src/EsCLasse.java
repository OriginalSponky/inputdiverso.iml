import java.util.Scanner;

public class EsCLasse {



    public static void main(String[] arg) {
        int i=0;
        Scanner myCA= new Scanner(System.in);

        int con=1;
        do {
            System.out.println("Dammi un valore");
            i= myCA.nextInt();
            con=con+1;
        }
        while ((i>=0) && (con<15));






    }
}