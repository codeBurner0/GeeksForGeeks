package Graph;

import java.util.Scanner;

public class DfsUsingArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int adj_matr[][]=new int[v][v];
        for(int i=0;i<e;i++){
            int sv=sc.nextInt();
            int ev=sc.nextInt();
            adj_matr[sv][ev]=1;
            adj_matr[ev][sv]=1;
        }
        print(adj_matr);
        
    }

    private static void print(int[][] adj_matr) {
        int v=adj_matr.length;
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            printHelper(adj_matr,i,visited);
        }
    }

    private static void printHelper(int[][] adj_matr, int sv, boolean[] visited) {
        System.out.print(sv+" ");
        visited[sv]=true;
        int v=adj_matr.length;
        for(int i=0;i<v;i++){
            if(adj_matr[sv][i]==1 && visited[sv]==false){
                printHelper(adj_matr, i, visited);
            }
        }
    }
}
