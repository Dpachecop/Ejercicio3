public class Main {
    public static void main(String[] args) {
        


     Mensajero mensajero = new Mensajero();
     EnvioMensaje mensajesms = new MensajeSms();
     EnvioMensaje CorreoElectronico = new CorreoElectronico();
     EnvioMensaje NotificacionesPush = new NotificacionesPush();


     mensajero.Enviar(mensajesms, "Como vas?", "Gely");
     mensajero.Enviar(CorreoElectronico, "Como vas?", "Ale");
     mensajero.Enviar(NotificacionesPush, "Como vas?", "Sara");




    }
}
