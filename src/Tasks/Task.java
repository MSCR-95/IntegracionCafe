package Tasks;

import Slot.Slot;
import org.w3c.dom.Document;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

/**
 *
 * @author Maria S
 */
public class Task {

    protected Slot[] entradas;
    protected Slot[] salidas;

    public Task(int numEntradas, int numSalidas) {
        entradas = new Slot[numEntradas];
        salidas = new Slot[numSalidas];
    }

    public void setEntrada(int indice, Slot slot) {
        if (indice >= 0 && indice < entradas.length) {
            entradas[indice] = slot;
        } else {
            throw new IllegalArgumentException("Índice de entrada no válido: " + indice);
        }
    }

    public Slot getEntrada(int indice) {
        if (indice >= 0 && indice < entradas.length) {
            return entradas[indice];
        } else {
            throw new IllegalArgumentException("Índice de entrada no válido: " + indice);
        }
    }

    public void setSalida(int indice, Slot slot) {
        if (indice >= 0 && indice < salidas.length) {
            salidas[indice] = slot;
        } else {
            throw new IllegalArgumentException("Índice de salida no válido: " + indice);
        }
    }

    public Slot getSalida(int indice) {
        if (indice >= 0 && indice < salidas.length) {
            return salidas[indice];
        } else {
            throw new IllegalArgumentException("Índice de salida no válido: " + indice);
        }
    }

    public void printXmlDocument(Document document) {
        DOMImplementationLS domImplementationLS = (DOMImplementationLS) document.getImplementation();
        LSSerializer lsSerializer = domImplementationLS.createLSSerializer();
        String string = lsSerializer.writeToString(document);
        System.out.println("-----LA PARTE DE LA TRADUCCIÓN");
        System.out.println(string + "\n");
    }

}
