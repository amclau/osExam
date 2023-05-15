#include <stdio.h>
// #include<conio.h>
int mutx = 1, empty = 10, full = 0, x = 0;
int signal(int x)
{
    x++;
    return x;
}
int wait(int x)
{
    x--;
    return x;
}
void producer()
{
    mutx--;
    full = signal(full);
    empty = wait(empty);
    x = signal(x);
    printf("produce item %d", x);
    mutx++;
}
void consumer()
{
    mutx--;
    full = wait(full);
    empty = signal(empty);
    printf("Consumed item %d", x);
    x = wait(x);
    mutx++;
}
void main()
{
    int n;

    while (1)
    {
        printf("Enter choise:\n1 pro\n2 cons\n3 exit");
        scanf("%d", &n);
        switch (n)
        {
        case 1:
            if (mutx == 1 && empty != 0)
            {
                producer();
            }
            else
            {
                printf("full");
            }

            break;
        case 2:
            if (mutx == 1 && full != 0)
            {
                consumer();
            }
            else
            {
                printf("full");
            }

            break;
        case 3:
            exit(1);
            break;
        }
    }
}