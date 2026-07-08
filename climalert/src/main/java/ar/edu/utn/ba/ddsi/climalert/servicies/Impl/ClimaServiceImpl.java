package ar.edu.utn.ba.ddsi.climalert.servicies.Impl;

import ar.edu.utn.ba.ddsi.climalert.adapter.ClimaAdapter;
import ar.edu.utn.ba.ddsi.climalert.domain.Clima;
import ar.edu.utn.ba.ddsi.climalert.repository.ClimaRepository;
import ar.edu.utn.ba.ddsi.climalert.servicies.ClimaService;
import org.springframework.stereotype.Service;


@Service
public class ClimaServiceImpl implements ClimaService {

  private final ClimaAdapter climaAdapter;
  private final ClimaRepository climaRepository;

  public ClimaServiceImpl(
      ClimaAdapter climaAdapter,
      ClimaRepository climaRepository
  ) {
    this.climaAdapter = climaAdapter;
    this.climaRepository = climaRepository;
  }

  @Override
  public void obtenerYGuardarClima() {
    Clima clima = climaAdapter.obtenerClimaActual();

    climaRepository.guardar(clima);

    System.out.println("Guardado clima: " + clima.getTemperatura() + "°C");
  }

  @Override
  public Clima obtenerUltimoClima() {
    return climaRepository.ultimo();
  }
}