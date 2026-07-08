package ar.edu.utn.ba.ddsi.climalert.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Clima {

  private LocalDateTime fechaConsulta;
  private Double temperatura;
  private Double humedad;
  private Double sensacionTermica;
  private Double presion;
  private Double velocidadViento;

  public boolean esCritico() {
    return temperatura > 35 && humedad > 60;
  }
}