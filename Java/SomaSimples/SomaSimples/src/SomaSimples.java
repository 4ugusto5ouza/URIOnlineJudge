import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); sc.nextLine();
        int b = sc.nextInt(); sc.nextLine();

        int soma = a + b;
        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
