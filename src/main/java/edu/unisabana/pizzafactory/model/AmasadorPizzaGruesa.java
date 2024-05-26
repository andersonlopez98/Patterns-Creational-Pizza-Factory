package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andersonlopez
 */
public class AmasadorPizzaGruesa implements AmasadorPizza {
  public void amasar() {
    Logger.getLogger(AmasadorPizzaGruesa.class.getName())
        .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa convencional.");
    // CODIGO DE LLAMADO AL MICROCONTROLADOR
  }
}