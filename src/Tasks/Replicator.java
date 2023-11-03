/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Slot.Slot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Document;

/**
 *
 * @author Maria S
 */

public class Replicator extends Task {
    public Replicator(int numSalidas) {
        super(1, numSalidas);  // Una entrada y n salidas
    }

    public void replicate() {
        // Distribuir la entrada a todas las salidas
        Slot entrada = getEntrada(0);  // Obtener la entrada
        for (int i = 0; i < salidas.length; i++) {
            setSalida(i, entrada);  // Copiar la entrada en cada salida
        }
    }
}