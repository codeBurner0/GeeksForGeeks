import java.util.Scanner;
public class ProblemA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tCases=sc.nextInt();
        while(tCases-->0){
            int arrSize=sc.nextInt();
            int[] arr=new int[arrSize+1];
            for(int i=1;i<=arrSize;i++){
                arr[i]=sc.nextInt();
            }
            Boolean myres=true;
            for(int i=2;i<=arrSize;i++){
                if(arr[i-1]+arr[i-2]==arr[i]){
                    myres=false;
                    break;
                }
            }
            if(myres){
                System.out.println("Yes");
                for(int i=1;i<=arrSize;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            for(int i=1;i<=arrSize;i++){
                for(int j=1;j<=arrSize;j++){
                    if(i==j) continue;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    myres=true;
                    for(int k=2;k<=arrSize;k++){
                        if(arr[k-1]+arr[k-2]==arr[k]){
                            myres=false;
                            break;
                        }
                    }
                    if(myres){
                        System.out.println("Yes");
                        for(int k=1;k<=arrSize;k++){
                            System.out.print(arr[k]+" ");
                        }
                        System.out.println();
                        break;
                    }
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    myres=true;
                }
                if(myres) break;
            }
            if(!myres){
                System.out.println("No");
            }
            
        }
    }

        }
    

