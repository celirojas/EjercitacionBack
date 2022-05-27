public class Presidente extends MiembroGubernamental {
    @Override
    public void enviarDocumento(String documento, Integer tipo) {
        if (tipo == 1 || tipo == 2 ||  tipo == 3)
            System.out.println("Yo me encargo de leerlo. Presidente");
         if (getSigMiembroGubernamental()!= null) {
            getSigMiembroGubernamental().enviarDocumento(documento, tipo);
        }
    }
}
