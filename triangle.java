import java.util.Scanner;

public class triangle {
 
    public static void main(String[] args) {
        
Scanner scan = new Scanner(System.in);
System.out.print("A'nin Değerini Giriniz :");
int a = scan.nextInt();

System.out.print("B'nin Değerini Giriniz :");
int b = scan.nextInt();

System.out.print("C'nin Değerini Giriniz :");
int c = scan.nextInt();

double u = (a+b+c)/2.0;
Math.sqrt(u*(u-a)+(u-b)+(u-c)/2);
   
System.out.println("Ucgenin Alani :"+ u);
double cevre = (a+b+c);
System.out.print("Ücgenin Cevresi : "+ cevre);

}
    
}