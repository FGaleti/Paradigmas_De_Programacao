public class SistemaBancario {

    public static void main(String[] args) {

        System.out.println(" SISTEMA BANCARIO \n");

        double saldo;

        try {
            System.out.println("consultando saldo da conta...");

            saldo = consultarSaldo(false);

            System.out.println("saldo consultado com sucesso!");

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            System.out.println("utilizando saldo alternativo");

            saldo = 0.0;
        }

        System.out.printf("saldo disponivel: R$ %.2f%n", saldo);

        System.out.println("realizando outras operacoes...");
        System.out.println("sistema continua funcionando normalmente");
        System.out.println("fim do programa");
    }

    static double consultarSaldo(boolean provocarErro)
            throws Exception {

        if (provocarErro) {
            throw new Exception(
                "nao foi possivel acessar o banco de dados"
            );
        }

        return 1500.00;
    }
}