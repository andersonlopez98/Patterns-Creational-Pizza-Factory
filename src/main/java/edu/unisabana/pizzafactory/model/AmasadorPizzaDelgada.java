
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe , andersonlopez
 */
public class AmasadorPizzaDelgada implements AmasadorPizza {

  public void amasar() {
    Logger.getLogger(AmasadorPizzaDelgada.class.getName())
        .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");

    // CODIGO DE LLAMADO AL MICROCONTROLADOR

  }

}
