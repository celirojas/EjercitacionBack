public abstract class MiembroGubernamental {
    private MiembroGubernamental sigMiembroGubernamental;

    protected MiembroGubernamental() {
    }

    //Los posibles tipo de documentos son:
    //1)Reservado
    //2)Secreto
    //3)Muy secreto

    public abstract void enviarDocumento(String documento, Integer tipo);
    //public abstract void leerDocumento(Boolean autorizado); RESOLVER ESTO

    public void setSigMiembroGubernamental(MiembroGubernamental miembro){
        sigMiembroGubernamental = miembro;
    }
    public MiembroGubernamental getSigMiembroGubernamental(){
        return sigMiembroGubernamental;
    }
}
