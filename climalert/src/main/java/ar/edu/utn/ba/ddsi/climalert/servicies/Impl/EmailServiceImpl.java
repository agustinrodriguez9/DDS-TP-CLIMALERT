package ar.edu.utn.ba.ddsi.climalert.servicies.Impl;

import ar.edu.utn.ba.ddsi.climalert.domain.Clima;
import ar.edu.utn.ba.ddsi.climalert.servicies.EmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

  private final JavaMailSender mailSender;

  public EmailServiceImpl(JavaMailSender mailSender) {
    this.mailSender = mailSender;
  }

  @Override
  public void enviarAlerta(Clima clima) {

    SimpleMailMessage mensaje = new SimpleMailMessage();

    mensaje.setTo(
        "admin@clima.com",
        "emergencias@clima.com",
        "meteorologia@clima.com"
    );

    mensaje.setSubject("ALERTA CLIMATICA");

    mensaje.setText("Se detectaron condiciones climaticas criticas\n\n" +
            "Temperatura: " + clima.getTemperatura() + "°C\n" + "Humedad: " + clima.getHumedad() + "%\n" +
            "Sensacion termica: " + clima.getSensacionTermica() + "°C\n" +
            "Presion: " + clima.getPresion() + " mb\n" +
            "Velocidad viento: " + clima.getVelocidadViento() + " km/h\n");

    mailSender.send(mensaje);
  }
}

