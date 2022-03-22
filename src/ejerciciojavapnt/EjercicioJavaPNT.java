
package ejerciciojavapnt;

import ejerciciojavapnt.entity.Product;
import java.util.ArrayList;
import java.util.Collections;


public class EjercicioJavaPNT {

    
    public static void main(String[] args) {
        
        ArrayList<Product> Stock = cargarDatos();
        
        mostrarDatos(Stock);       
        
    }
    
    
    public static ArrayList<Product> cargarDatos(){
        
        ArrayList<Product> Stock = new ArrayList();
        
        Product producto1 = new Product("Coca Cola",18,"Litros","1.5L");       
        
        Product producto2 = new Product("Coca Cola Zero",20,"Litros","1.5L");      
        
        Product producto3 = new Product("Shampoo Sedal",19,"Contenido","500ml");
        
        Product producto4 = new Product("Frutilla",64,"Unidad de Venta","Kilo");

        
        Stock.add(producto1);
        Stock.add(producto2);
        Stock.add(producto3);
        Stock.add(producto4);
        
        return Stock;
    }
    
    
    public static void mostrarDatos(ArrayList<Product> Stock){
        
        for (Product p :Stock) {
            System.out.println(p.toString());          
        }
        
        Collections.sort(Stock);
        System.out.println("Producto más caro: "+Stock.get(Stock.size() -1 ).getNombre());
        System.out.println("Producto más barato: "+ Stock.get(0).getNombre());
        
    }
        
}
