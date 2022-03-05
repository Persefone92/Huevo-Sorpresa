package huevoSorpresa;
/**
 * * Clase HuevoSorpresaRosaGarciaLaura2122, que define un objeto Huevo Sorpresa
 * con unos atributos
 * y unos métodos constructores
 * 
 * @author LauraRosaGarcia
 */

public class HuevoSorpresaRosaGarciaLaura2122 {

    private int unidades;
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_maxRosaGarciaLaura2122;//precio máximo que puede tener un huevo sorpresa

    /**
     * Constructor por defecto
     */
    public HuevoSorpresaRosaGarciaLaura2122() {
    }


    /**
     * Constructor por parámetros
     */
    public HuevoSorpresaRosaGarciaLaura2122(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_maxRosaGarciaLaura2122 = precio_max;
    }


    /**
     * Método que devuelve el número de huevos sorpresa que tiene la tienda
     */
    public int obtenerUnidades() {
        return this.getUnidades();
    }

    /**
     * Método que devuelve el precio que tiene cada huevo sorpresa
     */
    public double obtenerPrecio() {
        return this.getPrecio();
    }


    /**
     * Método que devuelve la sorpresa que tiene el huevo
     */
    public String obtenerSorpresa() {
        return getSorpresa();
    }

    /**
     * Método que permite modificar la sorpresa del huevo
     */
    public void modificarSorpresa(String sorpresa) {
        this.setSorpresa(sorpresa);
    }


    /**
     * Método que permite modificar el número de huevos sorpresa que tiene la tienda
     */
    public void modificarUnidades(int unidades) {
        this.setUnidades(unidades);
    }


    /**
     * Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay 
     * suficientes unidades en la tienda
     */
    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresaRosaGarciaLaura2122) throws Exception {
        if (dinero <= 0) {
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.getUnidades() <= unidades) {
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }


    /**
     * Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
     * el aumento que se indica siempre que no se sobrepase el precio máximo de venta
    */
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxRosaGarciaLaura2122() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }

    /**
     * @return unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return  precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return  sorpresa
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa the sorpresa to set
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return  precio_maxRosaGarciaLaura2122
     */
    public double getPrecio_maxRosaGarciaLaura2122() {
        return precio_maxRosaGarciaLaura2122;
    }

    /**
     * @param precio_maxRosaGarciaLaura2122 the precio_maxRosaGarciaLaura2122 to set
     */
    public void setPrecio_maxRosaGarciaLaura2122(double precio_maxRosaGarciaLaura2122) {
        this.precio_maxRosaGarciaLaura2122 = precio_maxRosaGarciaLaura2122;
    }
}
