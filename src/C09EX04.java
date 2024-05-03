import javax.swing.*;

public class C09EX04
{
    public static void main(String[] args)
    {
        int rep;
        double numerador, denominador, serie = 0, raiz;

        rep = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Quantos termos terá a série?",
                "Exercício 3",
                JOptionPane.QUESTION_MESSAGE)) * 4;

        for (int aux = 1; aux <= rep; aux+=4)
        {

            numerador = (float) aux  * (aux + 1);
            denominador = (float) (aux + 2) * (aux + 3);
            serie += numerador / denominador;

        }
        raiz = Math.sqrt(serie);
        System.out.printf("SERIEG = %f\n", raiz);
    }
}

