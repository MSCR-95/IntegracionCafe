package Tasks;

import Slot.Slot;

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