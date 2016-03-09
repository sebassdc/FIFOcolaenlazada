
public class Ventanilla extends Cola{
    void insertarTarea(int min){
        insertar(min);
    }
    void decrementar(int min){ // Decrementa en n minutos la primera tarea
        if(cabeza.minutos == 0){
            extraer();
        }
        cabeza.minutos -= 1; // siempre habra pasado un minuto
    }
}
