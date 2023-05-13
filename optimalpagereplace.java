public class optimalpagereplace {
    static int max=10000;
    static int[] data={1,2,3,4,5,3,4,1,6,7,8,7};
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
        int max_val=-1;
        int max_index=-1;
        for (int i = 0; i < 4; i++) {
            if(arr[i]>max_val)
            {
                max_index=i;
                max_val=arr[i];
            }
        }
        return max_index;
    }
    public static int getindex(int target,int currentpage)
    {
        for (int i = currentpage; i < 12; i++) {
            if(data[i]==target)
            {
                return i;

            }
        }
return max-=1;
    }
    public static void main(String args[])
    {
        
        int[][] graph=new int[4][12];
        int hit=0,miss=0,previouspageFault=0;

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
               graph[i][j] = 0;
            }
         }

         graph[0][0]=1;
         graph[0][1]=1;
         graph[0][2]=1;
         graph[0][3]=1;
         
         
         graph[1][1]=2;
         graph[1][2]=2;
         graph[1][3]=2;


         graph[2][2]=3;
         graph[2][3]=3;


         graph[3][3]=4;



for (int i = 4; i < 12; i++) {
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
