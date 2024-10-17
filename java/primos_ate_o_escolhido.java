import java.util.Scanner;
public class primos_ate_o_escolhido {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pri=sc.nextInt();
        if(pri<2){
            System.out.println("não há primos menores do que 2");
        }
        else{
            System.out.println(2);
        for (int x = 2; x < pri-1; x++) {
            for (int i = 2; i < x/2+1;i++){
                System.out.println(i);
                i++;
            }
            }


            }
        }
    }

