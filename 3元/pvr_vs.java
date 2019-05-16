package Test51;

public class pvr_vs {
    //(p∪r)Vs  方法：pvr_vsm
    public int pvr_vsm(int p,int v,int s){
        int end2=0;
        if(p==1||v==1){
            if(s==1||s==0)
                end2= 1;
        }
        else if(p==0&&v==0){
            if(s==1)
               end2= 1;
            else if(s==0)
                end2= 0;
        }
        return end2;
    }
}
