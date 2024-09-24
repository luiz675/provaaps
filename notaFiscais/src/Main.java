import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Empresa> nota = new ArrayList<Empresa>();


            System.out.println("Cadastrar razao social.");

            String razaoSocial = sc.nextLine();

            System.out.println("Informe o cnpj");
            String cnpj = sc.nextLine();

            System.out.println("Informe o CnLp");
            String cnlp = sc.nextLine();

            System.out.println("Informe o email");
            String email = sc.nextLine();

            System.out.println("Informe a data de emissão");
            String dataEmissao = sc.nextLine();

            System.out.println("Informe a nota de compra");
            String notaCompra = String.valueOf(sc.nextInt());

            System.out.println("Informe o numero fiscal");
            double numeroFiscal = sc.nextDouble();

            System.out.println("Informe o valor");
            double valor = sc.nextDouble();

            nota.add(new Empresa(razaoSocial,cnpj,cnlp,email,numeroFiscal,dataEmissao,notaCompra, valor));

            System.out.println("Listar todos as SnLp.");

            Empresa empresa = new Empresa();
            empresa.listarNotas(nota);
            empresa.calcularNotas(nota);

}

}


