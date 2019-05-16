package test53;

public class total {
    public int total(int p,int q,int r){
        int end1=0,end2=0,end3=0;
            if(p==1&&r==1)
                    end1=0;
            else end1=1;
            if(q==1&&r==0)
                end2=0;
            else end2=1;
            if (q==1&&end1==1&&end2==1&&p==1)
                end3=0;
            else end3=1;
            return end3;
    }
}
