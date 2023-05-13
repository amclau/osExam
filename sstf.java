import java.util.*;
public class sstf {
    public static void main(String args[])
    {
        int[] requests={82,170,43,140,24,16,190};


    int head=50;

    int total=0;

    boolean[] visited=new boolean[7];

    for (int i = 0; i < 7; i++) {
        int mindistance=Integer.MAX_VALUE;
        int nextidx=-1;
        for(int j=0;j<7;j++)
        {
            if(!visited[j])
            {
                int dist=Math.abs(head-requests[j]);
                if(dist<mindistance)
                {
                    mindistance=dist;
                    nextidx=j;

                }

            }
        }


        visited[nextidx]=true;
        total+=mindistance;
        head=requests[nextidx];

    }
System.out.println("Result is :"+total);



    }
} 