public class MensajeSms extends EnvioMensaje {

    @Override
    public void Enviar(String mensaje, String destinatario) {
        System.out.println("Estimado/a " + 
        destinatario + " Ha recibido el siguiente mensaje por medio de SMS: "
        + mensaje);
    }
    
}
