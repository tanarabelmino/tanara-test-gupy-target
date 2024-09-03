//Questão 3
public class FaturamentoDistribuidora {

    
    public static void processarFaturamento(String jsonInput) {
        
        List<FaturamentoDiario> faturamentos = (List<FaturamentoDiario>) JSON.deserialize(jsonInput, List<FaturamentoDiario>.class);
        
        // Variáveis para armazenar os resultados
        Decimal menorValor = null;
        Decimal maiorValor = null;
        Decimal soma = 0;
        Integer diasComFaturamento = 0;
        
       
        for (FaturamentoDiario f : faturamentos) {
            if (f.valor > 0) {
                if (menorValor == null || f.valor < menorValor) {
                    menorValor = f.valor;
                }
                if (maiorValor == null || f.valor > maiorValor) {
                    maiorValor = f.valor;
                }
                soma += f.valor;
                diasComFaturamento++;
            }
        }
        
        // média
        Decimal mediaMensal = soma / diasComFaturamento;
        
        // Contagem de dias com faturamento acima da média
        Integer diasAcimaDaMedia = 0;
        for (FaturamentoDiario f : faturamentos) {
            if (f.valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        
        
        System.debug('Menor valor de faturamento: ' + menorValor);
        System.debug('Maior valor de faturamento: ' + maiorValor);
        System.debug('Dias com faturamento acima da média: ' + diasAcimaDaMedia);
    }
    
    // Classe interna para mapear o JSON
    public class FaturamentoDiario {
        public Integer dia { get; set; }
        public Decimal valor { get; set; }
    }
}
