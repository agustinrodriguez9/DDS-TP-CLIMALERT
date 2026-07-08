package ar.edu.utn.ba.ddsi.climalert.adapter;

import ar.edu.utn.ba.ddsi.climalert.domain.Clima;
import ar.edu.utn.ba.ddsi.climalert.dto.WeatherResponseDTO;

public interface ClimaAdapter {
  Clima obtenerClimaActual();
}