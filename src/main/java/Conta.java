public class Conta 
{
    private float saldo_eff;

    public Conta(float saldo_inicial)                         //Construtor e setter
    {
        this.saldo_eff = saldo_inicial;
    }

    public float get_saldo()                                  //Método getter
    {
        return saldo_eff;
    }
    
    public void deposito (float valor_deposito)
    {
        if (valor_deposito <= 0)
        {
            System.out.println("Nao e possivel depositar valores negativos ou nulos.");
        }

        else
        {
            saldo_eff += valor_deposito;
        }
    }

    public void saque (float valor_saque)
    {
        if (valor_saque >0)
        {
            if (valor_saque <= saldo_eff)
            {
                saldo_eff -= valor_saque;
            }
            else
            {
                System.out.println("Saldo insuficiente!\n");
            }
        }
        else
        {
            System.out.println("Nao e possivel sacar valores nulos ou negativos!\n");
        }
    }
}