import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        SingLinkedList lista = new SingLinkedList();
        
        

        
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostar();

        /* 
        int numero;
        System.out.println("buscar numero ");
        numero = leer.nextInt();
        lista.buscar(numero);
        */

        int eliminado;
        System.err.println("ingresa eliminado");
        eliminado = leer.nextInt();
        lista.eliminar(eliminado);
        


    }
}