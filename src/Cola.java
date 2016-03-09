
public class Cola {
    class Nodo{
        String info;
        Nodo sig;
    }
    private Nodo cabeza, fondo;
    private int longitud;

    Cola(){
        cabeza=null;
        fondo=null;
        longitud = 0;
    }
    boolean vacia(){ // Verifica si esta vacia o no
        return (cabeza == null);
    }
    void insertar(String info){ // Inserta nodos o "clientes"
        longitud += 1;
        Nodo nuevo = new Nodo();
        nuevo.info = info;
        nuevo.sig = null;
        if(vacia()){
            cabeza = nuevo;
            fondo = nuevo;
        }else{
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }
    String extraer(){ // Extrae el primer elemento de la cola
        if(!vacia()){
            longitud -= 1;
            String informacion = cabeza.info;
            if(cabeza == fondo){
                cabeza = null;
                fondo = null;
            }else{
                cabeza = cabeza.sig;
            }
            return informacion;
        }else{
            return "vacia";
        }
    }
    public void imprimir(){ // Imprime en un formato primitivo
        Nodo reco = cabeza;
        System.out.println("Listado de todos los elementos de la cola");
        while(reco != null){
            System.out.print(reco.info+"-");
            reco = reco.sig;
        }
        System.out.println();
    }
    int length(){ // retorna la longitud de la cola
        return longitud;
    }
}
