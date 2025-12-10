public abstract class Plato {
protected  String nombre;
protected double precio;
public Plato(String nombre,double precio) throws PrecioIncorrecto{
    if(precio<=0){
        throw new PrecioIncorrecto("El precio debe ser mayor a 0!");
    }
    this.nombre=nombre;
    this.precio=precio;
}

public String getNombre(){
    return this.nombre;
}
public double getPrecio(){
    return this.precio;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public void setPrecio(double precio){
    this.precio=precio;
}
abstract public double calcularPrecio();
}
