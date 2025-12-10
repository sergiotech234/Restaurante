import java.util.Scanner;

public class MainRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("¿Cuantos pplatos podrá contener el pedido?");
            int pplatos = sc.nextInt();
            sc.nextLine();

            Pedido pedido = new Pedido(pplatos);

            boolean continuar = true;
            while (continuar) {
                System.out.println("\n--- MENÚ DE OPCIONES ---");
                System.out.println("1. Agregar Entrada");
                System.out.println("2. Agregar Plato Fuerte");
                System.out.println("3. Agregar Postre");
                System.out.println("4. Ver total sin propina");
                System.out.println("5. Ver total con propina");
                System.out.println("6. Salir");
                System.out.print("Elige una opción: ");

                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Nombre de la entrada: ");
                        String nombre = sc.nextLine();
                        System.out.println("Precio de la entrada: ");
                        double precio = sc.nextDouble();
                        Entrada entrada = new Entrada(nombre, precio);
                        pedido.agregarPlato(entrada);
                        System.out.println("Entrada agregada correctamente.");
                        break;

                        case 2:
                            System.out.println("Nombre de la plato Fuerte: ");
                            String nombreFuerte = sc.nextLine();
                            System.out.println("Precio de la plato Fuerte: ");
                            double precioFuerte = sc.nextDouble();
                            sc.nextLine();
                            PlatoFuerte pf =new PlatoFuerte(nombreFuerte, precioFuerte);
                            pedido.agregarPlato(pf);
                            System.out.println("Plato agregada correctamente.");
                            break;
                       case 3:
                           System.out.print("Nombre del postre: ");
                           String nombreP = sc.nextLine();
                           System.out.print("Precio base: ");
                           double precioP = sc.nextDouble();
                           sc.nextLine();
                           Postre p = new Postre(nombreP, precioP);
                           pedido.agregarPlato(p);
                           System.out.println("Postre agregado.");
                           break;
                       case 4:
                           System.out.println("Total sin propina: " + pedido.calcularTotal());
                           break;
                       case 5:
                           System.out.println("Ingrese la propina: ");
                           double propina = sc.nextDouble();
                           sc.nextLine();
                           System.out.println("Total con propina: " + pedido.calcularPrecioTotal(propina));
                           break;
                       case 6:
                           continuar = false;
                           System.out.println("Saliendo.");
                           break;
                       default:
                           System.out.println("Opcion invalida.");
                }
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error: " +e.getMessage());
        }
        sc.close();
    }
}