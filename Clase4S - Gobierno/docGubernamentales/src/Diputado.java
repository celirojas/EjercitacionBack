public class Diputado extends MiembroGubernamental {
    @Override
    public void enviarDocumento(String documento, Integer tipo) {
        if (tipo == 1)
        System.out.println("Yo me encargo de leerlo. Diputado");
         if (getSigMiembroGubernamental()!= null) {
            getSigMiembroGubernamental().enviarDocumento(documento, tipo);
        }
    }
}
