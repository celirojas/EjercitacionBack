package com.company;

public class ProxyDescarga implements DescargaSpotify{
    private ServicioDescarga servicioDescarga;



    //Constructor de ProxyDescarga


    public ProxyDescarga(ServicioDescarga servicioDescarga) {
        this.servicioDescarga = servicioDescarga;
    }

    @Override
    public void descargar(Usuario usuario, String cancion) {
        if(esUsuarioPremium(usuario)){
            this.servicioDescarga.descargar(usuario, cancion);
        } else {
            System.out.println("El usuario id: " + usuario.getId() + " no es premium y no puede descargar.");
        }
    }

    public Boolean esUsuarioPremium(Usuario usuario){
        return usuario.getTipo().equalsIgnoreCase("premium");
    }
}
