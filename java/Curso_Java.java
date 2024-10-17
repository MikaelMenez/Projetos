public class Curso_Java {
    public static void main(String[] args) {
pessoa Mikael = new pessoa();
Conta conta = new Conta();
conta.setSaldo(2500);
Mikael.setNome("Mikael");
Mikael.setNacionalidade("BR");
Mikael.setCidadeNatal("Joao Pessoa");
System.out.printf("""
        Nome: %s
        Nacionalidade: %s
        Cidade natal: %s
        """,Mikael.getNome(),Mikael.getNacionalidade(),Mikael.getCidadeNatal());
conta.depositar();
    }
}
