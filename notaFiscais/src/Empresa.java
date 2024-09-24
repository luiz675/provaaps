import java.util.ArrayList;

public class Empresa {
    public String razaoSocial;
    public String cnpj;
    public String SnLp;
    public String email;

    public String dataEmissao;
    public String notaCompra;
    private double numeroFiscal;
    public  double valor;

    public Empresa(String razaoSocial, String cnpj, String cnlp, String email, double numeroFiscal, String dataEmissao, String notaCompra, double valor){
        this.setRazaoSocial(razaoSocial);
        this.setCnpj(cnpj);
        this.setSnLp(cnlp);
        this.setEmail(email);
        this.setNumeroFiscal(numeroFiscal);
        this.setDataEmissao(dataEmissao);
        this.setNotaCompra(notaCompra);
        this.setValor(valor);


    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSnLp() {
        return SnLp;
    }

    public void setSnLp(String snLp) {
        SnLp = snLp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(double numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNotaCompra() {
        return notaCompra;
    }

    public void setNotaCompra(String notaCompra) {
        this.notaCompra = notaCompra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public  void  listarNotas(ArrayList<Empresa> notas){
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("\n");
            System.out.println(notas.get(i).listNota());
        }

    }
    public  void  calcularNotas(ArrayList<Empresa> notas){
        for (int i = 0; i < notas.size(); i++) {
           double novaNota =  notas.get(i).valor + notas.get(i).valor * 0.12;
            System.out.println("\n");
            System.out.println(notas.get(i).listNota());

            System.out.println("Novo valor da nota" + novaNota);
        }

    }
    public String listNota() {
        return "RazaoSocial='" + this.getRazaoSocial() + '\'' +
                "\nCnpj='" + this.getCnpj() + '\'' +
                "\nSlNp=" + this.getSnLp() +
                "\nEmail=" + this.getEmail() +
                "\nDataEmissao='" + this.getDataEmissao() + '\'' +
                "\nvalorDaNota='" + this.getValor() + '\'';






    }

    public Empresa() {

    }
}
