import java.util.Scanner;
public class fora {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner st= new Scanner(System.in);
        System.out.println("quer repetir quantas vzs?");
        int x= sc.nextInt();
        System.out.println("quer repetir oq?");
        String y= st.nextLine();
        for (int i = 0; i < x; i++) {
            System.out.println(y);
        }}}
