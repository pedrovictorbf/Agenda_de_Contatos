import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o nome e telefone");

        Contato c1 = new Contato(dado.nextLine(), dado.nextLine());

        System.out.println("Digite o nome e telefone");

        Contato c2 = new Contato(dado.nextLine(), dado.nextLine());

        System.out.println("Digite o nome e telefone");

        Contato c3 = new Contato(dado.nextLine(), dado.nextLine());

        System.out.println("Digite o nome e telefone");

        Contato c4 = new Contato(dado.nextLine(), dado.nextLine());

        System.out.println("Digite o nome e telefone");

        Contato c5 = new Contato(dado.nextLine(), dado.nextLine());

        System.out.println("Digite o nome e telefone");

        Contato c6 = new Contato("Lorenzo", "8592378103");

        Agenda a = new Agenda();

        System.out.println("Dados:");

        c1.mostrarDados();

        c2.mostrarDados();

        c3.mostrarDados();

        c4.mostrarDados();

        c5.mostrarDados();

        c6.mostrarDados();

        a.addContato(c1);
        a.addContato(c2);
        a.addContato(c3);
        a.addContato(c4);
        a.addContato(c5);
        a.addContato(c6);

        System.out.println("Digite o nome a ser pesquisado");

        a.pesquisaTelefone(dado.nextLine());

        System.out.println("Digite o nome a ser pesquisado");

        a.pesquisaTelefone(dado.nextLine());

        System.out.println("Digite o indice do contato a ser removido");

        a.remContato(dado.nextInt());

    }

}
