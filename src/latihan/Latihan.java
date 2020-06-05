
package latihan;

public class Latihan {
   
    public static void main(String[] args) {
      int n = 0;
      try{
      n = System.in.read();
      } catch(java.io.IOException e){
      }
      System.out.println("Hasil :" +(char) n);
    }
    
}
