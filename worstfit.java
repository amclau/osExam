public class worstfit {
    public static void main(String[] args) {
        int[] memory={100,50,30,120,35};
        int[] process={40,10,30,60};
        boolean[] alocated=new boolean[5];
        for (int i = 0; i < 5; i++) {
                alocated[i]=false;
        }

        int j=0;
        for (int i = 0; i < 4; i++) {
            int diff=-1;
            int max_index=1;
            for (j= 0; j < 5; j++) {
                if(memory[j]-process[i]>diff&&memory[j]>=process[i])
                {
                    diff=memory[j]-process[i];
                  
                    max_index=j;
                }
            }
            System.out.println(process[i]+" -> "+memory[max_index]+" -> block no -> "+max_index);
            memory[max_index]=memory[max_index]-process[i];
            // System.out.println(" "+max_index+" ");
            // memory[max_index]=
            // alocated[max_index]=true;
           

        }

    }
}
