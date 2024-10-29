public class SingLinkedList {
    Nodo cabeza;
    public SingLinkedList(){
        this.cabeza=null;
    }
    public void insertar(Integer dato){ 
        //crear nuevo nodo
        Nodo nuevoNodo= new Nodo(dato);
        //verificar si la lista esta vacia
        if (cabeza==null) {
            //coloca el nuevo nodo como la cabeza 
            cabeza=nuevoNodo;
        }else{
            //Incializamos la cabeza (el primero)
            Nodo temp=cabeza;
            //recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.siguiente != null) {
                temp=temp.siguiente;
            }
            temp.siguiente=nuevoNodo;
        }
    }
    public void mostar(){
        Nodo temp=cabeza;
        //mientras que temp no sea nulo 
        while (temp!= null) {
            System.out.print(temp.dato+"->"); 
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    public boolean buscar(Integer valor){
        if (cabeza== null) {
            System.out.println("La lista esta vacia");
            return false;
        } else {
            Nodo temp=cabeza;
            //recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.siguiente != null) {
                if (temp.dato == valor) {
                    System.out.println("El dato se encontro "+ valor);
                    return true;
                } 
                temp = temp.siguiente;
            }
            System.out.println("no se encontro ");
        }
        return false;
    }
    public void eliminar(Integer valor){
        if(cabeza == null){
            System.out.println("La lista esta vacia");
        }
        if( cabeza.dato == valor){
            cabeza=cabeza.siguiente;
        }
        Nodo temp=cabeza;
         Nodo anterior=null;
         while(temp!=null && temp.dato!=valor){// recorrer hasta encontrar el nodo con el valor
            anterior=temp;
            temp=temp.siguiente;
         }
         if(temp==null){
            System.out.println("No se encontro el valor");
            return;
         }
         anterior.siguiente=temp;
    
         System.out.println("Se elimino correctamente " + valor);

    }
}
