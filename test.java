public class test {
    public static void main(String[] args) {
        int[] memory={10,100,50,30,120,35};
        int[] process={40,10,30,60};
        boolean[] alocated=new boolean[5];
        for (int i = 0; i < 5; i++) {
                alocated[i]=false;
        }
        // int next_fit_index=0;
        int j=0;

        for (int i = 0; i < 4; i++) {
            // System.out.println("start :  "+j+" ");
            int x=0;
            int index_to_check=j;
            while(x<4)
            {
                
                System.out.print(index_to_check);
                index_to_check=(index_to_check+1)%4;

            x++;
            }
            j=1;
         System.out.println("\n");
          
            

        }

    }
}