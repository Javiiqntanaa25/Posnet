package posnet;

/**
 *
 * @author Javier Quintana
 */
public class TarjetaDeCredito {

    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;
   
    /**
     * 
     * @param entidadBancaria
     * @param nroTarjeta
     * @param saldo
     * @param titular
     * @param entidadFinanciera 
     */
    
    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }
    /**
     * 
     * @param monto
     * @return boolean retorna si el saldo es mayor o igual al monto disponible
     */

    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto;
    }
    /**
     * 
     * @param monto 
     */

    public void descontar(double monto) {
        saldo = saldo - monto;
        // saldo -= monto;
    }
    
    /**
     * 
     * @return  String retorna el nombre completo del titular
     */

    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }
    
    /**
     * 
     * @return string retorna todos los datos de la tarjeta de credito
     */

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

}
