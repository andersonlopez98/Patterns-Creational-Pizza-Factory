
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe, andersonlopez
 */
public class HorneadorPizzaDelgada implements HorneadorPizza {
  public void hornear() {
    Logger.getLogger(HorneadorPizzaDelgada.class.getName())
        .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");
    // CODIGO DE LLAMADO AL MICROCONTROLADOR
  }
}
