import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    double pi=3.14159265358979323;
    for(int i=1;i<=T;i++){
      double r=sc.nextDouble();
      double s=Math.pow((2*r),2);
      double c=(pi*Math.pow(r,2));
      double ans=s-c;
      ans+=Math.pow(10,-9);
      System.out.printf("Case "+i+": %.2f", ans);
      System.out.println();
    }
  }
}