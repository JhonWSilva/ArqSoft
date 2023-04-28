package Modelo;

import java.math.BigDecimal;

public class Orcamento {
    public BigDecimal valororcamento;
    public String icmsRegiao;

    public Orcamento(BigDecimal valororcamento, String icmsRegiao) {
        this.valororcamento = valororcamento;
        this.icmsRegiao = icmsRegiao;
    }
}
