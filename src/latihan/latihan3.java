package latihan;


public class latihan3 {

    public static void main (String [] args){
        byte[] b = new byte[5];
       System.out.println("Input Bilangan Bulat :");
        try{ System.in.read(b);
        } catch (java.io.IOException e){
            
        }
        String a = new String(b).trim();
       int N = Integer.valueOf(a);
       System.out.println("Hasil : "+(N+2));
    }
}
