package PattersFactory;

import Modelo.Orcamento;

import java.math.BigDecimal;

public class IcmsMG implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valororcamento.multiply(new BigDecimal(0.18));
    }
}
