package ar.edu.utn.ba.ddsi.climalert.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentDTO {
  @JsonProperty("temp_c")
  private Double temperatura;

  private Double humidity;

  @JsonProperty("feelslike_c")
  private Double sensacionTermica;

  @JsonProperty("pressure_mb")
  private Double presion;

  @JsonProperty("wind_kph")
  private Double velocidadViento;
}
