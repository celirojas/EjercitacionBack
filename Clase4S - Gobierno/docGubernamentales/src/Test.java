public class Test {
    public static void main(String[] args) {
        MiembroGubernamental miembro1 = new Diputado();
        MiembroGubernamental miembro2 = new Ministro();
        MiembroGubernamental miembro3 = new Presidente();

        miembro1.setSigMiembroGubernamental(miembro2);
        miembro2.setSigMiembroGubernamental(miembro3);


        miembro1.enviarDocumento("Hola soy un documento", 2);
    }
}
