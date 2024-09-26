import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("LEITOR DE NOTAS!");

        Scanner mediaAluno = new Scanner(System.in);

        // COLETANDO O NOME DO ALUNO

        System.out.println("Informe o seu nome: ");
        String nome = mediaAluno.next();

        // COLETANDO A PRIMEIRA NOTA DO ALUNO

        System.out.println("Informe sua primeira nota: ");
        double primeiraNota = mediaAluno.nextInt();

        // COLETANDO A SEGUNDA NOTA DO ALUNO

        System.out.println("Informe sua segunda nota: ");
        double segundaNota = mediaAluno.nextInt();

        //CALCULANDO A MEDIA DO ALUNO

        double media = (primeiraNota + segundaNota)/2;

        // CONDICIONAL PARA SABER OS STATUS DE APROVAÇÃO

        if (media > 7){
            System.out.println("Você foi aprovado " + nome + ", sua média: " + media);
        } else {
            System.out.println("Você foi reprovado " + nome + ", sua média: " + media);
        }
    }
}
