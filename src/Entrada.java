public class Entrada extends Plato{
    public Entrada(String nombre, double precio) throws PrecioIncorrecto {
        super(nombre, precio);
    }
    @Override
    public double calcularPrecio() {
        return precio;
    }
}
