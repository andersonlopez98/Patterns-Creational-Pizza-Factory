package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andersonlopez
 */
public class HorneadorPizzaGruesa implements HorneadorPizza {
  public void hornear() {
    Logger.getLogger(HorneadorPizzaGruesa.class.getName())
        .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa convencional.");
    // CODIGO DE LLAMADO AL MICROCONTROLADOR
  }
}
