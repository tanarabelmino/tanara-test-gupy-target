//Questão 2
public class SequenciaFibonacci {

    // Verificar sequencia
    public static Boolean isFibonacci(Integer n) {
        
        Integer a = 0;
        Integer b = 1;
        
        
        while (a <= n) {
            if (a == n) {
                return true; // O número pertence à sequência
            }
            // Calcula o próximo número na sequência
            Integer temp = a + b;
            a = b;
            b = temp;
        }
        
        return false; // não pertence a sequencia
    }

    // Método para execução de teste e output no debug
    public static void checkFibonacci(integer numero) {
        
        if (isFibonacci(numero)) {
            System.debug('O número ' + numero + ' pertence à sequência de Fibonacci.');
        } else {
            System.debug('O número ' + numero + ' não pertence à sequência de Fibonacci.');
        }
    }
}