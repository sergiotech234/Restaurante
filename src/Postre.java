public class Postre extends Plato{
    public Postre(String nombre, double precio) throws PrecioIncorrecto {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }

    public double calcularPrecio(double descuento) {
        return getPrecio() * descuento;
    }
}
