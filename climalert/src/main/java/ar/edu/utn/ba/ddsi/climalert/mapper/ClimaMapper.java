package ar.edu.utn.ba.ddsi.climalert.mapper;


import ar.edu.utn.ba.ddsi.climalert.domain.Clima;
import ar.edu.utn.ba.ddsi.climalert.dto.WeatherResponseDTO;
import java.time.LocalDateTime;

public class ClimaMapper {

  public static Clima toDomain(WeatherResponseDTO dto) {

    Clima clima = new Clima();

    clima.setFechaConsulta(LocalDateTime.now());

    clima.setTemperatura(dto.getCurrent().getTemperatura());

    clima.setHumedad(
        dto.getCurrent().getHumidity().doubleValue()
    );

    clima.setSensacionTermica(
        dto.getCurrent().getSensacionTermica()
    );

    clima.setPresion(
        dto.getCurrent().getPresion()
    );

    clima.setVelocidadViento(
        dto.getCurrent().getVelocidadViento()
    );

    return clima;
  }
}
