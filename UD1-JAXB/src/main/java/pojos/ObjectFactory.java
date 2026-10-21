//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.10.20 a las 09:41:20 AM CEST 
//


package pojos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pojos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Root_QNAME = new QName("http://xml.netbeans.org/schema/schema", "Root");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pojos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoRoot }
     * 
     */
    public TipoRoot createTipoRoot() {
        return new TipoRoot();
    }

    /**
     * Create an instance of {@link TipoListaPersona }
     * 
     */
    public TipoListaPersona createTipoListaPersona() {
        return new TipoListaPersona();
    }

    /**
     * Create an instance of {@link TipoListaNegocio }
     * 
     */
    public TipoListaNegocio createTipoListaNegocio() {
        return new TipoListaNegocio();
    }

    /**
     * Create an instance of {@link TipoNegocio }
     * 
     */
    public TipoNegocio createTipoNegocio() {
        return new TipoNegocio();
    }

    /**
     * Create an instance of {@link TipoPersona }
     * 
     */
    public TipoPersona createTipoPersona() {
        return new TipoPersona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/schema", name = "Root")
    public JAXBElement<TipoRoot> createRoot(TipoRoot value) {
        return new JAXBElement<TipoRoot>(_Root_QNAME, TipoRoot.class, null, value);
    }

}
