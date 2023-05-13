public class LRUpaging {
    static int max=0;
    static int[] data={7,0,1,2,0,3,0,4,2,3,0,3,2,3};
    public static boolean pagepresent(int j,int page,int graph[][])
    {
        for (int i = 0; i < 4; i++) {
            if(graph[i][j]==page)
            {
                
                return true;
            }
        }
        return false;

    }
    
    public static int findoptimalindex(int one,int two,int three,int four,int currentpage)
    {
        int one_index=getindex(one,currentpage);
        int two_index=getindex(two,currentpage);
        int three_index=getindex(three,currentpage);
        int four_index=getindex(four,currentpage);

        int[] arr=new int[4];

        arr[0]=one_index;
        arr[1]=two_index;
        arr[2]=three_index;
        arr[3]=four_index;
        int min_val=10000;
        int min_index=10000;
        for (int i = 0; i < 4; i++) {
            if(arr[i]<min_val)
            {
                min_index=i;
                min_val=arr[i];
            }
        }
        return min_index;
    }
    public static int getindex(int target,int currentpage)
    {
        for (int i = currentpage; i >=0; i--) {
            if(data[i]==target)
            {
                return i;

            }
        }
return max=(max+1)%4;
    }
    public static void main(String args[])
    {
        
        int[][] graph=new int[4][14];
        int hit=0,miss=0,previouspageFault=0;

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
               graph[i][j] = 0;
            }
         }

         graph[0][0]=7;
         graph[0][1]=7;
         graph[0][2]=7;
         graph[0][3]=7;
         
         
         graph[1][1]=0;
         graph[1][2]=0;
         graph[1][3]=0;


         graph[2][2]=1;
         graph[2][3]=1;


         graph[3][3]=2;



for (int i = 4; i < 14; i++) {
    if(pagepresent(i-1, data[i],graph))
    {
        hit+=1;
        for (int j = 0; j < 4; j++) {
            graph[j][i]=graph[j][i-1];
        }
        System.out.println("page Hit at\t"+i);
    }
    else{
        System.out.println("page miss at\t"+i);
        for (int j = 0; j < 4; j++) {
            graph[j][i]=graph[j][i-1];
        }


        int pageindextoreplace=findoptimalindex(graph[0][i],graph[1][i],graph[2][i],graph[3][i],i+1);
        graph[pageindextoreplace][i]=data[i];
        miss++;
    }
}


for (int i = 0; i < graph.length; i++) {
    for (int j = 0; j < graph[i].length; j++) {
    //    graph[i][j]
        System.out.print(graph[i][j]+"\t");
}
System.out.println("\n");
 }

 System.out.println("page hit = "+hit);
    }
}
