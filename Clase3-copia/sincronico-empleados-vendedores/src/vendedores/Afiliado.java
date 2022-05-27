package vendedores;

public class Afiliado extends Vendedor {

    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    public void vender() {
        System.out.println(nombre + " está vendiendo...");
        this.puntos += 15;
    }

    @Override
    public int calcularPuntos() {
        return this.puntos;
    }
}
