public class {
  
  
  int sofd(String s) {
    int i; int sum=0;
    for(i=0 ; i<14 ; i++) {
     int d; 
     //d =  (i%2 != 0) ? 2 *Integer.parseInt(s.substring(i,i+1)) : Integer.parseInt(s.substring(i,i+1));
     d = Integer.parseInt( s.substring( i, i+1 )) * ( ( i % 2 != 0 ) ? 2 : 1 );
     sum+= (d>9) ? (d/10 + d%10) : d;
    } 
    return sum;
  }
  
  Boolean isValidIMEI(String IMEI) {
    return ((sofd(IMEI.substring(0,14)) * 9 ) %10 ) == Integer.parseInt(IMEI.substring(14,15)) ? true : false;
  }
  
  public static void main (String args[]) {
    
    
    //isValidIMEI("351451208401216") -> true
  }

}
