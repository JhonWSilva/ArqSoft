package PattersFactory;

import Modelo.Orcamento;

import java.math.BigDecimal;

public class IcmsSP implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valororcamento.multiply(new BigDecimal(0.12));
    }
}
