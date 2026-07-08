package ar.edu.utn.ba.ddsi.climalert.scheduler;

import ar.edu.utn.ba.ddsi.climalert.servicies.ClimaService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ClimaScheduler {

  private final ClimaService climaService;

  public ClimaScheduler(ClimaService ClimaService) {
    this.climaService = ClimaService;
  }

  @Scheduled(cron = "${weather.scheduler.cron}")
  public void obtenerClima() {
    climaService.obtenerYGuardarClima();
  }

}