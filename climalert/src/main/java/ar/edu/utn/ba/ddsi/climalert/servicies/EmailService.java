package ar.edu.utn.ba.ddsi.climalert.servicies;
import ar.edu.utn.ba.ddsi.climalert.domain.Clima;

public interface EmailService {
  void enviarAlerta(Clima clima);
}