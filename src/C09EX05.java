import javax.swing.*;

public class C09EX05
{
    public static void main(String[] args)
    {
        int rep = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Quantos termos a série terá?",
                "Exercício 05",
                JOptionPane.QUESTION_MESSAGE));
        double numerador, denominador, serie = 0;

        for (int aux = 1; aux <= rep; aux ++)
        {
            numerador = (aux * 2 - 2) + aux * 3;
            denominador = aux * 6 + 1;
            serie += numerador / denominador;
        }
        serie *= 5;
        System.out.printf("SERIEH = %f\n", serie);
    }
}
