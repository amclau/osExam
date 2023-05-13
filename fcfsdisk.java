import java.util.*;
class fcfsdisk
{
    public static void main(String srgs[])
    {
int[] numbers={82,170,43,140,24,16,190};
int[] numberstosort={82,170,43,140,24,16,190};
Arrays.sort(numberstosort);

int head=50;

int total=0;
for (int i = 0; i < 7; i++) {
    total+=Math.abs(numbers[i]-head);
    head=numbers[i];

}
System.out.println("ans "+total);


    }
}