public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; //se comecar com 0 provalve necessidade de usar string
        long cpf = 987654321L; //Terminar com L
        float pi = 3.14F; //Termina com F
        double salarioMinimo = 1333.16;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto =(short) numeroNormal;//conversao em casting pois o numero int pode nao caber dentro do short por isso pode ocorrer erros

        final String CAIXAALTA = "variavel_inalteravel";// inserir o final garante que o programa nao permite alterar essa vaariavel

        final double VALORDEPI = 3.13;
        
        
    }
}
