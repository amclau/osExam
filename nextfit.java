public class nextfit {
    public static void main(String[] args) {
        int[] memory={20,100,5,30,6,3};
        int[] process={40,10,30,10};
        boolean[] alocated=new boolean[6];
        for (int i = 0; i < 6; i++) {
                alocated[i]=false;
        }
        // int next_fit_index=0;
        int j=0;

        for (int i = 0; i < 4; i++) {
            int x=0;



            int index_to_check=j;
            int flag=0;
            while(x<6)
            {
                if(memory[index_to_check]>=process[i]&&alocated[index_to_check]==false)
                {
                    flag=1;
                    j=index_to_check+1;
                    alocated[index_to_check]=true;
                    break;
                }

                index_to_check=(index_to_check+1)%6;

            x++;
            }
         if(flag==1)
         {
          
            System.out.println(process[i]+" -> "+memory[j-1]);
         }
         if(flag==0)
         {System.out.println(process[i]+"  DEDLOCK");

         }

        }

    }
}