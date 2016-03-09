
public class Simulacion {
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        cola1.insertar("Roberto");
        System.out.println("la longitud es: "+ cola1.length());
        cola1.insertar("Juan");
        cola1.insertar("Rodrigo");
        System.out.println("la longitud es: "+ cola1.length());
        cola1.imprimir();
        System.out.println("Extraemos uno de la cola: "+ cola1.extraer());
        System.out.println("la longitud es: "+ cola1.length());
        cola1.imprimir();
    }
}