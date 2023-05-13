
public class bestfit {

    public static void main(String[] args) {
        int[] memory={100,50,30,120,35};
        int[] process={40,10,30,60};
        boolean[] alocated=new boolean[5];
        for (int i = 0; i < 5; i++) {
                alocated[i]=false;
        }

        int j=0;
        for (int i = 0; i < 4; i++) {
            int diff=100000;
            int min_index=100000;
            for (j= 0; j < 5; j++) {
                if(diff>memory[j]-process[i]&&alocated[j]==false&&memory[j]>=process[i])
                {
                    diff=memory[j]-process[i];
                    min_index=j;
                }
            }
            // System.out.println(" "+min_index+" ");
            alocated[min_index]=true;
            System.out.println(process[i]+" -> "+memory[min_index]);

        }

    }
    
}
