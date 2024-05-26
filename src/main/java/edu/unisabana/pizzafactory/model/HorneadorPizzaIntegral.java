package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements HorneadorPizza {
  public void hornear() {
    Logger.getLogger(HorneadorPizzaIntegral.class.getName())
        .log(Level.INFO, "[~~] Horneando la pizza integral con masa convencional.");
    // CODIGO DE LLAMADO AL MICROCONTROLADOR
  }
}
