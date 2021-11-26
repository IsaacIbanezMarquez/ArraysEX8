




public class Solution
{

    // 1) Escribe un Array quecontenga los numeros del 1 al 100. Muestralos por pantalla:

    public static void main(String[] args)
    {
        int[] numeros = new int[100];

        for(int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);
        }
    }

}
