import java.util.*;
public class fifoPagereplacement {

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
    public static void main(String args[])
    {
        int[] data={1,2,3,4,5,3,4,1,6,7,8,7};
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
        graph[previouspageFault][i]=data[i];
        previouspageFault=(previouspageFault+1)%4;
        miss+=1;
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
