import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        int opc = -1;
        float saldo_inicial = 0;

        Conta conta1 = new Conta(saldo_inicial);

        do
        {
            Scanner input = new Scanner(System.in);

            try
            {
                System.out.println("\n1 - Deposito\n");
                System.out.println("2 - Saque\n");
                System.out.println("3 - Saldo\n");
                System.out.println("0 - Sair\n");

                opc = input.nextInt();
            }

            catch (InputMismatchException inputMismatchException)
            {
                System.err.printf("%nErro! %s%n", inputMismatchException);
                input.nextLine();
                System.out.println("Voce deve escolher um dos NUMEROS 0 - 3");
            }

            switch (opc)
            {
                case 1:
                    float valor_deposito, valor_saque;

                    try
                    {
                        System.out.println("*** Deposito ***\n\n");
                        System.out.println("Informe o valor que deseja depositar:\n");
                        valor_deposito = input.nextFloat();
                        conta1.deposito(valor_deposito);
                        System.out.println("O saldo atual e " + conta1.get_saldo());
                    }

                    catch (InputMismatchException inputMismatchException)
                    {
                        System.err.printf("%nExcecao! %s%n", inputMismatchException);
                        input.nextLine();
                        System.out.println("Voce deve digitar valores NUMERICOS!");
                    }
                    break;

                case 2:
                    try
                    {
                        System.out.println("*** Saque ***\n\n");
                        System.out.println("Informe o valor que deseja sacar:\n");
                        valor_saque = input.nextFloat();
                        conta1.saque(valor_saque);
                        System.out.println("O saldo atual e " + conta1.get_saldo());
                    }
                    catch (InputMismatchException inputMismatchException)
                        {
                            System.err.printf("%nExcecao! %s%n", inputMismatchException);
                            input.nextLine();
                            System.out.println("Voce deve digitar valores NUMERICOS!");
                        }                
                        break;
                
                case 3:
                    System.out.print("*** Saldo ***\n\n");
                    System.out.println("O saldo atual e " + conta1.get_saldo());
                    break;
                
                case 0:
                    System.out.println("Sair");
                    break;
            }

        } while (opc != 0); 
        
    }
}
