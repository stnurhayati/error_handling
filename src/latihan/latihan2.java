
package latihan;

public class latihan2 {
   public static void main (String[] args) {
    byte[] b = new byte[5];
    try { System.in.read(b);
    } catch (java.io.IOException l){
    System.out.println("Hasil :" +(char) b[0] + (char) b[1] + (char) b[2]);  
       }
    }
}
