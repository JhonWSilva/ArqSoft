package PattersFactory;

public class IcmsFactory {
    public CalculoPorRegiao geticmsPorEstado(String nomeEstado) {
        if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
            return new IcmsMG();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
            return new IcmsSP();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_ES")) {
            return new IcmsES();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_RJ")) {
            return new IcmsRJ();
        }else {
            System.out.println("Valor invalido - ICMS não cadastrado");
            return null;
        }
    }
}
