public class Ministro extends MiembroGubernamental {
    @Override
    public void enviarDocumento(String documento, Integer tipo) {
        if (tipo == 1 || tipo == 2)
            System.out.println("Yo me encargo de leerlo. Ministro");
         if (getSigMiembroGubernamental()!= null) {
            getSigMiembroGubernamental().enviarDocumento(documento, tipo);
        }
    }
}
