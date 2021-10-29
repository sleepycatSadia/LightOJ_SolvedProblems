import java.util.Scanner;
public class Main{
public static void main (String[]args){
 Scanner sc=new Scanner (System.in);
 	int n=sc.nextInt();
 	for(int i=1;i<=n;i++){
         int sum=0;
         String s=sc.nextLine();
 		int num=sc.nextInt();
         for(int j=1;j<=num;j++){
             int x=sc.nextInt();
             if(x>0)
                sum+=x;
         }
        System.out.println("Case "+i+": "+sum);  
}
}
}