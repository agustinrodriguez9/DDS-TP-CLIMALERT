package ar.edu.utn.ba.ddsi.climalert.servicies.Impl;

import ar.edu.utn.ba.ddsi.climalert.domain.Clima;
import ar.edu.utn.ba.ddsi.climalert.repository.ClimaRepository;
import ar.edu.utn.ba.ddsi.climalert.servicies.AlertaService;
import org.springframework.stereotype.Service;

@Service
public class AlertaServiceImpl implements AlertaService {

  private final ClimaRepository climaRepository;

  public AlertaServiceImpl(ClimaRepository climaRepository) {
    this.climaRepository = climaRepository;
  }

  @Override
  public void verificarAlertas() {
    Clima ultimoClima = climaRepository.ultimo();

    if (ultimoClima != null && ultimoClima.esCritico()) {
      System.out.println("ALERTA CLIMATICA DETECTADA");
      // emailService.enviarAlerta(ultimoClima);
    }
  }
}
