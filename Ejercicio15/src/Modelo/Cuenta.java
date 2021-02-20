package Modelo;


/**
 * The type Cuenta.
 */
public class Cuenta {
    private String iban;
    private String titular;
    private float saldo;

    /**
     * Instantiates a new Cuenta.
     *
     * @param iban    the iban
     * @param titular the titular
     */
    public Cuenta(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
    }

    /**
     * Gets iban.
     *
     * @return the iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets iban.
     *
     * @param iban the iban
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * Gets titular.
     *
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Sets titular.
     *
     * @param titular the titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Gets saldo.
     *
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Sets saldo.
     *
     * @param saldo the saldo
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Extraer codigo entidad string.
     *
     * @return the string
     */
    public String extraerCodigoEntidad() {
        return iban.substring(4, 8);
    }

    /**
     * Extraer codigo oficina string.
     *
     * @return the string
     */
    public String extraerCodigoOficina() {
        return iban.substring(8, 12);
    }

    /**
     * Extraer numero cuenta string.
     *
     * @return the string
     */
    public String extraerNumeroCuenta() {
        return iban.substring(14);
    }

    /**
     * Digitos control string.
     *
     * @return the string
     */
    public String digitosControl() {
        return iban.substring(12, 14);
    }

    public static int sacarPrimerDigitoCotrol(String entidad, String oficina) {
        int sumControl =
                Integer.parseInt(entidad.substring(0, 1)) * 4 +
                        Integer.parseInt(entidad.substring(1, 2)) * 8 +
                        Integer.parseInt(entidad.substring(2, 3)) * 5 +
                        Integer.parseInt(entidad.substring(3, 4)) * 10;

        int sumOficina = Integer.parseInt(oficina.substring(0, 1)) * 9 +
                Integer.parseInt(oficina.substring(1, 2)) * 7 +
                Integer.parseInt(oficina.substring(2, 3)) * 3 +
                Integer.parseInt(oficina.substring(3, 4)) * 6;

        int total = sumControl + sumOficina;
        return 11 - (total % 11);
    }

    public static int sacarSegundoDigitoCotrol(String cuenta) {
        int sumCuenta =
                Integer.parseInt(cuenta.substring(0, 1)) +
                        Integer.parseInt(cuenta.substring(1, 2)) * 2 +
                        Integer.parseInt(cuenta.substring(2, 3)) * 4 +
                        Integer.parseInt(cuenta.substring(3, 4)) * 8 +
                        Integer.parseInt(cuenta.substring(4, 5)) * 5 +
                        Integer.parseInt(cuenta.substring(5, 6)) * 10 +
                        Integer.parseInt(cuenta.substring(6, 7)) * 9 +
                        Integer.parseInt(cuenta.substring(7, 8)) * 7 +
                        Integer.parseInt(cuenta.substring(8, 9)) * 3 +
                        Integer.parseInt(cuenta.substring(9, 10)) * 6;
        return 11 - (sumCuenta % 11);
    }


    // Este metodo va a comparar los digitos de control introducidos por el usuario
    // con los digitos que resultan de los dos metodos anteriores.
    public boolean validarCuenta1() {
        int digitoControl1 = Integer.parseInt(iban.substring(12, 13));
        int digitoControl2 = Integer.parseInt(iban.substring(13, 14));

        return digitoControl1 == sacarPrimerDigitoCotrol(extraerCodigoEntidad(), extraerCodigoOficina()) &&
                digitoControl2 == sacarSegundoDigitoCotrol(extraerNumeroCuenta());
    }

    /**
     * Ingreso.
     *
     * @param saldoNuevo the saldo nuevo
     */
    public void ingreso(float saldoNuevo) {
        if (saldoNuevo > 0) {
            this.saldo += saldoNuevo;
        }
    }

    /**
     * Reintegro boolean.
     *
     * @param saldoNuevo the saldo nuevo
     * @return the boolean
     */
    public boolean reintegro(float saldoNuevo) {
        if (saldo <= 0 || saldoNuevo <= 0 || saldoNuevo > saldo) return false;
        this.saldo -= saldoNuevo;
        return true;
    }


}