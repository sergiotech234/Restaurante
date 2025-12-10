public class Pedido {
    private Plato[] platos;
    private int cantidad;

    public Pedido(int cantidad) {
        platos = new Plato[cantidad];
        this.cantidad = 0;
    }

    public void agregarPlato(Plato plato) throws PrecioIncorrecto {
        if (cantidad >= platos.length) {
            throw new PrecioIncorrecto("No hay espacio en el pedido.");
        }
        platos[cantidad] = plato;
        cantidad++;
    }
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += platos[i].calcularPrecio();
        }
        return total;
    }
    public double calcularPrecioTotal(double propina) {
        return calcularTotal()+propina;
    }
}
