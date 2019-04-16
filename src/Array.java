import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {

        int [] flightX = new int [5];
        flightX[0]=11; flightX[1]=12;flightX[2]=13;flightX[3]=14;flightX[4]=15;
        for (int i = 0; i < flightX.length;i++)
        {
            System.out.println(flightX[i]);
        }

int trainZ[][] = { {20,21,22,23},{24,25,26,27},{28,29,30,31},{32,33,34,35}};
        for(int i = 0; i < 4; i++) {

            for (int p = 0; p < 4; p++) {
                System.out.println(trainZ[i][p]);
            }


        }


    }
}
