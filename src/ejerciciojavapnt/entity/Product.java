

package ejerciciojavapnt.entity;


public class Product implements Comparable<Product>{
 
    private String nombre;
    private int precio;
    private String Medida;
    private String tamanio;
    
      public Product(String nombre, int precio, String Medida, String tamanio) {
        this.nombre = nombre;
        this.precio = precio;
        this.Medida = Medida;
        this.tamanio = tamanio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    
    @Override
  public int compareTo(Product p) {
    
    if (this.getPrecio() > p.getPrecio()) {
      
          return 1;
    }else if (this.getPrecio()< p.getPrecio()) {
          return -1;
    }else {
          return 0;
    }
  }
  
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// "+this.getMedida() + ": "+this.getTamanio()+" /// Precio: $"+ this.getPrecio();
    }

}
