package Main;

import Modelo.Orcamento;
import PattersFactory.IcmsFactory;

import java.math.BigDecimal;

public class Main {
    public static void Main (String[] args){

        Orcamento orcamento = new Orcamento(new BigDecimal("2000.00"), "ICMS_ES");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.geticmsPorEstado("ICMS_ES").calculoPorRegiao(orcamento);

        System.out.println(resultado);
    }
}
