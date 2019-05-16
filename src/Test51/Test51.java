package Test51;

import java.util.Scanner;
//公式A=﹁(p∪q)∩((p∪r)∪r)
public class Test51 {
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        int [][]num=new int [16][4];
            for(int j=0;j<8;j++) {
                num[j][0] = 0;
                if(j>=0&&j<4)
                    num[j][1]=0;
                if(j>=4)
                    num[j][1]=1;
            }
          for(int k=8;k<16;k++){
                num[k][0]=1;
                if(k>=8&&k<=11)
                    num[k][1]=0;
                if(k>=12)
                    num[k][1]=1;
            }
            for(int i=0;i<4;i++){
                num[4*i][2]=0;
                num[4*i][3]=1;
                num[4*i+1][2]=0;
                num[4*i+1][3]=0;
                num[4*i+2][2]=1;
                num[4*i+2][3]=1;
                num[4*i+3][2]=1;
                num[4*i+3][3]=0;
            }//给p q r s赋值，以4x16方格表示。
            _pvq pvq=new _pvq();
            pvr_vs pvr=new pvr_vs();
            _pvq_pvr_vs pqrs=new _pvq_pvr_vs();
        System.out.println("p   q   r   s       ﹁(p∪q)            (p∪r)∪s          ﹁(p∪q)∪(p∪r)∪s  ");
        for(int s=0;s<16;s++){
                System.out.println(num[s][0]+"   "+num[s][1]+"   "+num[s][2]+"   "+num[s][3]
                +"          "+pvq.pvqm(num[s][0],num[s][1])+"                "+pvr.pvr_vsm(num[s][0],num[s][2],num[s][3])
                +"                  "+pqrs._pvq_pvr_vsm(pvq.pvqm(num[s][0],num[s][1]),pvr.pvr_vsm(num[s][0],num[s][2],num[s][3])));
        }
    }
}
