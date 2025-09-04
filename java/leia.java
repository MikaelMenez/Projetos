import java.util.Scanner;

public class leia {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("qual seu filme favorito?");
        String filme=sc.nextLine();
        System.out.println("qual o ano de lançamento?");
        int ano=sc.nextInt();
        System.out.println("qual a nota desse filme?");
        Float nota=sc.nextFloat();
        System.out.println(filme);
        System.out.println(nota);
        System.out.println(ano);
    }
}
