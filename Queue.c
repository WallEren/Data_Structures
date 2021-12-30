/*
Capgemini ADAPT Program
Queue
Link: https://onlinegdb.com/mZsVNjBCn
*/

#include <stdio.h>
#include <stdlib.h>

#define QUEUE_MAX_SIZE 5

struct queue
{
    int queue[QUEUE_MAX_SIZE];
    int rear;
    int front;
};
typedef struct queue QUEUE;

int insert_rear(int item, QUEUE *q)
{
    if(q->rear == QUEUE_MAX_SIZE-1)
    {
        printf("Queue is full, cannot insert at the rear...\n");
        return 0;
    }
    q->rear++;
    q->queue[q->rear] = item;
}

int delete_front(QUEUE *q)
{
    if(q->rear < q->front)
    {
        printf("Queue is empty, cannot delete at the front...\n");
        return 0;
    }
    printf("%d is deleted from the queue...\n",q->queue[q->front]);
    q->front++;
    if(q->rear < q->front)
    {
        q->rear = -1;
        q->front = 0;
    }
}

int display(QUEUE *q)
{
    if(q->rear < q->front)
    {
        printf("Queue is empty, cannot delete at the front...\n");
        return 0;
    }
    printf("Queue contents are...\n");
    for(int index = q->front; index <= q->rear; index++)
    {
        printf("%d\t",q->queue[index]);
    }
}

int main()
{
    QUEUE q;
    q.rear = -1;
    q.front = 0;
    int option;
    int element;
    
    while(1)
    {
        printf("\nPress 1 to insert an element at the rear...");
        printf("\nPress 2 to delete an element at the front...");
        printf("\nPress 3 display the elements of queue...");
        printf("\nPress 4 to exit...");
        printf("\nEnter the choice...");
        scanf("%d", &option);
        switch(option)
        {
            case 1:
            {
                printf("\nEnter the element to insert at rear...");
                scanf("%d", &element);
                insert_rear(element, &q);
                display(&q);
                break;
            }
            case 2:
            {
                delete_front(&q);
                display(&q);
                break;
            }
            case 3:
            {
                display(&q);
                break;
            }
            case 4:
            {
                exit(0);
            }
            default:
            {
                printf("Invalid Option...\nEnter a valid choice...\n");
            }
        }
    }
    return 0;
}
