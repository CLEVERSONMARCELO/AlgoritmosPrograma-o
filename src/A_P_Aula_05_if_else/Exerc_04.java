package A_P_Aula_05_if_else;
import java.util.Scanner;

public class Exerc_04 {

    public static void main(String[] args){
       Scanner leitor = new Scanner (System.in); 
       
       System.out.print("Digite seu consumo de energia em kwh: ");
       double kwh = leitor.nextDouble();
       
       double valorm = 11.90;
       
       if (kwh<150){System.out.println("       ---Extrato---\n\nValor mínimo "+valorm+"\nconsumo em kwh "+kwh+ " valor kwh R$ 0,2o"  +      "\nO valor da sua conta é R$ "+((kwh*0.20)+valorm)+"\n\n\n");
       }
       else if (kwh>=150&&kwh<500){System.out.println("       ---Extrato---\nValor mínimo "+valorm+"\nconsumo em kwh "+kwh+ " valor kwh R$ 0,25"  +      "\nO valor da sua conta é R$ "+((kwh*0.25)+valorm)+"\n\n\n");
       }
       else if (kwh>=500){System.out.println("       ---Extrato---\nValor mínimo "+valorm+"\nconsumo em kwh "+kwh+ " valor kwh R$ 0,30"  +      "\nO valor da sua conta é R$ "+((kwh*0.30)+valorm)+"\n\n\n");
       }
    }
}