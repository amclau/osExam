public class sjf{
    public static void main(String[] args) {
        int[] process={1,2,3,4,5,6};
        int[] at={0,1,2,3,4,5};
        int[] bt={7,5,3,1,2,1};

        for (int i = 0; i < bt.length; i++) {
            
            int min=i;
            for (int j = i+1; j < bt.length; j++) {
                if(bt[j]<bt[min])
                {
                    min=j;
                }
            }
            int temp=bt[i];
            int temp_AT=at[i];
            int temp_PS=process[i];
            bt[i]=bt[min];
            at[i]=at[min];
            process[i]=process[min];
            bt[min]=temp;
            at[min]=temp_AT;
            process[min]=temp_PS;
        }
System.out.println("Process AT BT");
System.out.println("-----");

        for (int i = 0; i < bt.length; i++) {
            System.out.println(process[i]+"      "+at[i]+"   "+bt[i]);
        }
        int ct=0;
        int[] ct_arr=new int[6];
        boolean[] ct_flag=new boolean[6];
        for (int i = 0; i < 6; i++) {
            ct_flag[i]=false;
    }
        boolean x=true;
        while(x)
        {
            for (int index = 0; index < 6; index++) {
                if(at[index]<=ct&&ct_flag[index]==false)
                {
                    ct+=bt[index];
                    ct_arr[index]=ct;
                    ct_flag[index]=true;

                }
            }
int ck_true=0;
for (int i = 0; i < ct_flag.length; i++) {
    if(ct_flag[i]==true)
    {
        ck_true+=1;
    }
}
if(ck_true==6)
{
    x=false;
}
        }


        System.out.println("P A T c");
        System.out.println("-------");
        for (int i = 0; i < bt.length; i++) {
            System.out.println(process[i]+" "+at[i]+" "+bt[i]+" "+ct_arr[i]);
        }
    }
}