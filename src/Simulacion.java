import java.util.Random;
import java.util.Scanner;

public class Simulacion {
    static Ventanilla[] ventanillas = new Ventanilla[5];
    Simulacion(){
        for(int i = 0; i < 5; i++){
            ventanillas[i] = new Ventanilla();
        }
    }
    private static void genClient(int prob){

    }
    public static void servir_colas(){
        for(int i = ventanillas.length; i >= 0; i--){
            ventanillas[i].decrementar(1);
        }
    }
    static int medir_cola(Ventanilla a){
        return a.length(); // Enchapado
    }
    public static void main(String[] args) {
        int x, y, z, frec;
        Random a = new Random();
        //Scanner teclado = new Scanner(System.in);
        x = 4;
        y = 5;
        z = 7;
        frec = 3;
        for (int i = 1; i <= 300; i++) {
            if(i % 5 == 0){
                genClient(a.nextInt());
            }
        }
    }
}