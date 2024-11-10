public class CorreoElectronico extends EnvioMensaje {

    @Override
    public void Enviar(String mensaje, String destinatario) {
        System.out.println("Estimado/a " + 
        destinatario + " Ha recibido el siguiente mensaje por medio de correo electronico: "
        + mensaje);
    }
    
}
