package ar.edu.utn.ba.ddsi.climalert.servicies.Impl;

import ar.edu.utn.ba.ddsi.climalert.domain.Clima;
import ar.edu.utn.ba.ddsi.climalert.repository.ClimaRepository;
import ar.edu.utn.ba.ddsi.climalert.servicies.AlertaService;
import ar.edu.utn.ba.ddsi.climalert.servicies.EmailService;
import org.springframework.stereotype.Service;

@Service
public class AlertaServiceImpl implements AlertaService {

  private final ClimaRepository climaRepository;
  private final EmailService emailService;

  public AlertaServiceImpl(ClimaRepository climaRepository, EmailService emailService) {
    this.climaRepository = climaRepository;
    this.emailService = emailService;
  }

  @Override
  public void verificarAlertas() {
    Clima ultimoClima = climaRepository.ultimo();

    if (ultimoClima != null && ultimoClima.esCritico()) {
      System.out.println("ALERTA CLIMATICA DETECTADA !!!");

      System.out.println("Temp: " + ultimoClima.getTemperatura() + " Humedad: " + ultimoClima.getHumedad());

      emailService.enviarAlerta(ultimoClima);
    }
  }
}
