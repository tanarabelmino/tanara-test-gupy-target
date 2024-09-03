//QUESTÃO 1
public class SomaSequencial {

    public static void calcularSoma() {
        
        Integer INDICE = 13;
        Integer SOMA = 0;
        Integer K = 0;

        
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        
        System.debug('O valor final de SOMA é: ' + SOMA);
    }
}

