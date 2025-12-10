public class PlatoFuerte extends Plato{
    public PlatoFuerte(String nombre, double precio) throws PrecioIncorrecto {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return precio*0.2;
    }
}
