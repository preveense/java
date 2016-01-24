public class {
  
  
  int sofd(String s) {
    int i; int sum=0;
    for(i=0 ; i<14 ; i++) {
     int d; 
     d =  (i%2 != 0) ? 2 *Integer.parseInt(s.substring(i,i+1)) : Integer.parseInt(s.substring(i,i+1));
     sum+= (d>9) ? (d/10 + d%10) : d;
    } 
    return sum;
  }

}
