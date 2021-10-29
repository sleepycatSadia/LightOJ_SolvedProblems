import java.util.Scanner;
public class Main{
public static void main (String[]args){
 Scanner sc=new Scanner (System.in);
 	int n=sc.nextInt();
 	for(int i=1;i<=n;i++){
         double r=sc.nextDouble();
         double pi=2*Math.acos(0.0);
 		double area=((4*r*r)-(pi*r*r))+Math.pow(10,-9);
        System.out.printf("Case "+i+": %.2f\n", area);  
}
}
}