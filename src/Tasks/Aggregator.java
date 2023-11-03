package Tasks;

import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Maria S
 */

public class Aggregator extends Task {

    public Aggregator(int numEntradas, int numSalidas) {
        super(numEntradas, numSalidas);
    }

    public Document Aggrega() throws XPathExpressionException, ParserConfigurationException {
        List<Document> auxOrdenes = getEntrada(0).getListaDoc();
        String raiz = getEntrada(0).obtenerDoc().getFirstChild().getNodeName();
        String etDrinks = auxOrdenes.get(0).getElementsByTagName("drinks").item(0).getNodeName();
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document xmldoc = docBuilder.newDocument();
        Node root, drinks, drink, order = xmldoc.importNode(getEntrada(0).obtenerDoc().getElementsByTagName("order_id").item(0), true);
        root = xmldoc.createElement(raiz);
        xmldoc.appendChild(root);

        // Cada comanda tiene el mismo id
        root.appendChild(order);
        drinks = xmldoc.createElement(etDrinks);
        root.appendChild(drinks);
        NodeList bebidas = auxOrdenes.get(0).getElementsByTagName("drink");
        int noBebidas = bebidas.getLength();

        for (int i = 0; i < noBebidas; i++) {
            drink = xmldoc.importNode(bebidas.item(i), true);
            drinks.appendChild(drink);
        }

        printXmlDocument(xmldoc);
        setSalida(0, xmldoc);  // Establecer el documento agregado como salida
        return xmldoc;
    }

    private void setSalida(int i, Document xmldoc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}