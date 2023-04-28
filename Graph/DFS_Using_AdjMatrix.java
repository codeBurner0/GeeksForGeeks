package Graph;

import java.util.Scanner;

public class DFS_Using_AdjMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int arr[][]=new int[v][v];
        for(int i=0;i<e;i++){
            int sv=sc.nextInt();
            int ev=sc.nextInt();
            arr[sv][ev]=1;
            arr[ev][sv]=1;
        }
        print(arr);
    }

    public static void print(int[][] arr) {
        int v=arr.length;
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                printDFS(arr,i,visited);
            }
        }
    }

    public static void printDFS(int[][] arr,int s,boolean visited[]) {
        System.out.print(s+" ");
        visited[s]=true;
        int v=arr.length;
        for(int i=0;i<v;i++){
            if(visited[i]==false && arr[s][i]==1){
                printDFS(arr,i,visited);
            }
        }
    }
}
