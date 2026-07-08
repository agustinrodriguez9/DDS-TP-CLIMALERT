package ar.edu.utn.ba.ddsi.climalert.adapter;

import ar.edu.utn.ba.ddsi.climalert.domain.Clima;
import ar.edu.utn.ba.ddsi.climalert.dto.WeatherResponseDTO;
import ar.edu.utn.ba.ddsi.climalert.mapper.ClimaMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherApiAdapter implements ClimaAdapter {

  @Value("${weather.api.url}")
  private String url;

  @Value("${weather.api.key}")
  private String apiKey;

  @Value("${weather.api.location}")
  private String location;

  private final RestTemplate restTemplate = new RestTemplate();

  @Override
  public Clima obtenerClimaActual() {

    String endpoint = url + "?key=" + apiKey + "&q=" + location;

    WeatherResponseDTO dto = restTemplate.getForObject(endpoint, WeatherResponseDTO.class);

    return ClimaMapper.toDomain(dto);
  }
}