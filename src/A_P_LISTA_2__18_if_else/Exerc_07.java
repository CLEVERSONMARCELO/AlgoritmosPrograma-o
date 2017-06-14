
package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
/*Fazer um algoritmo que leia os dois lados ​A e ​B de um 
triângulo retângulo e calcula a hipotenusa do triângulo. Para esse caso, considere que . 
Dica: nesse programa, você deve hipotenusa    h =  √A^2+B^2 usar a função matemática ​Math.sqrt()​. 
Por exemplo, a raiz de 121 ficaria ​Math.sqrt(121)​.
 */
  public class Exerc_07 {
     public static void main (String [] args){
       
         double l1, l2, r, resultado;

         Scanner leitor = new Scanner(System.in);

         System.out.println("Digite o lado A ");
         l1 = leitor.nextDouble();

         System.out.println("Digite o lado A ");
         l2 = leitor.nextDouble();

         l1 = Math.pow(l1, 2);
         l2 = Math.pow(l2, 2);
         r = l1 + l2;

         resultado = Math.sqrt(r);

         System.out.print("A hipotenusa do triângulo é: " + resultado);
       
   }
   
   
}
