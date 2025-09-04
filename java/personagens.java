
import java.util.Random;
public class personagens{
    Random random=new Random();
    String nome;
    float forca;
    float hp;
    void mostrarstts(){
        System.out.printf("o personagem %s possui %f de força e %f de hp\n",nome,forca,hp);
    }
    void atacar() {
        if (nome.equals("hércules")) {
            int dado = random.nextInt(1, 20);
            forca = forca + dado;
            System.out.printf("%s atacou com sua espada e gerou %f de dano\n", nome, forca);
        } else if (nome.equals("hydra")) {
            int dado = random.nextInt(1, 5);
            switch (dado) {
                case 1:
                    forca = forca + 10;
                    System.out.println("hydra usou bola de fogo e causou 20 de dano\n");
                    break;
                case 2:
                    int dad = random.nextInt(5, 7);
                    hp = hp + dad;
                    System.out.printf("Hydra sugou a vida de hércules e recuperou %d de hp\n", dad);
                    forca =dad;
                    break;
                case 3:
                    forca = forca + 2;
                    System.out.println("hydra usou rabada e causou 12 de dano\n");
                    break;
                case 4:
                    forca = forca + 5;
                    System.out.println("hydra usou bafo gelado e causou 15 de dano\n");
                    break;
            }
        }}
    void resetarforca () {
        if (nome.equals("hércules")) {
            forca = 16;
        } else if (nome.equals("hydra")) {
            forca = 10;
        }
    }
    public void serAtacado ( float dano){
        hp = hp - dano;
        System.out.printf("%s foi atacado e sofreu %f de dano\n", nome, dano);
    }
    void recuperarHp () {
        int dado = random.nextInt(5, 15);
        hp = hp + dado;
        System.out.printf("Hércules recuperou %d de hp\n", dado);
    }
}

