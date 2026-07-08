package ar.edu.utn.ba.ddsi.climalert.repository;

import ar.edu.utn.ba.ddsi.climalert.domain.Clima;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ClimaRepository {

  private final List<Clima> climas = new ArrayList<>();

  public void guardar(Clima clima) {
    climas.add(clima);
  }

  public Clima ultimo() {

    if (climas.isEmpty()) {
      return null;
    }

    return climas.get(climas.size() - 1);
  }

//  public List<Clima> obtenerTodos() {
//    return climas;
//  }
}
