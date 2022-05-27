package vendedores;

public abstract class Vendedor {

    protected int puntos;
    protected String nombre;
    private String categoria;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public abstract void vender();
    public abstract int calcularPuntos();

    public void mostrarCategoria() {
        calcularPuntos();
        recategorizar();
        System.out.println("\nNombre: " + nombre + "\n\tCategoria:\t" + categoria + "\n\tPuntos:\t" + puntos);
    }

    private void recategorizar() {
        categoria = "novato";
        if (40 < puntos) {
            categoria = "maestro";
        } else if (30 < puntos) {
            categoria = "bueno";
        } else if (20 <= puntos) {
            categoria = "aprendiz";
        }
    }
}
