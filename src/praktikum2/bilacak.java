package praktikum2;
import java.util.Scanner;
public class bilacak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukkan bilangan pertama = ");
        a = s.nextInt();
        System.out.print("Masukkan bilangan kedua = ");
        b = s.nextInt();
        System.out.print("Masukkan bilangan ketiga = ");
        c = s.nextInt();
        System.out.println("Bilangan belum urut : " +a+", "+ b+", "+c);
        if(a<b && a<c){
            if(b<c){
                    System.out.println("Bilangan urut : " +a+", " + b+", "+c);
            }else{
                  System.out.println("Bilangan urut : " +a+", " + c+", "+b);
            }
        }    
        else if(b<a && b<c){
            if(a<c){
                    System.out.println("Bilangan urut : " +b+", " + a+", "+c);
            }else{
                    System.out.println("Bilangan urut : " +b+", " + c+", "+a);
            }
        }
        else if (c<a && c<b){
            if(a<b){
                     System.out.println("Bilangan urut : " +c+", " + a+", "+b);
            }else{
                   System.out.println("Bilangan urut : " +c+", " + b+", "+a);
            }       
        }
    }
        
}