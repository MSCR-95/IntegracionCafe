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
    
    public Replicator(Slot entrada, int numSalidas) {
        //Creamos una lista inmutable con un solo elemento, entrada
        super(Collections.singletonList(entrada), generarSalidas(entrada, numSalidas));
    }

    private static List<Slot> generarSalidas(Slot entrada, int numSalidas) {
        
        List<Slot> salidas = new ArrayList<>();
        
        for (int i = 0; i < numSalidas; i++) {
         
            Slot copiaEntrada = new Slot();         //Copiamos la entrada para crear las salidas
            for (Document doc : entrada.getListaDoc()) {
                copiaEntrada.introducirDoc(doc);    //Copiamos los documentos de la entrada a la salida
            }
            salidas.add(copiaEntrada);  //Copiamos la entrada por cada salida que tengamos
        }
        return salidas;
    }
}