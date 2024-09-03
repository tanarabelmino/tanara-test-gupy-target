//Questão 4
public class FaturamentoDistribuidora {

    public static void PercentualDistribuidora() {
        
        Decimal sp = 67836.43;
        Decimal rj = 36678.66;
        Decimal mg = 29229.88;
        Decimal es = 27165.08;
        Decimal outros = 19849.53;

        // Calculando o valor total de faturamento
        Decimal total = sp + rj + mg + es + outros;

        // Calculando os percentuais
        Decimal percentualSP = (sp / total) * 100;
        Decimal percentualRJ = (rj / total) * 100;
        Decimal percentualMG = (mg / total) * 100;
        Decimal percentualES = (es / total) * 100;
        Decimal percentualOutros = (outros / total) * 100;

        
        System.debug('Percentual de SP: ' + percentualSP + '%');
        System.debug('Percentual de RJ: ' + percentualRJ + '%');
        System.debug('Percentual de MG: ' + percentualMG + '%');
        System.debug('Percentual de ES: ' + percentualES + '%');
        System.debug('Percentual de Outros: ' + percentualOutros + '%');
    }
}