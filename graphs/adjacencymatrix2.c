#include<stdio.h>
#define MAX 10
void main()
{
    char graph[MAX];
    int adj_mat[MAX][MAX]={0};
    int ver,i,j,ROW,COL,rel;
    char choice;
    printf("Enter I for indirect graph and D for direct graph:");
    scanf("%c",&choice);
    printf("Enter no of vertex:");
    scanf("%d",&ver);
    ROW=COL=ver;
    printf("Enter vertex values:\n");
    for(i=0;i<ver;i++)
    {
        fflush(stdin);
      scanf("%c",&graph[i]);
    }
    if(choice=='I'||choice=='i')
    {
        printf("Enter relation between vertex press 1 for connected and 0 for not connected");
        for(i=0;i<ROW;i++)
        {
            for(j=0;j<COL;j++)
            {
                if(i==j||(i>0&&i>j))
                  continue;
                printf("\nEnter relation %c->%c:",graph[i],graph[j]);
                scanf("%d",&rel);
                if(rel!=0)
                  adj_mat[i][j]=adj_mat[j][i]=1;
            }
        }
    }
    else if(choice=='d'||choice=='D')
    {
        printf("Enter relation between vertex press 1 for connected and 0 for not connected");
        for(i=0;i<ROW;i++)
        {
            for(j=0;j<COL;j++)
            {
                printf("\nEnter relation %c->%c",graph[i],graph[j]);
                scanf("%d",&rel);
                if(rel!=0)
                  adj_mat[i][j]=adj_mat[j][i]=1;
            }
        }
    }
    
    printf("Adjacency matrix:\n");
    for(i=0;i<ROW;i++)
    {
        for(j=0;j<COL;j++)
          printf("%d ",adj_mat[i][j]);
        printf("\n");
    }
    
}