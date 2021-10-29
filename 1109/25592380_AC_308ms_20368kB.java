import java.util.*;
import java.util.HashMap;
import java.util.Set;
import java.lang.*; 
public class Main{ 
  static int countDivisors(int n){ 
    int cnt = 0; 
    for (int i = 1; i <= Math.sqrt(n); i++)         { 
      if (n % i == 0) { 
        if (n / i == i) 
          cnt++; 
        else
          cnt = cnt + 2; 
      } 
    } 
    return cnt; 
  } 
  public static LinkedHashMap<Integer,Integer> sortByValue(LinkedHashMap<Integer,Integer> hm){ 
    List<Map.Entry<Integer,Integer> > list = 
      new LinkedList<Map.Entry<Integer,Integer> >(hm.entrySet()); 
    
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
      public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2) {
        if(((o1.getValue())<(o2.getValue()))||(((o1.getValue())==(o2.getValue()))&& ((o1.getKey())>(o2.getKey()))))
          return -1; 
        else
          return 1; 
      } 
    }); 
    
    LinkedHashMap<Integer,Integer> temp = new LinkedHashMap<Integer,Integer>(); 
    for (Map.Entry<Integer,Integer> aa : list) { 
      temp.put(aa.getKey(), aa.getValue()); 
    } 
    return temp; 
  } 
  
  public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in);
    LinkedHashMap<Integer,Integer> h = new LinkedHashMap<Integer,Integer>();
    int i=1;
    while(i<=1000){
      h.put(i,countDivisors(i));
      i++;
    }
    LinkedHashMap< Integer, Integer> hm1 = sortByValue(h);
    int t=sc.nextInt();
    for (int j = 1; j <=t; j++) { 
      int p=sc.nextInt();
      System.out.println("Case "+j+": "+(hm1.keySet().toArray())[p-1 ]);
      
    }
  }
}