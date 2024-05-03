import javax.swing.JOptionPane;

public class C09EX09 
{
 public static void main(String[] args) 
 {
    int rep;
    double denominador, somatorio = 0, serie;

    rep = Integer.parseInt(JOptionPane.showInputDialog(null,
    "Quantos termos terá a série",
    "Exercício 09",
    JOptionPane.QUESTION_MESSAGE));
    
    for (int i = 1; i <= rep; i++) 
    {
        denominador =  (i + 9) *  Math.sqrt(Math.pow(i, 4));
        somatorio += Math.pow(3, i + 1) / denominador;
        
    }
    serie = 100 - Math.pow(somatorio, 3);
    System.out.printf("SERIEK = %f", serie);
 }   
}
