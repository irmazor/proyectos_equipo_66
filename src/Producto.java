public class Producto {
    //ATRIBUTOS
    private String nombre = "";
    private float precio = 0;

    //METODO

    public void mostrar() {
        String precioTexto = String.format("%,d", (int)precio);
        System.out.println(nombre + ": " + precio);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
}

public float getPrecio() {
    return this.precio;
}

}



