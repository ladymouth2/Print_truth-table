package test53;

import java.util.Scanner;

public class test53 {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        int[][] num = new int[16][4];
        for (int j = 0; j < 8; j++) {
            num[j][0] = 0;
            if (j >= 0 && j < 4)
                num[j][1] = 0;
            if (j >= 4)
                num[j][1] = 1;
        }
        for (int k = 8; k < 16; k++) {
            num[k][0] = 1;
            if (k >= 8 && k <= 11)
                num[k][1] = 0;
            if (k >= 12)
                num[k][1] = 1;
        }
        for (int i = 0; i < 4; i++) {
            num[4 * i][2] = 0;
            num[4 * i][3] = 1;
            num[4 * i + 1][2] = 0;
            num[4 * i + 1][3] = 0;
            num[4 * i + 2][2] = 1;
            num[4 * i + 2][3] = 1;
            num[4 * i + 3][2] = 1;
            num[4 * i + 3][3] = 0;
        }//给p q r s赋值，以4x16方格表示。
        total total=new total();
        System.out.println("p   q   r                 p→﹁r∩q→r∩q→﹁p");
        for(int s=0;s<16;s++){
            System.out.println(num[s][0]+"   "+num[s][1]+"   "+num[s][2]+"   "
                    +"               "+total.total(num[s][0],num[s][1],num[s][2]));
        }
    }
}
