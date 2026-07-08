package ar.edu.utn.ba.ddsi.climalert.servicies;

import ar.edu.utn.ba.ddsi.climalert.domain.Clima;

public interface ClimaService {

  void obtenerYGuardarClima();
  Clima obtenerUltimoClima();
}