/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;

/**
 *
 * @author Maria S
 */
public class Slot {
    private final List<Document> listaDoc;

    public Slot() {
        listaDoc = new ArrayList<>();
    }
    
    public void introducirDoc(Document doc){
        listaDoc.add(doc);
    }
    public Document obtenerDoc() throws XPathExpressionException
    {
         return listaDoc.get(0);
    }
    public List<Document> getListaDoc()
    {
        return this.listaDoc;
    }
}
