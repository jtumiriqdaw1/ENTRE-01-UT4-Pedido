

/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 * @autor --Jhoselin Tumiri Quiroz---
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente, LineaPedido linea1, LineaPedido linea2) {
         this.fecha = fecha;
         this.cliente = cliente;
         this.linea1 = linea1; 
         this.linea2 = linea2;
 }

    /**
     * accesor para la fecha del pedido
     */
    public  Fecha getFecha() {
         return fecha;
 }

 /**
     * accesor para el cliente
     */
    public Cliente getCliente() {
        return cliente;
 }
      
 /**
 * calcular y devolver el importe total del pedido sin Iva
 */
 public  double getImporteAntesIva() {
    double importe1 = linea1.getCantidad() * linea1.getProducto().getPrecio();
    double importe2 = linea2.getCantidad() * linea2.getProducto().getPrecio();
    double importeAntesIva = importe1 + importe2;
    return importeAntesIva;
 }

 /**
 * calcular y devolver el iva a aplicar
 */
 public double  getIva() {
    double importe1 = linea1.getCantidad() * linea1.getProducto().getPrecio() * IVA;
    double importe2 = linea2.getCantidad() * linea2.getProducto().getPrecio() * IVA;
    double importeIva = importe1 + importe2;
    return importeIva;
 }

 /**
 * calcular y devolver el importe total del pedido con Iva
 */
 public double getImporteTotal() {
    double importeTotal = getImporteAntesIva() + getIva();
    return importeTotal;
 }

 /**
 * Representación textual del pedido
 * (ver enunciado)
 */
 public String toString() {
    String str = String.format("\n%20s%8.2f \n%20s%8.2f \n%20s%8.2f",
    "IMPORTE SIN IVA:", getImporteAntesIva(), "IVA:", getIva(), "IMPORTE TOTAL:",
    getImporteTotal());
    return str;
    // String str1 = "FECHA PEDIDO:"+fecha.toString()
      
      
 }
    
    
    // /**
     // * devuelve true si el pedido actual es más antiguo que el recibido 
     // * como parámetro
     // */
    // public boolean masAntiguoQue(Pedido otro) {
         // if(Pedido)
            // Fecha
    // }
    
     // /**
     // * devuelve una referencia al pedido actual
     // */
    // public    getPedidoActual() {
        
    // }

}
